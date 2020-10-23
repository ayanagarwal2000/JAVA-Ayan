public class stackusingarray{
	private int[] data;
	private int top;
	
	public static final int defcapacity =10;
	
	public stackusingarray()throws Exception{
		this(defcapacity);
	}
	
	public stackusingarray(int capacity) throws Exception{
		if(capacity<1){
			throw new Exception("Underflow");
		}
		this.data=new int[capacity];
		this.top=-1;
	}
	 public int topdisplay(){
		return this.top;
	}
	
    public int size(){
		return this.top+1;
	}
	public boolean isEmpty(){
		return this.size()==0;
	}
	
	public void push(int value) throws Exception{
		if(this.size()==this.data.length){
		throw new Exception("Stack is full!!!");		
		}
		this.top++;
		this.data[this.top]=value;
		
	}
	
	public int pop()throws Exception{
		if(this.top==-1){
			throw new Exception("Stack is empty!!!!");
	}
	    int rv =this.data[this.top];
		this.top--;
		this.data[(this.top)+1]=0;
		return  rv;
	}
	
	public void display(){
		for(int i=0; i<this.top +1;i++){
			System.out.println(this.data[i]);
			
			
		}
		System.out.println("END");
	}
	
	public int peek(){
		//int a=this.top;
	    //System.out.println(this.data[a]);
		return this.data[this.top];
	}
	
	
	
	
}