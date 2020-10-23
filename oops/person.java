
public class person {
	private String name;
	private int age;
	
    public person(){
		return;
	}
	
	public person(int age,String naam){
		this.age=age;
		this.name=naam;
	}
	
	
	public String getname(){
		return name;
	}
	
	public void setname(String naam){
		this.name=naam;
	}
	
	public int getage(){
		return age;
	}
	
    public void setage(int age){
		this.age =age;
	}
	
}