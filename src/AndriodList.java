import java.util.TreeMap;


public class AndriodList extends TreeMap<Integer, Android> {
	
	public void insert(Android a) {
		// Check contrains
		this.put(a.getSnr(), a);
	}
	
	public Android find(Integer i) {
		return this.get(i);
	}
	
}
