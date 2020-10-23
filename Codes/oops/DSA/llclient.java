import java.io.*; 
import java.util.*; 
class llclient{
	public static void main (String[] args) throws Exception{
		linkedlist list=new linkedlist();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.display();
		list.addFirst(100);
		list.display();
		list.addLast(700);
		list.display();
		list.getFirst();
		int a=list.getAt(3);
		System.out.println(a);
		list.addAt(3,800);
		list.display();
		int b=list.removeFirst();
		System.out.println(b);
		list.display();
		list.removeLast();
		list.display();
		list.removeAt(3);
		list.display();
		list.reverseData();
		list.display();
		list.reversePointer();
		list.display();
		list.midNode();
		System.out.println("*******************************************************************************************************************************************");
		System.out.println("Queue using LL");
		
		llasqueue queue=new llasqueue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.display();
		int x= queue.size();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		
		System.out.println(x);
		
		System.out.println("*******************************************************************************************************************************************");
		System.out.println("Kth node from last");
		
		list.kthNodeFromLast(3);
		
	}
		
}