#include<stdio.h>
#include<stdlib.h>

int logicalShift(int x, int n) {
    int mask = ~((~0) << (32 + (~n + 1)));
    return (x >> n) & mask;
}

int main(int argc , char * argv ){

	if(argc < 2){

		printf("Enter Sufficient Paramameters") ;
		return 1 ;
	}

	printf("%d" , logicalShift(argv[1] , argv[2])) ;
	return 0 ;

}


