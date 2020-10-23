import java.io.*; 
import java.util.*; 
class linkedlist{
	private class node{
		int data;
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
	
	public void addLast(int item){
		
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
	
	public void addFirst(int item){
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
	
	public int getFirst()throws Exception{
		if(this.size==0){
			throw new Exception ("LL is Empty");
		}
		
		return this.head.data;
	}
	public int getLast()throws Exception{
		if(this.size==0){
			throw new Exception ("LL is Empty");
		}
		
		return this.tail.data;
	}
	
	public int getAt(int i)throws Exception{
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
	
	public void addAt(int i,int item)throws Exception{
		
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

    public int removeFirst()throws Exception{
		
		if(this.size==0){
			throw new Exception("LL is Empty!!");
		}
		
		int rv =this.head.data;
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
		
		int rv =this.tail.data;
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
			int rv= this.head.data;
			this.head=null;
			this.tail=null;
			this.size--;
			System.out.println(rv);
			
		}
		else{
			node pn=this.getNodeAt(i-1);
		    node nn=this.getNodeAt(i+1);
		    node op=this.getNodeAt(i);
		    int rv=op.data;
			op=null;
		    pn.next=nn;
		    this.size--;
			System.out.println(rv);
			
		}
		
		
		
	}

    public void reverseData()throws Exception{
		
			int left=0;
			int right=this.size-1;
			while(left<right){
				node ll=getNodeAt(left);
				node rl=getNodeAt(right);
				
				int rv=ll.data;
				ll.data=rl.data;
				rl.data=rv;
				
				left++;
				right--;
			
			
			
			
		}
		
			
		
	}
    
	public void reversePointer()throws Exception{
		int left=0;
			int right=this.size-1;
			while(left<right){
				node ll=getNodeAt(left);
				node rl=getNodeAt(right);
				
				node rv=ll;
				ll=rl;
				rl=rv;
				
				left++;
				right--;
			
			
			
			
		}
	}

    public void midNode()throws Exception{
		node fast=this.head;
		node slow=this.head;
		while(fast.next !=null && fast.next.next !=null){
			fast=fast.next.next;
			
			slow=slow.next;
		}
		System.out.println(slow.data);
		
		
	}

    public int size(){
		return this.size;
	}
	
	public boolean isEmpty(){
		return this.size()==0;
	}
    
	public void kthNodeFromLast(int k)throws Exception{
		if(k<0 || k>=this.size){
			throw new Exception("Invalid Value of K");
			
		}
		
		node slow=this.head;
		node fast=this.head;
		for(int i=0; i<k; i++){
			fast=fast.next;
		}
		
		while(fast!=null){
			slow=slow.next;
			fast=fast.next;
		}
		int a=slow.data;
		System.out.println(a);
	}
		

}