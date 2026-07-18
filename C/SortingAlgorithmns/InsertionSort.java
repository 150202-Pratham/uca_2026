
import java.util.*;


public class InsertionSort{
	public static void sort(int []arr){

		for(int i = 1 ; i<arr.length ; i++){

			for(int j = 1 ; j>0 ; j--){
				
				if(arr[j-1]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1] ;
					arr[j-1] = temp ;
				}

			}
		}
	}



	public static void main(String []args){
		int []arr= {64,25,11,22,12};
		
		sort(arr) ;

	     System.out.println(Arrays.toString(arr)) ;


	}
}


