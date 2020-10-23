import java.util.Scanner;
class swapfn {
	public static void main (String[] args){
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number to swap");
		
	 int n = scn.nextInt()   ;
	 //int b = scn.nextInt()   ;
	 int one = (n%10);
	 int two=(n-one)/10;
	 System.out.println(one); //number at ones place 
	 System.out.println(two); //number at tens place
	 swap(two,one); //there one and two have nothing to do with the variables ith the function.
	 
	 
		
	}
	public static void swap(int one,int two){
		int temp=one; //just to save the value of one
		one=two;
		two=temp;
		System.out.println(one+""+two);
		

		
	}
}