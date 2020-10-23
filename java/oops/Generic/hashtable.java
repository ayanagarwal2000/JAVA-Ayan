//import generic.linkedlistgeneric;
import java.util.HashMap; 
import java.io.*; 
import java.util.*; 

public class hashtable<K,V>{
	private class HTPair{
		K key;
		V value;
		HTPair(K key, V value){
			this.key=key;
			this.value=value;
		}
		public boolean equals(Object other){
			HTPair op=(HTPair) other;
			return this.key.equals(op.key);
		}
		public String toString(){
			return "{"+ this.key +"-" + this.valur+"}";
		}
	}
	public static void main (String[] arg){}
	private linkedlistgeneric<HTPair>[] bucketArray;
}