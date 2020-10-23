import java.util.Scanner;
class wavearr {
	public static void main (String[] args){
		Scanner scn = new Scanner (System.in);
		int[][] arr ={{1,2,3,4,5},{9,8,7,6},{10,11,12,13,14,15,16,17},{20,19,18}};
		System.out.println(arr);
		order(arr);
	
	
	}
	
	
	public static void order(int[][] axx){
		for (int i=0;i<axx.length;i++){
			if(i%2==0){
				for(int j=0;j<axx[i].length;j++){
					System.out.print(axx[i][j] +" ");
					
				}
				System.out.println();
			}
			else{
				for(int j=axx[i].length-1;j>=0;j--){
					System.out.print(axx[i][j] +" ");
					
				}
				System.out.println();
			}
		}
		System.out.print("END");
		
	}
	
	
	
	
	
	
	
	
	
	
}