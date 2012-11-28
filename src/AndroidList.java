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
			return "Incomplete android " + a.getSnr() + " not sent out";
		}
		this.put(a.getSnr(), a);
		return "Complete android " + a.getSnr() + " sent out";
		//returns 1 if android has been added to androidList, -1 if not
	}

	public String find(Integer i) {
		//i != null;
		if (this.get(i) == null) {
			return null;
		} else {
			return "Android: " + this.get(i).getSnr() + " (" + this.get(i).getCurrentParts() + ")";
		}
		//returns: -if i is in treemap: android with serial number i and his attachments
		//		   -else: 				null
	}

}
