
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareServiceTechniker extends SoftwareLevel3{
	@Override	
	void attachToSchwerarbeiter(Schwerarbeiter a) {
		a.attachSoftwareLevel3(this);
	}
	public String toString () {
		return "SoftwareServiceTechniker";
	}

}
