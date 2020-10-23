import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 int n = scn.nextInt() ;
	 //int a =0;
	 int b =1;
	 int i = 0;
	 for (i=0;i<=n; i++)
	 System.out.println(i);
 
     int sum = i+b;
	 i = b;
	 b = sum;
	 
	}
}