
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareGesellschafter extends SoftwareLevel1 {
	@Override	
	void attachToBediener(Bediener a) {
		a.attachSoftwareLevel1(this);
	}
	public String toString () {
		return "SoftwareGesellschafter";
	}

}
