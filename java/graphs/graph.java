import java.util.HashMap;
import java.io.*; 
import java.util.*;
import java.util.LinkedList; 
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
	
	public void removeVertex(String vname){
		Vertex vtx= vtces.get(vname);
		ArrayList<String> keys=new ArrayList<>(vtx.nbrs.keySet());
		
		for(String key :keys){
			Vertex nbrVtx=vtces.get(key);
			nbrVtx.nbrs.remove(vname);
			
		}
		vtces.remove(vname);
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
	
	public void addEdge(String vname1, String vname2, int cost){
		Vertex vtx1=vtces.get(vname1);
		Vertex vtx2=vtces.get(vname2);
		if(vtx1.nbrs.containsKey(vname2)){
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}
	
	public void removeEdge(String vname1, String vname2){
		Vertex vtx1=vtces.get(vname1);
		Vertex vtx2=vtces.get(vname2);
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)){
			return;
		}
		vtx1.nbrs.remove(vname1);
		vtx2.nbrs.remove(vname2);
	}
	
	public void display(){
		
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		
		for(String key: keys){
			System.out.println("------------------------------------");
			Vertex vtx=vtces.get(key);
			System.out.println(key+ " - "+ vtx.nbrs);
			System.out.println("------------------------------------");
		}
	}
	
	public boolean hasPath(String vname1, String vname2, HashMap<String,Boolean> processed){
		processed.put(vname1,true);
		if(containsEdge(vname1,vname2)){
			return true;
		}
		Vertex vtx=vtces.get(vname1);
		ArrayList<String> keys=new ArrayList<>(vtx.nbrs.keySet());
		
		for(String key :keys){
			if(!processed.containsKey(key) && hasPath(key,vname2, processed)){
				return true;
			}
			
		}
		return false;
	}
	
	private class pair{
		String vname;
		String pfs;
	}
	
	public void bfs(String src, String dst){
		HashMap<String,Boolean> processes=new HashMap<>();
		LinkedList<pair> queue=new LinkedList<>();
		
		pair sp=new pair();
		sp.vname=src;
		sp.pfs=src;
		
		while(!queue.isEmpty()){
			pair rp=queue.removeFirst();
			
		    processed.put(rp.vname,true);
			
			if(containsEdge(rp.vname,dst)){
				return true;
			}
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String> keys=new ArrayList<>(rpvtx.nbrs.keySet());
			
		}
		
	}
}