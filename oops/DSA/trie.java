import java.util.HashMap;
import java.io.*; 
import java.util.*; 
public class trie{
	private class Node{
		char data;
		HashMap<Character,Node> children;
		boolean isTerminal;
		
		Node(char data, boolean isTerminal){
			this.data=data;
			this.children=new HashMap<>();
			this.isTerminal=isTerminal;
		}
	}
		private int numWords;
		private Node root;
		private Object addWord;
		private Object display;
		private Object search;
		
		trie(){
			this.root=new Node('\0',false);
			this.numWords=0;
			
		}
		public int numWords(){
			return this.numWords;
		}
		
		public void addWord(String word){
			this.addWord=addWord(this.root,word);
		}
		private Object addWord(Node parent,String word){
			if(word.length()==0){
				if(parent.isTerminal){
					//Word is already in the dictionary
				}else{
					parent.isTerminal=true;
					this.numWords++;
				}
				return word;
			}
			
			
			char cc=word.charAt(0);
			String ros=word.substring(1);
			Node child= parent.children.get(cc);
			if(child==null){
				child=new Node(cc,false);
			
				//child.data=cc;
				//child.isTerminal=false;
				parent.children.put(cc,child);
			}
			this.addWord(child,ros);
			String str=" **";
			return  str;
		}
		
		public void display(){
			this.display=display(root,"");
		}
		private Object display(Node node, String osf){
			if(node.isTerminal){
				String todisplay=osf.substring(1)+node.data;
				System.out.println(todisplay);
			}
			
			Set<Map.Entry<Character,Node>> entries=node.children.entrySet();
			for(Map.Entry<Character,Node> entry: entries){
			    this.display(entry.getValue(),osf+node.data);
			}
			String str=" **";
			return  str;
		}
		
		public void search(String word){
			this.search=search(this.root,word);
		}
		private Object search(Node parent,String word){
			if(word.length()==0){
				if(parent.isTerminal){
					System.out.println(true);
				}
				else{
					System.out.println(false);
				}
			}
			char cc=word.charAt(0);
			String ros=word.substring(1);
			Node child= parent.children.get(cc);
			if(child==null){
				System.out.println(false);
			}
			return this.search(child,ros);
		}
	
	
}