
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareLevel1 extends Software {
	void checkLevel1(Android a, SoftwareLevel1 s) {
		a.attachAfterCheck(s);
	}
	
	public String toString () {
		return "SoftwareLevel1";
	}

}
