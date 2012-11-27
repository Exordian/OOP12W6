
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public abstract class Android {
	//subtype of android is implicitly given by software;
	
	private static Integer cSnr = 0;
	protected final Integer snr;
	private String log;
	protected Software software = null;
	protected Skin skin = null;

	public void attachSoftwareLevel1(SoftwareLevel1 software) {}
	public void attachSoftwareLevel2(SoftwareLevel2 software) {}
	public void attachSoftwareLevel3(SoftwareLevel3 software) {}
	public void attachSoftwareLevel4(SoftwareLevel4 software) {}
	public void attachSoftwareLevel5(SoftwareLevel5 software) {}

	public void attachSkinGepanzert(SkinGepanzert skin) {}
	public void attachSkinHochfest(SkinHochfest skin) {}
	public void attachSkinBeruehrungssensiv(SkinBeruehrungssensitiv skin) {}

	public Android() {
		//snr cannot be changed after initializing;
		this.snr = ++cSnr;
		log = "";
	}

	protected void addToLog(String logentry) {
		//logentry != null;
		log += logentry + "\n";
		//logentry has been added to log
	}

	public String getLog() {
		return log;
		//returns log
	}

	public Integer getSnr() {
		return snr;
		//returns serial number
	}

	public void attachAfterCheck(SoftwareLevel1 s) {
		//s != null;
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString()); //add logentry
		// set power here
		
		//software got changed
	}

	public void attachAfterCheck(SoftwareLevel2 s) {
		//s != null;
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString()); //add logentry
		// set power here
		
		//software got changed
	}

	public void attachAfterCheck(SoftwareLevel3 s) {
		//s != null;
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString()); //add logentry
		// set power here
		
		//software got changed
	}

	public void attachAfterCheck(SoftwareLevel4 s) {
		//s != null;
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString()); //add logentry
		// set power here
		
		//software got changed
	}

	public void attachAfterCheck(SoftwareLevel5 s) {
		//s != null;
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString()); //add logentry
		// set power here
		
		//software got changed
	}

	public void attachAfterCheck(Skin s) {
		//s != null;
		this.skin = s;
		s.setSnr(snr);
		addToLog("Changed Skin to: " + s.toString()); //add logentry
		//skin got changed
	}
}
