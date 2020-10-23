import java.util.Stack;
public class nextgreaterelement{
	public static void main (String [] args) throws Exception{
		
		int[] arr={2,1,3,8,6,7,5};
		stackusingarray stack=new stackusingarray();
		
		for(int i=0; i<arr.length; i++){
			while(!stack.isEmpty() && arr[i]>stack.peek()){
				int rv =stack.pop();
				System.out.println(rv + "->" + arr[i]);
				
			}
			
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()){
			int rv =stack.pop();
			System.out.println(rv + "->" + "-1");
		}
}
}