import java.util.*;

class FindNumbers{

	public static int findNumber(int [] arr){

		Map<Integer,Integer> map = new HashMap<>() ;

		for(int elem : arr){

			map.put(elem , map.getOrDefault(elem , 0)+1) ;
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()){

			if(entry.getValue()==4){

				return entry.getKey();
			}
		
		}

		return -1 ;

	}


	public static void main(String[] args){

		FindNumbers num = new FindNumbers();

		int []arr = {1,2,3,4,1,2,4,1,2,3,4,3,3} ;

		System.out.println( num.findNumber(arr)) ;
	}
}


