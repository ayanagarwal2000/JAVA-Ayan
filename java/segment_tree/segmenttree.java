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
}