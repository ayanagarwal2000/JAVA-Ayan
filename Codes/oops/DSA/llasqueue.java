public class llasqueue extends linkedlist {
	private linkedlist queue;
	
	public llasqueue(){
		this.queue=new linkedlist();
		
	}
	
	public boolean isEmpty(){
		return this.queue.isEmpty();
	}
	
	public void enqueue(int data)throws Exception{
		this.queue.addLast(data);
		
	}
	public int dequeue()throws Exception{
		return this.queue.removeFirst();
	} 
	public int front() throws Exception{
		return this.queue.getFirst();
	}
	public void display(){
		this.queue.display();
	}
}
	