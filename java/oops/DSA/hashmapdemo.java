import java.util.HashMap; 
import java.io.*; 
import java.util.*; 
public class hashmapdemo{
     public static void main (String[] arg){
		 
		 HashMap<String,Integer> map=new HashMap<>();
		 map.put("USA",200);
		 map.put("UK",150);
		 map.put("India",300);
		 map.put("China",350);
		 System.out.println(map);
		 map.put("Sweden",100);
		 System.out.println(map);
		 map.put("India",325);
		 System.out.println(map);
		 System.out.println(map.get("India"));
		 System.out.println(map.get("india"));
		 
		  System.out.println(map.remove("USA"));
		  System.out.println(map);
		  
		  System.out.println(map.containsKey("India"));
		  System.out.println(map.containsKey("USA"));
		  
		  System.out.println("**************************KEYS****************************");
		  Set<String> keys=map.keySet();
		  for(String key:keys){
			  System.out.println(key);
		  }
		  
		  
		 System.out.println("**************************VALUES****************************");
		 Collection<Integer> values=map.values();
		  for(Integer value:values){
			  System.out.println(value);
		  }
		  
		  System.out.println("**************************EntrySet****************************");
		  Set<Map.Entry<String,Integer>> entries=map.entrySet();
		  for(Map.Entry<String,Integer> entry :entries){
			  System.out.println(entry.getKey() + "=>" + entry.getValue());
			  
		  }
		  System.out.println("**************************Max Occuring Character****************************");
		  String str="aabbaaabcdda";
		  char cm=getMaxFreq(str);
		   System.out.println(cm);
	 }
		  public static char getMaxFreq(String str){
			  HashMap<Character,Integer> map=new HashMap<>();
			  for(int i=0; i<str.length(); i++){
				  char cc=str.charAt(i);
				  if(map.containsKey(cc)){
					  int old=map.get(cc);
					  int naya=old+1;
					  map.put(cc,naya);
				  }else{
					  map.put(cc,1);
				  }
			  }
			  
			  char maxchar ='\0';
			  int max=0;
			   Set<Map.Entry<Character,Integer>> entries=map.entrySet();
		       for(Map.Entry<Character,Integer> entry :entries){
				   if(entry.getValue()>max){
					   max=entry.getValue();
					   maxchar=entry.getKey();
				   }
			   }
			   return maxchar;
		  }
	 
}