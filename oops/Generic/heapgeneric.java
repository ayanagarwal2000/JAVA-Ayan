import java.util.ArrayList;

public class heapgeneric<T extends Comparable>{
	
	ArrayList<T> data=new ArrayList<>();
	
	public void add(T item){
		data.add(item);
		upheapify(data.size()-1);
		
	}
	
	private void upheapify(int ci){
		int pi=(ci-1)/2;
		
		if(isLarger(data.get(ci),data.get(pi))>0){
			swap(ci,pi);
			upheapify(pi);
		}
	}
	private void swap(int i, int j){
		T ith=data.get(i);
		T jth=data.get(j);
		data.set(i, jth);
		data.set(j, ith);
	}
	public void display(){
		System.out.println(data);
	}
	public int size(){
		return data.size();
	}
	public boolean isEmpty(){
		return data.size()==0;
	}
	public T remove(){
		swap(0,data.size()-1);
		T rv =data.remove(data.size()-1);
		downheapify(0);
		
		return rv;
		
	}
	
	private void downheapify(int pi){
		int lci= 2*pi+1;
		int rci=2*pi+2;
		
		int mini=pi;
		
		if (rci< data.size() && isLarger(data.get(lci),data.get(mini))>0){
			mini=lci;
		}
		if (lci< data.size() && isLarger(data.get(rci),data.get(mini))>0){
			mini=rci;
		}
		if (mini!=pi){
			swap(mini,pi);
			downheapify(mini);
			
		}
	}
	public T get(){
		return data.get(0);
	}
	// if t is having higher priority return +ve value
	public int isLarger(T t,T o){
		return t.compareTo(o);
	}
}