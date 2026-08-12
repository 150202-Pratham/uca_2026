#include <stdio.h>
#include <string.h>

char table[] =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    "abcdefghijklmnopqrstuvwxyz"
    "0123456789+/";

void base64Encode(char *input) {

    int len = strlen(input);

    for (int i = 0; i < len; i += 3) {

        unsigned char b1 = input[i];
        unsigned char b2 = (i + 1 < len) ? input[i + 1] : 0;
        unsigned char b3 = (i + 2 < len) ? input[i + 2] : 0;

        int x1 = b1 >> 2;
        int x2 = ((b1 & 3) << 4) | (b2 >> 4);
        int x3 = ((b2 & 15) << 2) | (b3 >> 6);
        int x4 = b3 & 63;

        printf("%c", table[x1]);
        printf("%c", table[x2]);

        if (i + 1 < len)
            printf("%c", table[x3]);
        else
            printf("=");

        if (i + 2 < len)
            printf("%c", table[x4]);
        else
            printf("=");
    }

    printf("\n");
}

int main() {

    char input[1000];

    scanf("%[^\n]", input);

    base64Encode(input);

    return 0;
}   
