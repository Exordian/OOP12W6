
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareLevel3 extends Software {
	//subtype of android is implicitly given by software;

	@Override	
	void checkLevel3(Android a, SoftwareLevel3 s) {
		//a != null; s != null;
		a.attachAfterCheck(s);
		//software has been set/changed
	}

	public String toString () {
		return "SoftwareLevel3";
		//returns a string of type of software level
	}

	void attachKit(KitBelow1kW kit, Android a) {
		a.attachAfterCheck(kit);
	}

	void attachKit(KitBelow5kW kit, Android a) {
		//kit != null, a != null
		a.attachAfterCheck(kit);
		//attaches kit to android
	}

}
