import java.util.Scanner;
public class leapyear {

 public static void main (String [] arg) {
      Scanner scn = new Scanner (System.in);    
	int a = scn.nextInt() ;
   
   if (a % 4 == 0) {System.out.print("LEAP YEAR");
   } else {System.out.print("NON LEAP YEAR");}
   
 }
 
} 