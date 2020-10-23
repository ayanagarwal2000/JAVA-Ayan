import java.util.Scanner;
public class quadeq {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 System.out.println("Enter Coefficient of x^2");
	int a = scn.nextInt() ;
	System.out.println("Enter Coefficient of x");
	int b = scn.nextInt() ;
	System.out.println("Enter Coefficient of x^0");
	int c = scn.nextInt() ;
	System.out.println("1st Root is = ");
	
	System.out.println(((-b)+(Math.pow(((Math.pow(b,2)) - 4*a*c),0.5)))/(2*a));
	
	System.out.println("2nd Root is = ");
	
	System.out.println(((-b)-(Math.pow(((Math.pow(b,2)) - 4*a*c),0.5)))/(2*a));
	
	}
}