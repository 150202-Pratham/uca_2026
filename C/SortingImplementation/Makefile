CC = gcc

CFLAGS = -Wall -Wextra -O2

TARGET = complexity_analysis

SRCS = main.c sorting.c generator.c timer.c

OBJS = $(SRCS:.c=.o)

$(TARGET): $(OBJS)
	$(CC) $(CFLAGS) -o $(TARGET) $(OBJS)

main.o: main.c sorting.h generator.h timer.h
	$(CC) $(CFLAGS) -c main.c

sorting.o: sorting.c sorting.h
	$(CC) $(CFLAGS) -c sorting.c

generator.o: generator.c generator.h
	$(CC) $(CFLAGS) -c generator.c

timer.o: timer.c timer.h
	$(CC) $(CFLAGS) -c timer.c

clean:
	rm -f *.o $(TARGET) results.csv

run: $(TARGET)
	./$(TARGET)
