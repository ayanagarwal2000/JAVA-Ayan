import java.util.Scanner;
public class vovel {
public static void main(String [] arg) {
 Scanner scn = new Scanner (System.in);
     
	char v = scn.nextInt() ;
	 
  if (v == 'a' || v == 'e' || v == 'i' || v =='o' || v == 'u' ) {
	  
     System.out.println("VOWEL");
  } else {System.out.println("CONSONENT") ;
  }
}

} 
   
   