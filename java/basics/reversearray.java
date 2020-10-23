import java.util.Scanner;
public class reversearray {

	public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
	
	int n = scn.nextInt() ;
	
	 String [] countries = {"India","China","U.S.A","U.k"};
	 countries[1]= "France";
	 for(int i = n; i>=0; i--){
	 System.out.println(countries[(i-1)]);}
	 
	 
	  String [] city = {"Delhi","Mumbai","Kolkata","Hyderabad"};
	 
	 for(int j = n; j>=0; j--){
	 System.out.println(city[(j-1)]);}
	 
	}
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 