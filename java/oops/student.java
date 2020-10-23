import java.io.*; 
import java.util.*; 

import java.util.Scanner;

public class student{
	private String name;
	private int age;
	
	
	public void setname(String name) throws Exception {
		this.name=name;
		if(name.equals("") || name==null) {
			throw new Exception ("Name can't be emptyor null");
		}
		
		
	}
	public String getname(){
		return name;
	}
	
	public int getage(){
		return age;
	}
	
    public void setage(int age) throws Exception{
		if(age<0){
			throw new Exception ("Age error");
		}
		this.age =age;
	}

}