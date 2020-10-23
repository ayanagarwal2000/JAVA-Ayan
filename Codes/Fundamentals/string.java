public class string {
public static void main (String[] arg) {
	String str ="ayanagarwal";  //define a string
	
	
	System.out.println(str);  //print a string
 	
	
	System.out.println(str.length());  //length of string
	
	
	System.out.println(str.charAt(1));   //char at perticular position
	
	
	System.out.println(str.substring(1,4));   //substring
	
	
	System.out.println(str.substring(6));   // print all char after that position
	
	String s1="hi";
	String s2="bye";
	
	String s3= s1+s2;  // can simpaly add 2 or more strings
	System.out.println(s3 +"s3");
	
	System.out.println("**********************************************************************");
	
	
	String s4=s1.concat(s2);   //use "concat" function to add 2 strings
	System.out.println(s4+ "s4");
	
	System.out.println("*********************************************************************************************************************");
	
	System.out.println(str.indexOf("an"));  // tell the index/position in the given string
	
	
	
	System.out.println(str.startsWith("ay"));  // returns valur "true"
	
	
	
	System.out.println(str.startsWith("Ay"));  // returns value "false"
	
	System.out.println("************************************************************************************************************************");
	
	System.out.println( s3.equals(s4) ); //works on strings
	
	System.out.println(s3==s4);  //works on strings
	
	
}
}