public class Pattern6 {    
public static void main (String [] arg) {
for (int i = 1; i <= 6; i++) {

if (i == 1 || i == 6) {
for (int j = 1; j <= 7; j++) {

System.out.print("@");

}
}

if (i == 2 || i == 3 || i == 4) {
for (int j = 1; j <= 4; j++) {
System.out.print("@");
if (i == 2 && j == 2) {
System.out.print(" ");
}
if (i == 3) {
System.out.print(" ");
}
if ((i == 4) && (j == 1 || j == 3)) {
System.out.print(" ");
}
}
}

if (i == 5) {
for (int j = 1; j <= 3; j++) {
System.out.print("@" + " ");
}
}

System.out.println();
}

}
 }