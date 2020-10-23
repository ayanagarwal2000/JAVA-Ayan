import java.util.Scanner;
public class circle {

 public static void main (String [] arg) {
	 System.out.println("Radius = ");
	 Scanner scn = new Scanner (System.in);
	 double r = scn.nextInt() ;
	 double a = (3.14)*r*r;
	 double c = (6.28)*r;
	 System.out.println("Length of Rectangle/Square = ");
	 double l = scn.nextInt() ;
	 System.out.println("Width of Rectangle");
	 double b = scn.nextInt() ;
	 double ar = l*b;
	 double as = l*l;
	 System.out.println("Area Of The Circle = " + a);
	 System.out.println("Circumfrence Of Circle = " + c);
     System.out.println("Area Of The Rectangle = " + ar);
     System.out.println("Area Of The Square = " + as);	 
 }
}
	 