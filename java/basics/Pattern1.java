import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 int n = scn.nextInt() ;
	
	 for (int a =n; a >=1; a--) {
	 for (int row =1; row <=a; row++) {
	 
	 System.out.print("*");
	
	 
	 }
	 
	 System.out.println("");
	 }
	}
 }