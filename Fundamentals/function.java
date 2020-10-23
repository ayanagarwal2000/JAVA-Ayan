import java.util.Scanner;
public class function {
	public static int c=20; //global variable
	
public static void main (String [] arg) {
	
	Scanner scn = new Scanner (System.in);
	 int a = scn.nextInt()   ;
	 int b = scn.nextInt()   ;
	
	int d=add(a,b);
	int c=2; //java ignores it beacuse a global vriable c is already defined
	System.out.println (add(a,b));  //real answer

}

public static int add(int a,int b) {  //demo global variable
	int sum  = a +b+c;
	return sum;
}
}