
public class client{
	public static void main (String[] arg){
		pair<String> pair=new pair<>();
		pair.one= "abc";
		pair.two= "Xyz";
		
		pair<Integer> pair1=new pair<>();
		pair1.one= 10;
		pair1.two= 20;
		
		pairtwo<Integer, String> pair2=new pairtwo<>();
		pair2.one=100;
		pair2.two = "text";
		
		linkedlistgeneric<car> list=new linkedlistgeneric<>();
		car[] cars= new car[5];
		cars[0]=new car(1000,400,"Red");
		cars[1]=new car(2000,200,"Yellow");
		cars[2]=new car(500,900,"Black");
		cars[3]=new car(300,30,"White");
		cars[4]=new car(700,60,"Grey");
		
		list.addLast(cars[0]);
		list.addLast(cars[1]);
		list.addLast(cars[2]);
		list.addLast(cars[3]);
		list.addLast(cars[4]);
		
		list.display();
		}
}