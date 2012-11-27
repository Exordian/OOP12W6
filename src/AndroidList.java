import java.util.TreeMap;

/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class AndroidList extends TreeMap<Integer, Android> {
	//Map is sorted because of TreeMap
	
	public String insert(Android a) {
		//a != null;
		if(a.getKit() == null || a.getSkin() == null || a.getSoftware() == null) {
			//android not complete
			return "Android " + a.getSnr() + " not sent out";
		}
		this.put(a.getSnr(), a);
		return "Android " + a.getSnr() + " sent out";
		//returns 1 if android has been added to androidList, -1 if not
	}

	public Android find(Integer i) {
		//i != null;
		return this.get(i);
		//returns: -if i is in treemap: android with serial number i
		//		   -else: 				null
	}

}
