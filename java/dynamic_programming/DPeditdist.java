public class DPeditdist{
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
		String str1="agbg", str2="acbg";
	
		startAlgo();		
		System.out.println(editdistance(str1,str2));
		System.out.println("Time taken by recursive = " +endAlgo() +"ms");
		
	}
	
	public static int editdistance(String s1, String s2){
		
		if(s1.length()==0){
			return s2.length();
		}
		if(s2.length()==0){
			return s1.length();
		}
		
		String ros1= s1.substring(1);
		String ros2= s2.substring(1);
		int ans =0;
		if(s1.charAt(0)==s2.charAt(0)){
			ans=editdistance(ros1,ros2);
		}
		else{
			int f1=1+editdistance(ros1,ros2);
			int f2=1+editdistance(s1,ros2);
			int f3=1+editdistance(ros1,s2);
			ans=Math.min(f1,Math.min(f2,f3));
			
		}
		return ans;
	}
	
}