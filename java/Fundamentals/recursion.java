import java.util.Scanner;
class recursion {
	public static void main (String[] args){
		Scanner scn = new Scanner (System.in);
		System.out.println("Decending");
		pd(5);
		System.out.println("Acending");
		pi(5);
		System.out.println("decreasing - Increasing");
		pdi(5);
		System.out.println("Factorial");
		int x = fact(5);
		System.out.println(x);
		fact(5);  //dosent work
		System.out.println("Power");
		int y = pow(2,5);
		System.out.println(y);
		pow(4,3); //dosent work
		System.out.println("Fibonachi term");
		int z = fib(6);
		System.out.println(z);
		
		//*************************************************************** 
		/*System.out.println("All Indices");
		int [] arr={1,2,3,5,3,7,8,3,3};
		allindices(arr,0,0,3);*/
		System.out.println("Tower of Hanoi");
		toh(3,"source","destination","helper");
	}
	
	public static void pd(int n){   //decreasing
		
		if (n==0){
			return;
		}
		
		System.out.println(n);
		pd(n-1);
	}
	
	public static void pi(int n){
		
		if (n==0){
			return;
		}
		pi(n-1);
		
		System.out.println(n);
		
	}
	public static void pdi(int n){
		
		if (n==0){
			return;
		}
		
		if(n%2==1){
			System.out.println(n);
		
		
		}
		pdi(n-1);
		
		if(n%2==0){
			System.out.println(n);
		}
		
	}
	
	public static int fact(int n){
		if(n==1){
			return 1;
		}

		int fx = fact(n-1);
		int fn =n*fx;
		return fn;
	}
	
	public static int pow(int x,int n){
		if(n==0){
			return 1;
		}
		int r =pow(x,(n-1));
		
		int p =x*pow(x,(n-1));
		return p;
		
	}
	
	public static int fib(int n){
		if(n==1){
			return 1;
		}
		if(n==0){
			return 0;
		}
		int l=fib(n-1);
		int m=fib(n-2);
		
		int x=l+m;
		return x;
		
	}
	
	/*public static void allindices(int [] arr,int si,int count,int data){
		
		if(si==arr.lenght-1){
			return count;
		}
		
		
		
		
		
		int[] indices=null;
		
		if (arr[si]==data){
			indices= allindices(arr,si+1,count+1,data);
		}
		else{
			indices= allindices(arr,si+1,count,data);
		}
		
	}*/
	
	
	public static void toh(int n,String src,String dest,String help){
		int count =0;
		if (n==0){
		return;}
		toh(n-1,src,help,dest);
		System.out.println("Move "+n+"st disc from "+src+" to "+dest);
		count=count+1;
		toh(n-1,help,dest,src);
		System.out.println(count);
		}
}