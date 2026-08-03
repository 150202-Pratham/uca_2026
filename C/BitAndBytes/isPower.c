#include <stdio.h>
#include <stdlib.h>

int isPower2(int x) {
    int sign = (x >> 31) & 1;          // 1 if negative
    int nonZero = !!x;                 // 1 if x != 0
    int oneBit = !(x & (x + ~0));      // x & (x-1) == 0 ?
    return nonZero & !sign & oneBit;
}

int main(int argc, char *argv[]) {

    if (argc != 2) {
        printf("Usage: %s <integer>\n", argv[0]);
        return 1;
    }

    int x = atoi(argv[1]);

    printf("Input  : %d\n", x);
    printf("Output : %d\n", isPower2(x));

    return 0;
}
