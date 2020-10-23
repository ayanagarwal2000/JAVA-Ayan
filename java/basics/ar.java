import java.util.Arrays;

public class ar {
    public static void main(String[] args) {
	System.out.println("The first array is: ");
	int[] values1 = { 10, 20, 30 };
	for(int i=0;i < values1.length;i++){
	System.out.println(values1[i]);
	}
	System.out.println("The second array is: ");
	int[] values2 = { 100, 200, 300 };
	for(int i=0;i < values2.length;i++){
	System.out.println(values2[i]);
	}
	int[] merge = new int[values1.length + values2.length];
	for (int i = 0; i < values1.length; i++) {
	    merge[i] = values1[i];
	}
	for (int i = 0; i < values2.length; i++) {
	    merge[i + values1.length] = values2[i];
	}
	System.out.println("The merged array is: ");
	System.out.println(Arrays.toString(merge));
    }
}