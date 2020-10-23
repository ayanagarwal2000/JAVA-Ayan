import java.io.*; 
import java.util.*; 
class linkedlistgeneric<T>{
	private class node{
		T data;
		node next;
	}
	
	private node head;
	private node tail;
	private int size;
	
	public void display(){
		
		node temp=this.head;
		
		while(temp !=null){
			System.out.print(temp.data);
			System.out.print(" , ");
			temp=temp.next;
			
		}
		System.out.println();
	}
	
	public void addLast(T item){
		
		node nn=new node();
		nn.data=item; 
		nn.next=null;
		
		if(this.size>=1){
			this.tail.next =nn;
		}
		
		if(this.size==0){
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else{
			this.tail=nn;
			this.size++;
		}
	}
	
	public void addFirst(T item){
		node nm =new node();
		nm.data=item;
		
		if(this.size>=1){
			nm.next=head;
			
		}
		
		if(this.size==0){
			this.head=nm;
			this.tail=nm;
			this.size++;
		}
		else{
			this.head=nm;
			this.size++;
		}
		
	}
	
	public T getFirst()throws Exception{
		if(this.size==0){
			throw new Exception ("LL is Empty");
		}
		
		return this.head.data;
	}
	public T getLast()throws Exception{
		if(this.size==0){
			throw new Exception ("LL is Empty");
		}
		
		return this.tail.data;
	}
	
	public T getAt(int i)throws Exception{
		if(this.size==0){
			throw new Exception("LL is Empty");
		}
		if(i<0 || i>=this.size){
			throw new Exception("Invalid Index");
		}
		
		node temp=this.head;
		for(int j=1; j<=i; j++){
			temp=temp.next;
		}

		return temp.data;
	
	}
	private node getNodeAt(int i)throws Exception{
		if(this.size==0){
			throw new Exception("LL is Empty");
		}
		if(i<0 || i>=this.size){
			throw new Exception("Invalid Index");
		}
		
		node temp=this.head;
		for(int j=1; j<=i; j++){
			temp=temp.next;
		}

		return temp;
	
	}
	
	public void addAt(int i,T item)throws Exception{
		
		if(i<0){
			throw new Exception("Invalid Index");
		}
		if(i==0){
			addFirst(item);
		}
		else if(i==this.size){
			addLast(item);
		}
		else{
			node nn=new node();
			nn.data=item;
			nn.next=null;
			
			node nm1=getNodeAt(i-1);
			node np1=nm1.next;
			
			nm1.next=nn;
			nn.next=np1;
			
			this.size++;
		}
		
	}

    public T removeFirst()throws Exception{
		
		if(this.size==0){
			throw new Exception("LL is Empty!!");
		}
		
		T rv =this.head.data;
		if(this.size==1){
			this.head=null;
			this.tail=null;
			this.size--;
		}
		else{
			this.head=head.next;
			this.size--;
		}
		return rv;
	}
    
	public void removeLast()throws Exception{
		
		if(this.size==0){
			throw new Exception("LL is Empty!!");
		}
		
		T rv =this.tail.data;
		if(this.size==1){
			this.head=null;
			this.tail=null;
			this.size--;
		}
		else{
			//node sm2=this.grtnodeA
			this.tail=this.getNodeAt((this.size)-2);
			this.tail.next=null;
			this.size--;
		}
		System.out.println(rv);
	}
    
	public void removeAt(int i)throws Exception{
		if(this.size==0){
			throw new Exception("LL is Empty !!");
		}
		if(this.size==1 && i==0){
			T rv= this.head.data;
			this.head=null;
			this.tail=null;
			this.size--;
			System.out.println(rv);
			
		}
		else{
			node pn=this.getNodeAt(i-1);
		    node nn=this.getNodeAt(i+1);
		    node op=this.getNodeAt(i);
		    T rv=op.data;
			op=null;
		    pn.next=nn;
		    this.size--;
			System.out.println(rv);
			
		}
		
		
		
	}
	
	public int find(T data){
		int index=0;
		
		for(node temp=this.head; temp!=null; temp=temp.next){
			if(temp.data.equals(data)){
				return index;
			}else{
				index++;
			}
		}
		return -1;
	}

  
		

}