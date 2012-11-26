
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareKaempfer extends SoftwareLevel5 {

	void attachToBeschuetzer(Beschuetzer a) {
		a.attachSoftwareLevel5(this);
	}
	public String toString () {
		return "SoftwareKaempfer";
	}

}
