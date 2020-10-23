 import java.util.Comparator;
 
public class carspeedcomparator implements Comparator <car>{
	
	public int compare(car tcar, car ocar){
		return tcar.speed - ocar.speed;
	}
	
}