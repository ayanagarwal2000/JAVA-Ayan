import java.util.Scanner;
import java.io.*; 
import java.util.*;
public class bstclient{
	public static void main (String[] args){
		int[] in={10,20,30,40,50,60,70};
		bst bst=new bst(in);
		
		
		bst.display();
		System.out.print("Find in BST = ");
		System.out.println(bst.findInbst(20));
		System.out.print("Max in BST = ");
		System.out.println(bst.maxInbst());
		System.out.println("Add to BST ");
		bst.addTobst(55);
		bst.display();
		System.out.println("Remove from BST ");
		bst.remove(55);
		bst.display();
	}
	
}

/*

import java.io.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
    }
}




*/