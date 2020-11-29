import java.util.HashMap;
import java.io.*; 
import java.util.*; 
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
	
	public int numEdges(){
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		int count=0;
		for(String key :keys){
			Vertex vtc=vtces.get(key);
			int size=vtc.nbrs.size();
			count=count+size;
		}
		return count/2;
	}
	
	public boolean containsEdge(String vname1, String vname2){
		Vertex vtc=vtces.get(vname1);
		/*ArrayList<String> keys=new ArrayList<>(vtc.nbrs.keySet());
		for(String key :keys){
		    if(key==vname2){
				return true;
			}
		}*/
		if(vtc.nbrs.containsKey(vname2)){
			return true;
		}
		return false;
	}
	
	
}