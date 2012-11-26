
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareLevel5 extends Software {
	void checkLevel2(Android a, SoftwareLevel5 s) {
		a.attachAfterCheck(s);
	}
	public String toString () {
		return "SoftwareLevel5";
	}

}
