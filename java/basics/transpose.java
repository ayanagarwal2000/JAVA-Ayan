import java.util.Scanner;
public class transpose {

	public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
	System.out.println("Enter number of rows");
	int n = scn.nextInt() ;
	System.out.println("Enter number of columns");
	int m = scn.nextInt() ;
	int matrix[][] = new int[n][m];
	int i,j,k = 0;
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
	
	int p = n;
	int q = m;


	int mat[][] = new int[p][q];
	int r,s,t = 0;
	for(r=0; r<=(p-1); r++)
    for(s=0; s<=(q-1); s++){
     mat[r][s] = t;
     t++;
	}
    for(r=0; r<=(p-1); r++) {
		
    for(s=0; s<=(q-1); s++) {
                         System.out.print(mat[s][r] + " ");
    }
   System.out.println();
	}
}
}	