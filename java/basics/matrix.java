import java.util.Scanner;
public class matrix {

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

}
}	