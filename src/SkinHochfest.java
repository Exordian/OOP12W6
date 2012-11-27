
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SkinHochfest extends Skin {
	//only Beschuetzer and Schwerarbeiter are allowed to have a high-strength skin
	
	@Override
	void attachToBeschuetzer(Beschuetzer a) {
		//a != null;
		a.attachAfterCheck(this);
		//high-strength skin has been attached to Beschuetzer
	}
	
	@Override
	void attachToSchwerarbeiter(Schwerarbeiter a) {
		//a != null;
		a.attachAfterCheck(this);
		//high-strength skin has been attached to Schwerarbeiter
	}
	
	public String toString () {
		return "SkinHochfest";
		//returns a string of type of skin
	}

}
