#include <stdio.h>
#include <string.h>
#include <fcntl.h>
#include <unistd.h>

#define LOGFILE "audit.log"
#define BUFFER_SIZE 1024

void printNumber(int num) {
    char temp[20];
    int i = 0;

    if (num == 0) {
        write(STDOUT_FILENO, "0", 1);
        return;
    }

    while (num > 0) {
        temp[i++] = (num % 10) + '0';
        num /= 10;
    }

    while (i--)
        write(STDOUT_FILENO, &temp[i], 1);
}

void addEntry(const char *msg) {

    int fd = open(LOGFILE, O_WRONLY | O_CREAT | O_APPEND, 0644);

    if (fd < 0) {
        perror("open");
        return;
    }

    write(fd, msg, strlen(msg));
    write(fd, "\n", 1);

    close(fd);
}

void viewEntries() {

    int fd = open(LOGFILE, O_RDONLY);

    if (fd < 0) {
        perror("open");
        return;
    }

    char ch;
    int line = 1;

    printNumber(line);
    write(STDOUT_FILENO, ": ", 2);

    while (read(fd, &ch, 1) > 0) {

        write(STDOUT_FILENO, &ch, 1);

        if (ch == '\n') {

            line++;

            if (read(fd, &ch, 1) > 0) {

                printNumber(line);
                write(STDOUT_FILENO, ": ", 2);
                write(STDOUT_FILENO, &ch, 1);
            } else {
                break;
            }
        }
    }

    close(fd);
}

int main(int argc, char *argv[]) {

    if (argc < 2) {
        printf("Usage:\n");
        printf("./auditlog --add \"message\"\n");
        printf("./auditlog --view\n");
        return 1;
    }

    if (strcmp(argv[1], "--add") == 0) {

        if (argc != 3) {
            printf("Usage: ./auditlog --add \"message\"\n");
            return 1;
        }

        addEntry(argv[2]);

    } else if (strcmp(argv[1], "--view") == 0) {

        viewEntries();

    } else {

        printf("Unknown command.\n");
    }

    return 0;
}
