
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareLevel5 extends Software {
	@Override	
	void checkLevel5(Android a, SoftwareLevel5 s) {
		//a != null; s != null;
		a.attachAfterCheck(s);
		//software has been set/changed
	}

	public String toString () {
		return "SoftwareLevel5";
		//returns a string of type of software level
	}

	void attachKit(KitBelow1kW kit, Android a) {
		//kit != null, a != null
		a.attachAfterCheck(kit);
		//attaches kit to android
	}

	void attachKit(KitBelow5kW kit, Android a) {
		//kit != null, a != null
		a.attachAfterCheck(kit);
		//attaches kit to android
	}

	void attachKit(KitBelow10kW kit, Android a) {
		//kit != null, a != null
		a.attachAfterCheck(kit);
		//attaches kit to android
	}

	void attachKit(KitUnlimited kit, Android a) {
		//kit != null, a != null
		a.attachAfterCheck(kit);
		//attaches kit to android
	}

}
