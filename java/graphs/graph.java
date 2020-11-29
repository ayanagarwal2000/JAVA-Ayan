import java.util.HashMap;

public class graph{
	private class Vertex{
		HashMap<String, Integer> nbrs=new HashMap<>();
	}
	
	HashMap<String, Vertex> vtces;
	
	public graph(){
		vtces=new HashMap<>();
	}
	
	public int numvertex(){
		return this.vtces.size();
	}
	
	public Boolean containVertex(String vname){
		return this.vtces.containsKey(vname);
	}
	
	public void addVertex(String vname){
		Vertex vtc=new Vertex();
		vtces.put(vname, vtc);
	}
	
}