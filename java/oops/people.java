public class people{
	public static void main (String [] args){
		person p1=new person();
		person p2=new person();
		person p3=new person(10,"Kuhu");
		
		p1.setname("Ayan");
		p1.setage(20);
		
		
	    System.out.println(p1.getname());
		System.out.println(p1.getage());
		
		System.out.println(p2.getname());
		System.out.println(p2.getage()); 
		
		System.out.println(p3.getname());
		System.out.println(p3.getage());
	} 
	
	

}