import java.io.*; 
import java.util.*; 

import java.util.Scanner;

public class students{
	public static void main (String [] args) throws Exception{
		student s1=new student();
		
		s1.setage(10);

		
		System.out.println(s1.getage());
		System.out.println(s1.getname());
	}
	
}