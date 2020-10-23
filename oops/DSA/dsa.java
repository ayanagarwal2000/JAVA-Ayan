public class dsa{
	public static void main (String [] args) throws Exception{
		stackusingarray stack=new stackusingarray(5);
		stackusingarray s1=new stackusingarray(5); 
		System.out.println("Size = " + stack.size());
		System.out.println("Status = " + stack.isEmpty());
	    stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.display();
		
		
		System.out.println("Top = " + stack.topdisplay());
		stack.pop();
		stack.pop();
	
		stack.display();
		System.out.println("Top = " + stack.topdisplay());
		
		System.out.print("Peek = ");
		stack.peek();
		
}
}