
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareHilfskraefte extends SoftwareLevel1 {
	//subtype of android is implicitly given by software;
	
	@Override	
	void attachToBediener(Bediener a) {
		//a != null;
		a.attachSoftwareLevel1(this);
		//software has been attached to Bediener
	}
	
	public String toString () {
		return "SoftwareHilfskraefte";
		//returns a string of type of software/subtype of android
	}

}
