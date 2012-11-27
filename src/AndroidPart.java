
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
