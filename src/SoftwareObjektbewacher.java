
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareObjektbewacher extends SoftwareLevel4 {
	//subtype of android is implicitly given by software
	
	@Override	
	void attachToBeschuetzer(Beschuetzer a) {
		//a != null;
		a.attachSoftwareLevel4(this);
		//software has been attached to Beschuetzer
	}
	
	public String toString () {
		return "SoftwareObjektbewacher";
		//returns a string of type of software/subtype of android
	}

}
