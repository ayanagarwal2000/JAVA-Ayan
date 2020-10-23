import java.util.Scanner;
public class Pattern21 {
public static void main (String [] arg) {
	Scanner scn = new Scanner (System.in);
	 int n = scn.nextInt()   ; //scn.nextInt()
	int a =1;
	while(a<=n) {
		
	for (int b=1; b<=a; b++) {
           
		   System.out.print("*");
	}
	
	
	for (int c=(n+3); c>=(2*a); c--) {
		System.out.print("a");
	}
	
	
	System.out.println("");
	
	 a++;
}


}
}