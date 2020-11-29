import java.util.HashMap;

public class graph{
	private class Vertex{
		HashMap<String, Integer> nbrs=new HashMap<>();
	}
	
	HashMap<String, Vertex> vtces;
	
	public graph(){
		vtces=new HashMap<>();
	}
}