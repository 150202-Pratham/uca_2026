#include<stdio.h>
#include<stdlib.h>

int sign(int x) {
    return (x >> 31) | (!!x & ~(x >> 31));
}
int main(int argc, char *argv[] ){
	
	if(argc !=2 ){
	       	printf("Enter the Valid no of Arguments ");
	       return 1 ;
	}

	int x = atoi(argv[1]) ;
	printf("%d", sign(x)) ;

	return 0 ;
}

