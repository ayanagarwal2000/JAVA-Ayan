import java.util.Scanner;
public class gps {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 System.out.println("Enter Table Number");
	 int a = scn.nextInt() ;
	 System.out.println("Table Range");
	 int n = scn.nextInt() ;
	 int i = 1;
	 for (i=1;i<=n; i++)
		 System.out.println(Math.pow(a,i));
	}
}
	 