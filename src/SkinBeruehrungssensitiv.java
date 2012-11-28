
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SkinBeruehrungssensitiv extends Skin {
	//Bediener always have to have a touch-sensitive skin
		
	@Override
	void attachToBediener(Bediener a) {
		//a != null;
		a.attachAfterCheck(this);
		//skin got attached to Bediener
	}
	
	@Override
	void attachToSchwerarbeiter(Schwerarbeiter a) {
		//a != null;
		a.attachAfterCheck(this);
		//skin got attached to Schwerarbeiter
	}
	
	@Override
	void attachToBeschuetzer(Beschuetzer a) {
		//a != null;
		a.attachAfterCheck(this);
		//skin got attached to Beschuetzer
	}
	
	public String toString () {
		return "SkinBeruehrungssensitiv";
		//returns a string of type of skin
	}
}
