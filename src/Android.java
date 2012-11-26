
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public abstract class Android {
	private static Integer cSnr = 0;
	protected final Integer snr;
	private String log;
	protected Software software = null;
	protected Skin skin = null;
	protected int maxKW;

	public void attachSoftwareLevel1(SoftwareLevel1 software) {}
	public void attachSoftwareLevel2(SoftwareLevel2 software) {}
	public void attachSoftwareLevel3(SoftwareLevel3 software) {}
	public void attachSoftwareLevel4(SoftwareLevel4 software) {}
	public void attachSoftwareLevel5(SoftwareLevel5 software) {}

	public void attachSkinGepanzert(SkinGepanzert skin) {}
	public void attachSkinHochfest(SkinHochfest skin) {}
	public void attachSkinBeruehrungssensiv(SkinBeruehrungssensitiv skin) {}

	public Android() {
		this.snr = ++cSnr;
		log = "";
	}

	protected void addToLog(String logentry) {
		log += logentry + "\n";
	}

	public String getLog() {
		return log;
	}

	public Integer getSnr() {
		return snr;
	}

	public void attachAfterCheck(SoftwareLevel1 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		this.maxKW = 1;
	}

	public void attachAfterCheck(SoftwareLevel2 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		this.maxKW = 1;
	}

	public void attachAfterCheck(SoftwareLevel3 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		this.maxKW = 5; 
	}

	public void attachAfterCheck(SoftwareLevel4 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		this.maxKW = 10;
	}

	public void attachAfterCheck(SoftwareLevel5 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
	}

	public void attachAfterCheck(Skin s) {
		this.skin = s;
		s.setSnr(snr);
		addToLog("Changed Skin to: " + s.toString());
	}
}
