import java.util.Scanner;
import java.io.*; 
import java.util.*;
public class btclient{
	public static void main (String[] args){
		binarytree tree=new binarytree();
		tree.display();
		System.out.print("Height = ");
		int a=tree.height();
		System.out.println(a);
		System.out.println("");
		System.out.println("Preorder");
		tree.preorder();
		System.out.println("");
		System.out.println("Postorder");
		tree.postorder();
		System.out.println("");
		System.out.println("inorder");
		tree.inorder();
		System.out.println("");
		System.out.println("levelorder");
		tree.levelorder();
		System.out.println("");
		System.out.println("Is BST or Not");
		System.out.println(tree.isBST());
		System.out.println("");
		System.out.println("Sum of leaves");
		System.out.println(tree.sumleaf());
		System.out.println("");
		System.out.print("Diameter = ");
		System.out.println(tree.diameter());
		System.out.println("");
		System.out.print("Diameter better = ");
		System.out.println(tree.diameterBtr());
	}
}