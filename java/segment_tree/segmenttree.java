import java.io.*; 
import java.util.*;

public class segmenttree{

    private class node{
        int data;
        int startinterval;
        int endinterval;
        node left;
        node right;
    }

    node root;

    public segmenttree(int []arr){
        this.root=constructTree(arr, 0,arr.length-1);
    }

    private node constructTree(int[] arr, int si, int ei){

    }
}