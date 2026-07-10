#ifndef TIMER_H
#define TIMER_H


double startTimer();
double stopTimer(double start);

double getExecutionTime(
    
   void (*sortFunction)(int *, int),
    int arr[],
    int n
);

#endif
