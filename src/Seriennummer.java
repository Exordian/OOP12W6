
public class Seriennummer {
	private static int cSnr = 1;
	private int snr;
	
	public Seriennummer () {
		this.snr = cSnr++;
	}
}
