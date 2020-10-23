import java.util.Scanner;
import java.io.*; 
import java.util.*;
public class binarytree{
	private class Node{
		int data;
		Node right;
		Node left;
		
		Node(int data, Node right, Node left){
			this.data=data;
			this.right=right;
			this.left=left;
		}
	}
	Node root=null;
	int size=0;
	
	binarytree(){
		Scanner s=new Scanner(System.in);
		this.root=takeinput(s,null,false);
	}
	private Node takeinput(Scanner s, Node parent, boolean isrightorleft){
		if(parent==null){
			System.out.println("Enter the Data for root node");
		}
		else{
			if(isrightorleft){
				System.out.println("Enter the Data for left node "+ parent.data);
			}
			else{
				System.out.println("Enter the Data for right node "+ parent.data);
			}
		}
		
		int nodedata=s.nextInt();
		Node node=new Node(nodedata,null,null);
		
		boolean choice=false;
		System.out.println("Do you have a left node of "+ node.data);
		choice=s.nextBoolean();
		
		if(choice==true){
		node.left=takeinput(s, node,true);
		}
		
		System.out.println("Do you have a right node of "+ node.data);
		choice=s.nextBoolean();
		
		if(choice==true){
		node.right=takeinput(s, node,false);
		}
		return node;
	}
	
	public void display(){
		this.display(this.root);
	}
	
	private void display(Node node){
		String str="";
		if (node.left !=null){
			str=str+node.left.data + "=>";
		}
		else{
			str=str+"END=>";
		}
		str=str+ node.data;
		if(node.right!=null){
			str=str+"<=" + node.right.data;
		}
		else{
			str=str+"<=END";
		}
		System.out.println(str);
        if(node.left!=null){
			display(node.left);
		}
		
		if(node.right!=null){
			display(node.right);
			}
	}
	
	public int height(){
		return this.height(this.root);
	}
	private int height(Node node){
		if(node==null){
			return -1;
		}
		int lheight =this.height(node.left);
		int rheight=this.height(node.right);
		
		int height=Math.max(lheight,rheight)+1;
		
		return height;
		}
		
		public void preorder(){
			this.preorder(this.root);
		}
		private void preorder(Node node){
			if(node==null){
				return;
			}
			System.out.print(node.data+", ");
			preorder(node.left);
			preorder(node.right);
		}
	
	public void postorder(){
			this.postorder(this.root);
		}
	private void postorder(Node node){
			if(node==null){
				return;
			}
			
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+", ");
		}
	
	public void inorder(){
			this.inorder(this.root);
		}
		private void inorder(Node node){
			if(node==null){
				return;
			}
			
			inorder(node.left);
			System.out.print(node.data+", ");
			inorder(node.right);
		}
		
	public void levelorder(){
		this.levelorder(this.root);
	}
	private void levelorder(Node node){
		
		LinkedList<Node> queue=new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()){
			Node rv=queue.removeFirst();
		    System.out.print(rv.data +", ");
			if (rv.left!=null){
				queue.addLast(rv.left);
			}
			if (rv.right!=null){
				queue.addLast(rv.right);
			}
		}
		
		
	}
	
	public boolean isBST(){
		return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private boolean isBST(Node node, int min, int max){
		if(node==null){
			return true;
		}
		
		if(node.data>max || node.data<min){
			return false;
		}
		else if(!this.isBST(node.left, min, node.data)){
			return false;
		}
		else if(!this.isBST(node.right, node.data, max)){
			return false;
		}
		return true;
	}
	
	public int sumleaf(){
		return this.sumleaf(this.root);
	}
	private int sumleaf(Node node){
		
		if(node==null){
		return 0;
		}
		if(node.left==null && node.right==null){
		return node.data;
		}
			
		int ln=sumleaf(node.left);
		int rn=sumleaf(node.right);
		int sum=ln+rn;
		return sum;
		
	}
	
	public int diameter(){
		return this.diameter(this.root);
	}
	private int diameter(Node node){
		if(node==null){
		return 0;
		}
		int case1= height(node.left)+height(node.right)+2;
		int case2=diameter(node.left);
		int case3=diameter(node.right);
		
		int d=Math.max(case1,Math.max(case2,case3));
		
		return d;
		
	}
	
	public int diameterBtr(){
		return this.diameterBtr(this.root).diameter;
	}
	private Dipair diameterBtr(Node node){
		if(node==null){
			Dipair bp=new Dipair(-1,0);
			return bp;
		}
		
		Dipair lp=this.diameterBtr(node.left);
		Dipair rp=this.diameterBtr(node.right);
		
		Dipair mp=new Dipair();
		mp.height=Math.max(lp.height,rp.height)+1;
		mp.diameter=Math.max(lp.height+rp.height+2, Math.max(lp.diameter,rp.diameter));
		return mp;
	}
	
	
	public class Dipair{
		int height;
		int diameter;
		Dipair(){
			
		}
		Dipair(int height,int diameter){
			this.height=height;
			this.diameter=diameter;
		}
	}
}


/*
50
true
25
true
38
false
false
true
48
true
18
false
false
false
true
45
true
85
false
false
true
60
false
false




DATA 2

50
true
25
true
5
false
false
true
30
false
false
true
70
true
60
true
55
false
false
false
true
80
true
75
false
false
true
90
false
false




*/