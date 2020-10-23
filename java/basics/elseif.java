import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		
	Scanner scn = new Scanner (System.in);
     int age = scn.nextInt() ;
	 if (age <= 11) {
		 System.out.print("Child");
	 } else if (age >= 12 && age <= 17) {System.out.print("Teenager");
	 } else if (age >= 18 && age <= 60) {System.out.print("Adult");
	 } else {System.out.print("old");
	 }

	
     System.out.print("");
	}

}