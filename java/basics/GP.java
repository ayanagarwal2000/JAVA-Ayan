import java.util.Scanner;
public class GP {
public static void main (String [] arg) {
 Scanner scn = new Scanner (System.in);
 int a = scn.nextInt() ;
 int n = scn.nextInt() ;
 

int sum =0;
while(n <= 10) {
	
 System.out.println(Math.pow(a,n));
 
   n = n + 1;
}

 
}
}