
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public abstract class Kit extends AndroidPart {
	void attachKitBelow1kW(Android a) {};	//a != null;
	void attachKitBelow5kW(Android a) {};	//a != null;
	void attachKitBelow10kW(Android a) {};	//a != null;
	void attachKitUnlimited(Android a) {};	//a != null;
}
