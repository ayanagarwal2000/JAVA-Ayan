import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 int n = scn.nextInt() ;
	for (int a=1; a<=n ; a++){
	for (int row = 1; row <=a; row++) {
		System.out.print("*");
	}
	System.out.println();
	}
}
}