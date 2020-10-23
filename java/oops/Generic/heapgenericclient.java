public class heapgenericclient{
	public static void main(String[] arg){
        
		car[] cars= new car[5];
		cars[0]=new car(1000,400,"Red");
		cars[1]=new car(2000,200,"Yellow");
		cars[2]=new car(500,900,"Black");
		cars[3]=new car(300,30,"White");
		cars[4]=new car(700,60,"Grey");
		
		heapgeneric<car> heapg=new heapgeneric<>();
		heapg.add(cars[0]);
		heapg.add(cars[1]);
		heapg.add(cars[2]);
		heapg.add(cars[3]);
		heapg.add(cars[4]);
		
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
}
}