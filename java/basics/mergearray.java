import java.util.Arrays;
import java.util.Scanner;
public class mergearray {

	public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
	
	int n = scn.nextInt() ;
	
	 String [] countries = {"India","China","U.S.A","U.k"};
	 countries[1]= "France";
	 for(int i = 1; i<=n; i++){
	 System.out.println(countries[(i-1)]);}
	 
	 
	  String [] city = {"Delhi","Mumbai","Kolkata","Hyderabad"};
	 
	 for(int j = 1; j<=n; j++){
	 System.out.println(city[(j-1)]);}
	 
	 
	String[] merge = new String[countries.length + city.length];
	for (int i = 0; i < countries.length; i++) {
	    merge[i] = countries[i];
	}
	for (int i = 0; i < city.length; i++) {
	    merge[i + countries.length] = city[i];
	}
	System.out.println("The merged array is: ");
	System.out.println(Arrays.toString(merge));
	}
	
}	