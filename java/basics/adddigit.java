import java.util.Scanner;
public class adddigit {
public static void main (String [] arg) {
 Scanner scn = new Scanner (System.in);
 int n = scn.nextInt() ;
 int a = n%10;
 int b = n%100;
 int c = n%1000;
 int x = a;
 int y = (b-a)/10;
 int z = (c-a-b)/100;
 int l = x+y+z+1;
 System.out.print("Sum of digits= " + l);
}
}