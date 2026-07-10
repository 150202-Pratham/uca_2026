#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#include "sorting.h"
#include "generator.h"
#include "timer.h"

#define ITERATIONS 8

int sizes[ITERATIONS] = {
    8000,
    12000,
    16000,
    20000,
    24000,
    28000,
    32000,
    36000
};

/*--------------------------------------------------
    Wrapper Functions
--------------------------------------------------*/

void quickWrapper(int arr[], int n)
{
    quickSort(arr, 0, n - 1);
}

void mergeWrapper(int arr[], int n)
{
    mergeSort(arr, 0, n - 1);
}

/*--------------------------------------------------
    Benchmark Function
--------------------------------------------------*/

void benchmark(
        FILE *fp,
        char algorithm[],
        void (*sortFunction)(int[], int))
{
    printf("\nRunning %s...\n", algorithm);

    for(int i = 0; i < ITERATIONS; i++)
    {
        int n = sizes[i];

        int *original = (int *)malloc(sizeof(int) * n);
        int *copy = (int *)malloc(sizeof(int) * n);

        if(original == NULL || copy == NULL)
        {
            printf("Memory Allocation Failed\n");
            exit(1);
        }

        /*---------------- RANDOM ----------------*/

        generateRandom(original, n);

        copyArray(original, copy, n);

        double start = startTimer();

        sortFunction(copy, n);

        double time = stopTimer(start);

        printf("%s Random %d -> %.3lf ms\n",
                algorithm,
                n,
                time);

        fprintf(fp,
                "%s,Random,%d,%.3lf\n",
                algorithm,
                n,
                time);

        /*--------------- ASCENDING ---------------*/

        generateAscending(original, n);

        copyArray(original, copy, n);

        start = startTimer();

        sortFunction(copy, n);

        time = stopTimer(start);

        printf("%s Ascending %d -> %.3lf ms\n",
                algorithm,
                n,
                time);

        fprintf(fp,
                "%s,Ascending,%d,%.3lf\n",
                algorithm,
                n,
                time);

        /*-------------- DESCENDING ---------------*/

        generateDescending(original, n);

        copyArray(original, copy, n);

        start = startTimer();

        sortFunction(copy, n);

        time = stopTimer(start);

        printf("%s Descending %d -> %.3lf ms\n",
                algorithm,
                n,
                time);

        fprintf(fp,
                "%s,Descending,%d,%.3lf\n",
                algorithm,
                n,
                time);

        free(original);
        free(copy);
    }
}

/*--------------------------------------------------
                    MAIN
--------------------------------------------------*/

int main()
{
    srand(time(NULL));

    FILE *fp = fopen("results.csv", "w");

    if(fp == NULL)
    {
        printf("Unable to Create CSV File\n");
        return 1;
    }

    fprintf(fp,
            "Algorithm,InputType,Size,Time(ms)\n");

    benchmark(fp, "Bubble", bubbleSort);

    benchmark(fp, "Insertion", insertionSort);

    benchmark(fp, "Selection", selectionSort);

    benchmark(fp, "Quick", quickWrapper);

    benchmark(fp, "Merge", mergeWrapper);

    fclose(fp);

    printf("\n======================================\n");
    printf("Benchmark Completed Successfully\n");
    printf("Results saved to results.csv\n");
    printf("======================================\n");

    return 0;
}
