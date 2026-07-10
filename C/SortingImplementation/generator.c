#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "generator.h"

void generateRandom(int arr[], int n)
{
    for(int i = 0; i < n; i++)
    {
        arr[i] = rand() % 100000;
    }
}

void generateAscending(int arr[], int n)
{
    for(int i = 0; i < n; i++)
    {
        arr[i] = i;
    }
}


void generateDescending(int arr[], int n)
{
    int value = n;

    for(int i = 0; i < n; i++)
    {
        arr[i] = value--;
    }
}

	
void copyArray(int src[], int dest[], int n)
{
    for(int i = 0; i < n; i++)
    {
        dest[i] = src[i];
    }
}


