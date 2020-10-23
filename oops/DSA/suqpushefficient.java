import java.util.Queue; 
import java.util.Iterator;
public class suqpushefficient{
	private DynamicQueue primary;
	private DynamicQueue secondary;
	
	public suqpushefficient() throws Exception{
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
		this.primary.enqueue(data);
	}
	
	public int pop()throws Exception{
		while(this.primary.size()!=1){
			this.secondary.enqueue(this.primary.dequeue());
		}
		int rv =this.primary.dequeue();
		
		while(this.secondary.size()!=0){
			this.primary.enqueue(this.secondary.dequeue());
		}
		
        return rv;
	}
	
	public int top()throws Exception{
		while(this.primary.size()!=1){
			this.secondary.enqueue(this.primary.dequeue());
		}
		int rv =this.primary.dequeue();
		
		this.secondary.enqueue(rv);
		
		while(this.secondary.size()!=0){
			this.primary.enqueue(this.secondary.dequeue());
		}
		
		return rv;
	}
	
	public void display(){
		this.primary.display();
	}
}