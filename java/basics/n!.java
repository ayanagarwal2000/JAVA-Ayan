import java.util.Scanner;
public class n! {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 int n = scn.nextInt() ;
	 int counter = 1;
	 int sum = 1;
	 while (counter <= n){
	 sum = sum * counter;
	 counter = counter + 1;
	 }
	 System.out.print(sum);
	 
     
	}

}