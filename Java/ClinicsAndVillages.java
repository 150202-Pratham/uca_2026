import java.util.*;

class ClinicsAndVillages{

	public static int calculateLoad( int []pop , int k , int mid ){

		int clinics = 0 ;

		for(int p : pop){

			clinics+= (int) Math.ceil( (double) p/mid );

			if(clinics > k ) break ;
		}

		return clinics ;
	}

	public static  int findMinMaxLoad( int []pop , int k ){
		
		int low = 1 ;
		int high = 0 ;
 		int ans = -1 ;

		for(int p : pop){

			high = Math.max( high, p) ;
		}

		while(low<=high){

			int mid = low+(high-low)/2 ;

			int totalClinics = calculateLoad( pop , k , mid ) ;

			if( totalClinics <= k ){

				ans = mid ;
				high = mid -1 ;
			}

			else {

				low = mid+1 ;
			}
		}

		return ans ;
	}

	public static void main(String []args){

		int []pop = {100,200,300} ;
		int k = 6 ;

		System.out.println( findMinMaxLoad(pop, k)) ;
	}
}




