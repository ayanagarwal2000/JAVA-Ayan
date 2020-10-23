import java.util.Scanner;
public class AM {
 public static void main (String [] arg) {
	Scanner scn = new Scanner (System.in);
	System.out.println("Value 1 = ");
     double a = scn.nextInt() ; 
System.out.println("Value 2 = ");	 
	 double b = scn.nextInt() ;
	 System.out.println("Value 3 = ");
	 double c = scn.nextInt() ;
	 System.out.println("Value 4 = ");
	 double d = scn.nextInt() ;
	 System.out.println("Value 5 = ");
	 double e = scn.nextInt() ;
	 double am = (a+b+c+d+e)/5;
	 System.out.println("Arithmatic Mean = " + am);
	 
 }
} 
  