import java.util.Scanner;
public class grade {
public static void main (String [] arg) {
  
Scanner scn = new Scanner (System.in);
     int p = scn.nextInt() ; 
	if (p >= 90 && p <= 100) 
	{
		System.out.println("A+");
	}
	else if (p >= 80 && p <= 89)
		{
			System.out.println("A");
	     }
	else if (p >= 75 && p <= 79) 
	{ 
      System.out.println("B+");
	} 
	else if (p >= 70 && p <= 74) 
	{
		System.out.println("B");
	} 
	else if (p >= 50 && p <= 60) 
	{
		System.out.println("C");
	} 
	else if (p >= 33 && p <= 49) 
	{
		System.out.println("D");
	} 
	else if (p >= 0 && p <= 32)
		{
			System.out.println("FAIL");
	}
}

}
	