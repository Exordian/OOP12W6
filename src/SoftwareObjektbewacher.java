
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareObjektbewacher extends SoftwareLevel4 {
	
	void attachToBeschuetzer(Beschuetzer a) {
		a.attachSoftwareLevel4(this);
	}
	public String toString () {
		return "SoftwareObjektbewacher";
	}

}
