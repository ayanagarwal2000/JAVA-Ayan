import java.util.Arrays;
import java.util.Scanner;
public class emptyarry {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	int n = scn.nextInt() ;
	 int[] num = new int[10];
	 Arrays.fill(num,n);
	 for (int nums :num) {   
	 System.out.print(nums);
	 System.out.print(" ");}
	 
	}
}
	 
	 