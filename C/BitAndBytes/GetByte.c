#include<stdio.h>
#include<stdlib.h>
int getByte(int x, int n) {
    return (x >> (n << 3)) & 0xFF;
}
int main(int argc , char *argv){

	if(argc < 2){
		printf("Enter Sufficient arguments");
		return 1 ;
	}

       printf("%d" , getByte(argv[1] , argv[2])) ;
       return 0 ;


}





