import java.util.Comparator;

public class CircleComparator implements Comparator<Circle>{

	@Override
	public int compare(Circle o1, Circle o2) {	
		return o1.x - o2.x; 
	}
 
	
	 
}
