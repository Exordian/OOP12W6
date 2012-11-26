import java.util.TreeMap;

/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class AndriodList extends TreeMap<Integer, Android> {
	
	public void insert(Android a) {
		// Check contains
		this.put(a.getSnr(), a);
	}
	
	public Android find(Integer i) {
		return this.get(i);
	}
	
}
