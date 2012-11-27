
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareServiceTechniker extends SoftwareLevel3{
	//subtype of android is implicitly given by software;
	
	@Override	
	void attachToSchwerarbeiter(Schwerarbeiter a) {
		//a != null;
		a.attachSoftwareLevel3(this);
		//software has been attached to Schwerarbeiter
	}
	
	public String toString () {
		return "SoftwareServiceTechniker";
		//returns a string of type of software/subtype of android
	}

}
