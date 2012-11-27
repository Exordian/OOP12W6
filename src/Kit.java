
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Kit {
	private final int kW;
	
	public Kit(int kW) {
		//kW >= 0;
		//kW cannot be changed after initializing;
		this.kW = kW;
	}
	
	public int getKW() {
		return this.kW;
		//returns kilowatts kW
	}
}
