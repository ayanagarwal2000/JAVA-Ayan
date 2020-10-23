class array {
	public static void main (String[] args){
		int[][] arr=new int[3][3];
		int x=0; //global variable
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				arr[i][j]=x;
				x=x+1;
			}
		}
		
		arr[1][2]=9; //change the value
		
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();
				
				
			}
	}
}

//******************************************************************************************************************************************************************
class test{
public static void main(String args[]){  
	     System.out.println("Hello AYAN");  
	    }  
	}  
	




/*Ayan plese drop an Email to 
support@codingblocks.com
or call 9643339747 */