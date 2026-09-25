class IntersectionLL{


	public static  Node head ;
	public static  Node tail ;

	public static  class Node{

		public int value ;
		public Node next ;

		public Node( int value ){

			this.value = value ;
		}

	}

	public static  void insertAtHead( int value ){

		if(head == null){

			Node newNode = new Node( value ) ;

			return ;
		}

		Node newNode = new Node(value) ;

		newNode.next = head ;

		head = newNode ;

	}

	public static void display(Node head ){

		Node temp = head ;

		while(temp!=null){

			System.out.print( temp.value + "->") ;
                        
			temp = temp.next ;
		}

	}



	public static  Node  intersection(Node List1 , Node List2 ){


		Node head1 = List1 ;
		Node head2 = List2 ;
                
		Node output = new Node(-1) ;
		Node temp = output ;

		while(head1 != null && head2!=null ){

			if(head1.value == head2.value ){

				temp.next = new Node( head1.value ) ;
				temp = temp.next ;

				head1 = head1.next ;
				head2 = head2.next ;
			}

			else if( head1.value < head2.value ){

				head1 = head1.next ;
			}

			else{

				head2 = head2.next ;
			}

		}

		return output.next ;


	}
	
	public static void main(String[] args) {

    IntersectionLL list = new IntersectionLL();

    
    Node head1 = new Node(1);
    head1.next = new Node(2);
    head1.next.next = new Node(4);
    head1.next.next.next = new Node(6);
    head1.next.next.next.next = new Node(8);

   
    Node head2 = new Node(2);
    head2.next = new Node(4);
    head2.next.next = new Node(5);
    head2.next.next.next = new Node(8);
    head2.next.next.next.next = new Node(10);

    
    Node result = list.intersection(head1, head2);

    
    list.display(result);
}

}
