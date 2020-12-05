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

    
    public void display() {
		LinkedList<Node> pqueue = new LinkedList<>();
		LinkedList<Node> squeue = new LinkedList<>();

		pqueue.add(this.root);
		while (!pqueue.isEmpty()) {
			Node rv = pqueue.remove();
			System.out.print("[" + rv.startinterval + "-" + rv.endinterval + "]=" + rv.data + ", ");
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
    
    public int query(int qsi, int qei) {
		return this.query(this.root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {
		if (node.startinterval >= qsi && node.endinterval <= qei) {
			return node.data;
		} else if (node.endinterval < qsi || node.startinterval > qei) {
			return 0;
		} else {
			int left = this.query(node.left, qsi, qei);
			int right = this.query(node.right, qsi, qei);
			return left + right;
		}
    }
    
    public void update(int index, int data) {
		this.root.data = this.update(this.root, index, data);
	}

	private int update(Node node, int index, int data) {
		if (index >= node.startinterval && index <= node.endinterval) {
			if (index == node.startinterval && index == node.endinterval) {
				node.data = data;
			} else {
				int leftdata = this.update(node.left, index, data);
				int rightdata = this.update(node.right, index, data);
				node.data = leftdata + rightdata;
			}
		}

		return node.data;
	}
}