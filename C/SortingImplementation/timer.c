#include <time.h>
#include "timer.h"

double startTimer()
{
    return (double)clock();
}

double stopTimer(double start)
{
    return (((double)clock() - start) * 1000.0) / CLOCKS_PER_SEC;
}
