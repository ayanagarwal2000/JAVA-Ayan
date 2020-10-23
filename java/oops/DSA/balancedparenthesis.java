
import java.util.Stack;
public class balancedparenthesis  {
	public static void main (String [] args) {
		String str="{{{}}}";
		System.out.println(bracket(str));
		
	}
	
	public static boolean bracket(String str) {
		Stack<Character> stack=new Stack<>();
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
				stack.push(str.charAt(i));
			}
			
			
			else if(str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')'){
				if(stack.isEmpty()){
					return false;
				}
				else if (str.charAt(i)=='}'){
					if(str.charAt(i)==stack.peek()){
						stack.pop();
					}
					else{
						return false;
					}
				}
				
				else if (str.charAt(i)==']'){
					if(str.charAt(i)==stack.peek()){
						stack.pop();
					}
					else{
						return false;
					}
				}
				else if (str.charAt(i)==')'){
					if(str.charAt(i)==stack.peek()){
						stack.pop();
					}
					else{
						return false;
					}
				}
			
		    }
		else{}
		
	}
	if(stack.isEmpty()){
		return true;
	}
	else{
		return false;
	}
}
}