
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public abstract class Skin extends AndroidPart {
	void attachToBediener(Bediener a) {}			 //a != null;
	void attachToBeschuetzer(Beschuetzer a) {}		 //a != null
	void attachToSchwerarbeiter(Schwerarbeiter a) {} //a != null;
}
