#include <stdio.h>

void urlify(char str[], int trueLength) {

    int spaces = 0;

    for (int i = 0; i < trueLength; i++) {

        if (str[i] == ' ')
            spaces++;

    }

    int index = trueLength + spaces * 2;

    str[index] = '\0';

    for (int i = trueLength - 1; i >= 0; i--) {

        if (str[i] == ' ') {

            str[index - 1] = '0';
            str[index - 2] = '2';
            str[index - 3] = '%';

            index -= 3;

        } else {

            str[index - 1] = str[i];
            index--;

        }
    }
}

int main() {

    char str[50] = "Embedded Systems";

    urlify(str, 16);

    printf("%s\n", str);

    return 0;
}


