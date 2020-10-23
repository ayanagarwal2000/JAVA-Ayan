import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 int n = scn.nextInt() ;
	
	 for (int a =1; a <=n; a++) {
	for (int i =n; i >=a; i--) {
	System.out.print(" ");	}
		 
	 for (int row =1; row <=a; row++) {
	  
	
	System.out.print("*");
	 
	 }
	 for (int row =1; row <=(a-1); row++) {
	  
   
	System.out.print("*");
	
	 }
	 
	 System.out.println();
	 }
	 
	 
	 
	 
	  for (int a =1; a <=n+1; a++) {
	for (int i =1; i <=a; i++) {
	System.out.print(" ");	}
		 
	 for (int row =n-1; row >=a; row--) {
	  
	
	System.out.print("*");
	 
	 }
	 for (int row =(n); row >=(a); row--) {
	  
	
	System.out.print("*");
	 
	 }
	 
	 System.out.println();
	 }
	}
 }