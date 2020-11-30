import java.io.*; 
import java.util.*; 
public class graphclient{
	public static void main (String[] arg){
		graph graph=new graph();
		
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		graph.addVertex("H");
		
		graph.addEdge("A","B", 2);
		graph.addEdge("A","B", 3);
		graph.addEdge("B","C", 1);
		graph.addEdge("C","D", 5);
		graph.addEdge("D","E", 8);
		graph.addEdge("E","F", 3);
		graph.addEdge("E","G", 6);
		graph.addEdge("F","G", 9);
		
		graph.display();
		//System.out.println(graph.containsEdge("A","G"));
		
		System.out.println(graph.hasPath("A","E",new HashMap<>()));
		//System.out.println(graph.hasPath("A",""));
	}
}