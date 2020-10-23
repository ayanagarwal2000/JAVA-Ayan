import java.util.Scanner;
import java.io.*; 
import java.util.*;
public class bst{
	private class Node{
		int data;
		Node right;
		Node left;
	}
	private Node root;
	
	public bst(int[] arr){
		this.root=construct(arr, 0, arr.length-1);
	}
	
	private Node construct (int[] arr, int lo, int hi){
		if(lo>hi){
			return null;
		}
		int mid=(lo+hi)/2;
		
		Node nn=new Node();
		nn.data=arr[mid];
		
		nn.left=construct(arr,lo,mid-1);
		nn.right=construct(arr,mid+1,hi);
		
		return nn;
		
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
 
    public boolean findInbst(int x){
		return this.findInbst(x,this.root);
	}
    private boolean findInbst(int x,Node node){
		if(node==null){
			return false;
		}
		if(x==node.data){
			return true;
		}
		else if(x<node.data){
			return findInbst(x,node.left);
		}
		else {
			return findInbst(x,node.right);
			}
		
		
	}

    public int maxInbst(){
		return this.maxInbst(this.root);
	}
	private int maxInbst(Node node){
		
		if(node.right==null){
			return node.data;
		}else{
			return maxInbst(node.right);
		}
	}

    public void addTobst(int x){
		this.addTobst(x,this.root);
	}
	private void addTobst(int x,Node node){
		Node nn=new Node();
		nn.data=x;
		
		if (x>node.data){
			 if(node.right==null){
				node.right=nn;
			 }
		     else{
			 addTobst(x,node.right);
			 }			
		}
		else{
			if(node.left==null){
				node.left=nn;
			}
			else{
			addTobst(x,node.left);
			}
		}
	}
		
	public void remove(int x){
		this.remove(x,this.root,null,false);
	}
	private void remove(int x,Node node,Node parent,boolean isleftchild){
		
		if(x>node.data){
			 remove(x,node.right,node,false);
		}
		else if(x<node.data) {
			 remove(x,node.left,node,true);
		}
		else{
			if(null==node.right && null==node.left){
				if(isleftchild){
					parent.left=null;
				}
			   else{
				   parent.right=null;
			   }
			}
			else if	(null!=node.right && null==node.left){
				if(isleftchild){
					parent.left=node.right;
				}
				else{
					parent.right=node.right;
				}
			}
			else{
				int max=maxInbst(node.left);
				node.data=max;
				remove(max,node.left,node,true);
			}
		}
	}
		
		
		

}