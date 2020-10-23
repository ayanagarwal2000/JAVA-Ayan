import java.util.Scanner;
public class prime {

 public static void main (String [] arg) {
	 Scanner scn = new Scanner (System.in);
     double a = scn.nextInt() ;
	 int d = 2;
	 
	 for (d=2; d <= a-1; d++);
	 //d = d + 1 ;
   
   if (a % d == 0) {System.out.print("COMPOSITE");
   } else {System.out.print("PRIME");}
   
 }
 
} 