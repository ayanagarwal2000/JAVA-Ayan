import java.util.Scanner;
public class arithmatic {
 
 public static void main (String [] arg) { 
     Scanner scn = new Scanner (System.in) ;
	 int x = scn.nextInt() ;
	 int y = scn.nextInt() ;
	 int a = x+y;
	 int b = x-y;
	 int c = x*y;
	 double d = x/y;

     System.out.println("sum is " + a);
	 System.out.println("diffrence is " + b);
	 System.out.println("product is " + c);
	 System.out.println("queitent is " + d);
     }

}	 
	 
 