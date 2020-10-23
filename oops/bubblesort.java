import java.util.Scanner;
import java.io.*; 
import java.util.*;
public class bubblesort{
	public static void main (String[] args){
		
		car[] cars= new car[5];
		cars[0]=new car(1000,400,"Red");
		cars[1]=new car(2000,200,"Yellow");
		cars[2]=new car(500,900,"Black");
		cars[3]=new car(300,30,"White");
		cars[4]=new car(700,60,"Grey");
		bubblesort(cars);
		display(cars);
	}
	
	public static <T> void display(T[] arr){
		for (T val : arr){
			System.out.println(val + " ");
		}
		System.out.println();
	}
	
	public static <T extends Comparable<T>> void bubblesort(T[] arr){
		 int n = arr.length; 
        for (int counter = 0; counter < n-1; counter++) 
            for (int j = 0; j < n -counter -1; j++) 
                if (arr[j].compareTo(arr[j+1]) > 0) 
                { 
                    // swap arr[j+1] and arr[j] 
                    T temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
	}
		
		

}