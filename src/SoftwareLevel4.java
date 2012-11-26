
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareLevel4 extends Software {
	@Override	
	void checkLevel4(Android a, SoftwareLevel4 s) {
		a.attachAfterCheck(s);
	}
	public String toString () {
		return "SoftwareLevel4";
	}

}
