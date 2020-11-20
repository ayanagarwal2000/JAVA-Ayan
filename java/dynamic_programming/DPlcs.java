public class DPlcs{
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
	
	public static void main(String[] arg){
		
		String str1="abbg", str2="agbg";
	
		startAlgo();		
		System.out.println(lcs(str1,str2));
		System.out.println("Time taken by recursive = " +endAlgo() +"ms");
		
	}
	
	public static int lcs(String str1, String str2){
		if(str1.length()==0 || str2.length()==0){
			return 0;
		}
		
		int count =0;
		String ros1= str1.substring(1);
		String ros2= str2.substring(1);
		
		if(str1.charAt(0)==str2.charAt(0)){
			count=1+ lcs(ros1,ros2);
		}
		else{
			int f1= lcs(ros1,str2);
			int f2= lcs(str1,ros2);
			count=Math.max(f1,f2);
		}
		return count;
	}
}
