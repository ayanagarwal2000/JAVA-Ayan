import java.io.*; 
import java.util.*; 
public class DPpathfind{
	public static long start;
	public static long end;
	
	public static void startAlgo(){
		start=System.currentTimeMillis();
		//return start;
	}
	public static long endAlgo(){
		end=System.currentTimeMillis();
		return end-start;
	}
	
	public static void main (String[] arg){
		int n=30;
		int [] strg=new int[n+1];
		startAlgo();		
		System.out.println(cbpRS(n,0,strg));
		System.out.println("Time taken by recursive = " +endAlgo() +"ms");
		
		startAlgo();		
		System.out.println(cbp(n,0));
		System.out.println("Time taken by normal = " +endAlgo() +"ms");
		
		startAlgo();		
		System.out.println(cbpRS(n,0,strg));
		System.out.println("Time taken by recursive = " +endAlgo() +"ms");
	}
	
	public static int cbp(int end, int curr){
		if(end==curr){
			return 1;
		}
		if(curr>end){
			return 0;
		}
		
		int count=0;
		for(int dice=1; dice<=6; dice++){
			count=count+cbp(end, curr+dice);
		}
		return count;
	}
	
	public static int cbpRS(int end, int curr, int [] strg){
		if(end==curr){
			return 1;
		}
		if(curr>end){
			return 0;
		}
		if(strg[curr]!=0){
			return strg[curr];
		}
		
		int count=0;
		for(int dice=1; dice<=6; dice++){
			count=count+cbpRS(end, curr+dice,strg);
		}
		strg[curr]=count;
		return count;
	}
	
}