import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 int n = scn.nextInt() ;
	 
	 
	 for (int a =1; a <=n; a++) {
	 for (int row =1; row <=a; row++) {
	
	 System.out.print(row);
	 
	 }
	
	 
	 
	 int b = (n-a);
	 
	 for (int ro =b; ro >=1; ro--) {
	 
	 System.out.print("*");
	 }
	
	 
	 System.out.println("");
	 }
	 
}
}