import java.util.* ;

class  PostFix{
       public static int Evaluate( String art ){
		
	       Stack<Integer> st = new Stack<>() ;

	       for( char ch : art.toCharArray()){

		       if(Character.isDigit(ch))
		       {
			       st.push(ch - '0' ) ;
		       }


		       else{

			       int a = st.pop() ;
			       int b = st.pop() ;
			       int result = 0 ;

			       switch(ch){
				       
				       case '+' :
					       result = a+b ;
					       st.push(a+b);
		                	        break ;
				 	case '-' : 
					       result = a-b;
					       st.push(result);
					       break ;
					case '*' : 
					       result = a*b ;
					       st.push(result) ;
					       break;
					case '/' :
					       result = a/b ;
					       st.push(result); 
					       break ;
			       }

		       }

	       }

	    return st.pop() ;

       }


	public static void main(String []args){

		String art = "231*+9-" ;

		PostFix postfix = new PostFix() ;

		System.out.println(postfix.Evaluate(art)) ;

	}

}



