import java.util.*; 

class BalancedParenthesis{

	public static boolean examineString(String str){
		
		Stack<Character> st = new Stack<>() ;

		for(char ch : str.toCharArray()){

			if(ch=='['  || ch=='{' || ch=='(' ){

				st.push(ch) ;
			}

			else{
			    
				if(st.isEmpty()) {

				 	return false  ;
				}

				char output = st.pop() ;

				if( (ch=='}' && output!='{' ) || (ch==']' && output!= '[') || (ch==')' && output!='(' )){
				
				   return false ;
				}

			}

		}


		return st.isEmpty() ;
	}

	public static void main (String []args){


	 	String str = "[()]{}{()()}" ;

		BalancedParenthesis bp = new BalancedParenthesis() ;

	        System.out.println(bp.examineString(str)) ;


	}

}


