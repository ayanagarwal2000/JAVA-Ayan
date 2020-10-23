import java.util.Scanner;
public class flipno {
public static void main (String [] arg) {
 Scanner scn = new Scanner (System.in);
 int n = scn.nextInt() ;
 int a = n%10;
 int b = n%100;
 int c = n;
 int x = a;
 int y = (b-a)/10;
 int z = (c-b)/100;
 int l = (x*100)+(y*10)+z;
 System.out.println("New Number = " + l);

}
}