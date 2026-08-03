#include <stdio.h>
#include <stdlib.h>

int conditional(int x, int y, int z) {
    int mask = ~!!x + 1;
    return (y & mask) | (z & ~mask);
}

int main(int argc, char *argv[]) {

    if (argc != 4) {
        printf("Usage: %s <x> <y> <z>\n", argv[0]);
        return 1;
    }

    int x = atoi(argv[1]);
    int y = atoi(argv[2]);
    int z = atoi(argv[3]);

    printf("%d\n", conditional(x, y, z));

    return 0;
}
