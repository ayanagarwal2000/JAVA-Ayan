import java.util.Queue; 
import java.util.Iterator;
public class suqpefficient{
	private DynamicQueue primary;
	private DynamicQueue secondary;
	
	public suqpefficient() throws Exception{
		this.primary=new DyanamicQueue();
		this.secondary=new DyanamicQueue();
	}
	
	public int size(){
		return this.primary.size();
	}
	
	public boolean isEmpty(){
		return this.primary.isEmpty();
	}
	
	public void push(int data) throws Exception{
		while(this.primary.size()!=0){
			this.secondary.enqueue(this.primary.dequeue());
		}
		this.primary.enqueue(data);
		
		while(this.secondary.size()!=0){
			this.primary.enqueue(this.secondary.dequeue());
		}
	}
	
	public int pop()throws Exception{
		return this.primary.dequeue();
	}
	
	public int top()throws Exception{
		return this.primary.front;
	}
	
	public void display(){
		this.primary.display();
	}
}