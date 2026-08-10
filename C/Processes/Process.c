#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>

int main(){

	pid_t pid = fork() ;

	if(pid == 0){

		printf(" ------IN Child Processeses-------\n");
		printf("\n Id of Parent Process: %d\n",getppid());
	       printf("Id of Child Process : %d\n", getpid()) ;

	}
	else{
		printf("------In Parent Process-------");
		printf(" Id of Child Process: %d\n",pid) ;
		printf(" Id of Parent Process: %d\n",getpid()) ;
		printf("ID of Parent of Parent Processs: %d\n", getppid());

		sleep(5);
		
	}

	return 0;

}
