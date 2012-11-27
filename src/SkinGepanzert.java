
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SkinGepanzert extends Skin {
	//only Beschuetzer are allowed to have an armored skin;
		
	@Override
	void attachToBeschuetzer(Beschuetzer a) {
		//a != null;
		a.attachAfterCheck(this);
		//armored skin has been attached to Beschuetzer
	}
	
	public String toString () {
		return "SkinGepanzert";
		//returns a string of type of skin
	}

}
