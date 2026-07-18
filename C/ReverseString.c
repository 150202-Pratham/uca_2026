#include <stdio.h>
#include <string.h>

int main() {

    int n;
    scanf("%d", &n);

    getchar();              

    char ch[n + 1];

    fgets(ch, sizeof(ch), stdin);

    ch[strcspn(ch, "\n")] = '\0';

    int i = 0;
    int j = strlen(ch) - 1;

    while (i < j) {

        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        i++;
        j--;
    }

    printf("%s\n", ch);

    return 0;
}


