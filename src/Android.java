
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public abstract class Android {
	//the subtype of android is implicitly given by software;

	private static Integer cSnr = 0;
	protected final Integer snr;
	private String log;
	protected Software software = null;
	protected Skin skin = null;
	protected Kit kit = null;

	public void attachSoftwareLevel1(SoftwareLevel1 software) {}
	public void attachSoftwareLevel2(SoftwareLevel2 software) {}
	public void attachSoftwareLevel3(SoftwareLevel3 software) {}
	public void attachSoftwareLevel4(SoftwareLevel4 software) {}
	public void attachSoftwareLevel5(SoftwareLevel5 software) {}

	// ask software if kit is legit
	public void attachKit(KitBelow1kW kit) {
		if(kit == null || software == null)
			return;
		software.attachKit(kit, this);
		//attached kit to software
	}
	public void attachKit(KitBelow5kW kit) {
		if(kit == null || software == null)
			return;
		software.attachKit(kit, this);
		//attached kit to software
	}
	public void attachKit(KitBelow10kW kit) {
		if(kit == null || software == null)
			return;
		software.attachKit(kit, this);
		//attached kit to software
	}
	public void attachKit(KitUnlimited kit) {
		if(kit == null || software == null)
			return;
		software.attachKit(kit, this);
		//attached kit to software
	}

	public void attachSkinGepanzert(SkinGepanzert skin) {}
	public void attachSkinHochfest(SkinHochfest skin) {}
	public void attachSkinBeruehrungssensitiv(SkinBeruehrungssensitiv skin) {}

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
		//returns the log of this android
	}

	public Integer getSnr() {
		return snr;
		//returns serial number of this android
	}

	public Kit getKit() {
		return this.kit;
		//returns the kit of this android
	}

	public Skin getSkin() {
		return this.skin;
		//returns the skin of this android
	}

	public Software getSoftware() {
		return this.software;
		//returns the software of this android
	}

	public void attachAfterCheck(Software s) {
		//s != null;
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString()); //add logentry
		//software got changed
	}

	public void attachAfterCheck(Kit k) {
		//s != null;
		this.kit = k;
		k.setSnr(snr);
		addToLog("Kit attached: " + k.toString()); //add logentry
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
