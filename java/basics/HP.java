import java.util.Scanner;
public class HP {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 double n = scn.nextInt() ;
	 
	 double sum = 0;
	 
	 double i = 1;
	 for (i=1;i<=n; i++)
	sum = sum + 1/i;	 
	 
		 System.out.println(sum);
	} 
}