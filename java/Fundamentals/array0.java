public class array0 {
public static void main (String[] arg) {

int [] arr = null; //declare the arr
System.out.println(arr);


arr = new int [5];  //allocate the sapce to arr
System.out.println(arr);
arr[0] = 10; 
arr[1] = 20; 
arr[2] = 3; 
arr[3] = 40; 
arr[4] = 5;
int a;
for (int i=0; i< arr.length; i++) {
System.out.println(arr[i]);}

for (int i=0; i<arr.length; i++){
	if (arr[i]==5){
		//int a=arr[i];
		System.out.println(i);
	}
}








}
public void hello(int a){
	System.out.println("hello");
}
 public static void swap(int [] arr,int i,int j) {
System.out.println(arr[i] + "," + arr[j]);}

/*public static void max{
	for (int i=0;i< arr.length;i++){
	for(int j=1;j< arr.length;j++){
		if (arr[i]<=arr[j]){
			int max =arr[j];
			System.out.println(max);
		}
	}
}
}*/


}

