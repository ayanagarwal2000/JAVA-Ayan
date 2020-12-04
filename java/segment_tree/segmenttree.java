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
        this.constructSegmentTree(arr, 0,arr.length-1);
    }

    private node constructSegmentTree(int[] arr, int si, int ei){

    }
}