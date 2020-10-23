 import java.util.Comparator;
 
public class carpricecomparator implements Comparator <car>{
	
	public int compare(car tcar, car ocar){
		return ocar.price - tcar.price;
	}
	
}