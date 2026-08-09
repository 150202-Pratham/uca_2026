import java.util.*;


class HeapSort< T extends Comparable<T>>{

	List<T> list ;

	public HeapSort(){

		list = new ArrayList<>() ;
	}

	public int getParent( int index ) {

		return  ( index - 1 ) /2 ;
	}

	public int Left ( int index ) {
		return ( index *2 ) +1 ;
	}

	public int Right ( int index ) {
		return ( index * 2 ) + 2 ;
	}

	public void insert ( T value ) {

		list.add(value ) ;

		upHeap( list.size() -1 ) ;
	}

	public void swap (int index , int pIndex ) {

		T temp = list.get( index ) ;
		
		list.set( index , list.get( pIndex ) ) ;
		
		list.set( pIndex , temp ) ;
	}


	public void upHeap ( int index ) {

		if( index == 0 ) return ;

		int p = getParent( index ) ;
		
		if( list.get( index).compareTo( list.get( p )) < 0 ){

			swap( index , p ) ;

			upHeap( p ) ;

		}
	}

	public void downHeap ( int index ){

		int min = index ;
		int left = Left( index ) ;
		int right = Right( index ) ;
 		
		if( left < list.size() && list.get(min).compareTo(list.get(left))>0){
			min = left ;
		}

		if( right< list.size() && list.get(min).compareTo(list.get(right))>0){
			min = right ;
		}

		if(min!=index){

			swap(min , index) ;
			downHeap(min) ;
		}

	}

	public T remove() throws Exception{

		if(list.isEmpty()){

			throw new Exception( "List is Empty") ;
		}

		T temp = list.get(0) ;

	        T last = list.get(list.size()-1) ; 

		if( !list.isEmpty()){

			list.set(0,last) ;
			downHeap(0);
		}

		return temp ;
	}


	public List<T> heapSort() throws Exception{

		List<T> result = new ArrayList<>() ;
		
		while(!list.isEmpty()){
			result.add(this.remove()) ;
		}

                		
		return result ;
	}


	public static void main(String []args) throws Exception{

		HeapSort<Integer> heap = new HeapSort<>();

		heap.insert(16);
		heap.insert(14);
		heap.insert(10);
		heap.insert(8);
		heap.insert(7);
		heap.insert(9);
		heap.insert(3);
		heap.insert(2);
		heap.insert(4);
		
	      List<Integer> output = heap.heapSort() ;

	      System.out.println( output ) ;
	}
}





		






