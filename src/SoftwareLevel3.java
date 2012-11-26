
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareLevel3 extends Software {
	void checkLevel3(Android a, SoftwareLevel3 s) {
		a.attachAfterCheck(s);
	}
	public String toString () {
		return "SoftwareLevel3";
	}

}
