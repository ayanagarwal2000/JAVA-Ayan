import java.io.*; 
import java.util.*;

public class segmenttree{

    private class Node{
        int data;
        int startinterval;
        int endinterval;
        Node left;
        Node right;
    }

    Node root;

    public segmenttree(int []arr){
        this.root=constructTree(arr, 0,arr.length-1);
    }

    private Node constructTree(int[] arr, int si, int ei){
        if(ei==si){
            Node leafNode=new Node();
            leafNode.startinterval=si;
            leafNode.endinterval=ei;
            leafNode.data=arr[si];
            return leafNode;     
        }

        Node node=new Node();
        node.startinterval=si;
        node.endinterval=ei;

        int mid=(si+ei)/2;
        node.left=constructTree(arr, si, mid);
        node.right=constructTree(arr, mid+1, ei);

        node.data=node.left.data+ node.right.data;
        return node;

    }

    public void display(){
        this.display(this.root);
    }

    private void display() {
		LinkedList<Node> pqueue = new LinkedList<>();
		LinkedList<Node> squeue = new LinkedList<>();

		pqueue.add(this.root);
		while (!pqueue.isEmpty()) {
			Node rv = pqueue.remove();
			System.out.print("[" + rv.si + "-" + rv.ei + "]=" + rv.data + ", ");
			if (rv.left != null) {
				squeue.add(rv.left);
			}

			if (rv.right != null) {
				squeue.add(rv.right);
			}

			if (pqueue.isEmpty()) {
				pqueue = squeue;
				squeue = new LinkedList<>();
				System.out.println("END");
			}
		}
	}
}