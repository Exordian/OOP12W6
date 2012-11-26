
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class SkinBeruehrungssensitiv extends Skin {
		
	@Override
	void attachToBediener(Bediener a) {
		a.attachAfterCheck(this);
	}
	@Override
	void attachToSchwerarbeiter(Schwerarbeiter a) {
		a.attachAfterCheck(this);
	}
	@Override
	void attachToBeschuetzer(Beschuetzer a) {
		a.attachAfterCheck(this);
	}
	
	public String toString () {
		return "SkinBeruehrungssensitiv";
	}
}
