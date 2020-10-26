import java.io.*; 
import java.util.*; 
public class DPdemo{
	
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
		int n=70;
		int [] strg=new int[n+1];
		startAlgo();		
		//System.out.println(fib(n));
		System.out.println("Time taken by normal = " +endAlgo() +"ms");
		
		startAlgo();
		System.out.println(fibRS(n,strg));
		System.out.println("Time taken by recursive = " +endAlgo() +"ms");
	}
	
	public static int fib(int n){
		if(n==0){
			return n;
		}
		if(n==1){
			return n;
		}
		int fnm1=fib(n-1);
		int fnm2=fib(n-2);
		int fnm=fnm1+fnm2;
		
		return fnm;
	}

    public static int fibRS(int n, int [] strg){
		if(n==0){
			return n;
		}
		if(n==1){
			return n;
		}
		if(strg[n]!=0){
			return strg[n];
		}
		int fnm1=fibRS(n-1,strg);
		int fnm2=fibRS(n-2, strg);
		int fnm=fnm1+fnm2;
		strg[n]=fnm;
		return fnm;
	}
}