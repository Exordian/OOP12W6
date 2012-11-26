
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareLeibwaechter extends SoftwareLevel4 {
	@Override	
	void attachToBeschuetzer(Beschuetzer a) {
		a.attachSoftwareLevel4(this);
	}
	public String toString () {
		return "SoftwareLeibwaechter";
	}

}
