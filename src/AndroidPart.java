
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public abstract class AndroidPart {
	private int snr;

	protected int getSnr() {
		return snr;
		//returns serial number
	}

	protected void setSnr(int snr) {
		//snr >= 0;
		this.snr = snr;
		//serial number has been set
	}
	
}
