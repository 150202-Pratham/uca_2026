class ReverseLL {

	public Node head ;
	public Node tail ;
	int size ;

	public static class Node{

		int value ;
		Node next ;

		public Node(int value){

	 		this.value = value ;

		}
	}

	
	public ReverseLL(){

		this.size = 0 ;
	} 

	public Node reverseLL(Node head){

		if(head==null || head.next==null ){


			return head ;
		}
		
		Node newHead = reverseLL(head.next) ;

		head.next.next = head  ;

		head.next = null ;

		return newHead ;
	}


	public void display( Node output ){

		Node temp = output ;

		while(temp!=null){

		   System.out.println(temp.value + "->") ;
 		   temp = temp.next ;

		}

        }

	public void insertAtHead ( int value ){

		if(head == null ){

			Node head = new Node(value) ;
			return ;

		}
              

	       Node node = new Node(value) ;

	       node.next = head ;
	       
	       head = node ;

	       size++ ;

	}


	public static void main (String []args ){

		ReverseLL initNode = new ReverseLL() ;
                
	        initNode.insertAtHead( 1 ) ;
 		initNode.insertAtHead( 2) ;
		initNode.insertAtHead( 3 ) ;
                initNode.insertAtHead( 4 ) ;
                initNode.insertAtHead( 5 ) ;

                
                Node outputHead = initNode.reverseLL(initNode.head) ;
             
                initNode.display(outputHead) ;
 

            

	}

}

