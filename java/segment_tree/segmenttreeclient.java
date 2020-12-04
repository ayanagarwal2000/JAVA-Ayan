import java.io.*; 
import java.util.*; 
public class segmenttreeclient{
    public static void main (String[] arg){
        int [] arr={3,8,7,6,-2,-8,4,9};
        segmenttree tree=new segmenttree(arr);
        tree.display();

    }
}