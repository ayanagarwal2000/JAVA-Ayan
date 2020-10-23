import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
	 System.out.println("First Number = ");
	 int a = scn.nextInt() ;
	 System.out.println("Second Number = ");
	 int b = scn.nextInt() ;
	 
	  System.out.println("Enter the Operation (+,*,/,-): ");
	 char n = scn.next().charAt(0); 
	 double w = a+b;;
	 double x = a-b ;
	 double y = a*b;
	 double z = a/b;
     switch (n) {
 case '+' :  System.out.println(w);
 break;
 case '*' :   System.out.println(y);
 break;
case '/' :  System.out.println(z);
 break;
 case '-' :  System.out.println(x);
 default : System.out.println("MATHEMATICAL ERROR");
	 }
	}
}
 
	