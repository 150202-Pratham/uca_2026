#include<stdio.h>
#include<stdlib.h>


int fitsBits(int x, int n) {
    int shift = 32 - n;
    return !(((x << shift) >> shift) ^ x);
}



int main(int argc , char *argv[]){

	if(argc<2){

		printf("Low Numbers of Argument Found") ;
		return 1 ;
	}
	
	int x = atoi(argv[1]);
	int y = atoi(argv[2]) ;

 	printf("%d\n" , fitsBits(x,y)) ;
	return 0 ;
}


