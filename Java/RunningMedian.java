import java.util.*;

class RunningMedian{
	
  	private static  PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
	private static  PriorityQueue<Integer> right = new PriorityQueue<>() ;

	public static  void insert( int num ){


		// Here we will perform inserting operations 
		
	  if(left.isEmpty() || num<=left.peek()){

		left.offer(num) ;
          }
          
	  else right.offer(num) ;
	
	 if(left.size()>right.size()+1){

       		right.offer(left.poll()) ;
	 }
 	
	 if(right.size()>left.size()){

	       left.offer(right.poll()) ;
         }


     }

      public static  float getMedian(){

	      
	      // this we will use to find the median from the data stream
	      	
	     	if( left.size() == right.size() ) {
		       
		  	return ( left.peek() + right.peek()) / 2.0f ;
		}


	return left.peek() ;

      }


      public static void main(String []args){

	      RunningMedian rm = new RunningMedian() ;

	      rm.insert(5);
	      rm.insert(2);
	      rm.insert(3);
	      rm.insert(4);

	      System.out.println(rm.getMedian()) ;
      }

}

