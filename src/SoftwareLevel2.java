
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SoftwareLevel2 extends Software {
	//subtype of android is implicitly given by software;
	
	@Override	
	void checkLevel2(Android a, SoftwareLevel2 s) {
		//a != null; s != null;
		a.attachAfterCheck(s);
		//software has been set/changed
	}
	
	public String toString () {
		return "SoftwareLevel2";
		//returns a string of type of software level
	}

}
