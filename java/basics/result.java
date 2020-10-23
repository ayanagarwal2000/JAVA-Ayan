 import java.util.Scanner;
public class result {
 public static void main (String [] arg) {
	Scanner scn = new Scanner (System.in);
	System.out.println("English = ");
     double a = scn.nextInt() ; 
System.out.println("Physics = ");	 
	 double b = scn.nextInt() ;
	 System.out.println("Chemistry = ");
	 double c = scn.nextInt() ;
	 System.out.println("Maths = ");
	 double d = scn.nextInt() ;
	 System.out.println("Biology = ");
	 double e = scn.nextInt() ;
	 
	 double p = (a+b+c+d+e)/5 ;
    System.out.println("Percentage = " + p);
	
	
	if (p >= 90 && p <= 100) 
	{
		System.out.println("Grade = A+");
	}
	else if (p >= 80 && p <= 89)
		{
			System.out.println("Grade = A");
	     }
	else if (p >= 75 && p <= 79) 
	{ 
      System.out.println("Grade = B+");
	} 
	else if (p >= 70 && p <= 74) 
	{
		System.out.println("Grade = B");
	} 
	else if (p >= 50 && p <= 60) 
	{
		System.out.println("Grade = C");
	} 
	else if (p >= 33 && p <= 49) 
	{
		System.out.println("Grade = D");
	} 
	else if (p >= 0 && p <= 32)
		{
			System.out.println("FAIL");
	}
 }	
 
}