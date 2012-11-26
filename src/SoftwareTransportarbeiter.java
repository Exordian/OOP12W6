
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareTransportarbeiter extends SoftwareLevel4 {

	void attachToSchwerarbeiter(Schwerarbeiter a) {
		a.attachSoftwareLevel4(this);
	}
	public String toString () {
		return "SoftwareTransportarbeiter";
	}

}
