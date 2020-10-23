import java.util.Scanner;
public class days {
public static void main (String [] arg) {
 Scanner scn = new Scanner (System.in);
 int x = scn.nextInt() ;
 switch (x) {
 case 1 : System.out.println("Monday");
 break;
 case 2 : System.out.println("Tuesday");
 break;
 case 3 : System.out.println("Wednesday");
 break;
 case 4 : System.out.println("Thursday");
case 5 : System.out.println("Friday");
 break;
 case 6 : System.out.println("Saturday");
 break;
 case 7 : System.out.println("Sunday");
 break;
 default: System.out.println("dose not exist");
 }
}
}
 