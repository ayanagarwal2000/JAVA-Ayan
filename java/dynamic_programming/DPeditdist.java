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
		
	}
	
	public static int editdistance(String s1, String s2){
		int ans =0;
		String ros1= s1.substring(1);
		String ros2= s2.substring(1);
		
		if(s1.charAt(0)==s2.charAt(0)){
			ans=editdistance(ros1,ros2);
		}
	}
	
}