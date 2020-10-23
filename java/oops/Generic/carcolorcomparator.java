 import java.util.Comparator;
 
public class carcolorcomparator implements Comparator <car>{
	
	public int compare(car tcar, car ocar){
		return tcar.color.compareTo(ocar.color);
	}
	
}