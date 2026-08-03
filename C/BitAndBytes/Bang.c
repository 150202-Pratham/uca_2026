#include<stdio.h>
#include<stdlib.h>
int bang(int x) {
    return ((x | (~x + 1)) >> 31) + 1;
}

int main(int argc , char *argv){
	
	if(argc<1){
		printf("Enter the Correct Number of Arguments") ;
		return 1 ;
	}

	printf("%d", bang(argv[1])) ;
	return 0 ;
}


