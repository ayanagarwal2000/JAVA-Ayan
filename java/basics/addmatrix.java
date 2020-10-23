import java.util.Arrays;
import java.util.Scanner;
public class addmatrix {

	public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
	System.out.println("Enter number of rows of 1st Matrix");
	int n = scn.nextInt() ;
	System.out.println("Enter number of columns of 1st Matrix");
	int m = scn.nextInt() ;
	
	System.out.println("Enter number of rows of 2nd Matrix");
	int p = scn.nextInt() ;
	System.out.println("Enter number of columns of 2nd Matrix");
	int q = scn.nextInt() ;
	
	
	int matrix[][] = new int[n][m];
	int i,k = 0;
	int j = 0;
	for(i=0; i<=(n-1); i++)
    for(j=0; j<=(m-1); j++){
     matrix[i][j] = k;
     k++;
	}
    for(i=0; i<=(n-1); i++) {
		
    for(j=0; j<=(m-1); j++) {
                         System.out.print(matrix[i][j] + " ");
    }
   System.out.println();
	}






	int mat[][] = new int[p][q];
	int r,t = 0;
	int s = 0;
	for(r=0; r<=(p-1); r++)
    for(s=0; s<=(q-1); s++){
     mat[r][s] = t;
     t++;
	}
    for(r=0; r<=(p-1); r++) {
		
    for(s=0; s<=(q-1); s++) {
                         System.out.print(mat[r][s] + " ");
    }
   System.out.println();
	}
	
	
	int sum[][] = new int[p][q];
	
	sum[p][q]= matrix[i][j] + mat[r][s] ;
	
	 System.out.print(sum[r][s] + " ");
	

}
}	