import java.util.TreeMap;

/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class AndriodList extends TreeMap<Integer, Android> {
	
	public void insert(Android a) {
		//a != null;
		this.put(a.getSnr(), a);
		//android has been added to androidlist
	}
	
	public Android find(Integer i) {
		//i != null;
		return this.get(i);
		//returns: -if i is in treemap: android with serial number i
		//		   -else: 				null
	}
	
}
