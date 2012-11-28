
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

	void attachSoftwareLevel1(SoftwareLevel1 software) {}	//software != null;
	void attachSoftwareLevel2(SoftwareLevel2 software) {}	//software != null;
	void attachSoftwareLevel3(SoftwareLevel3 software) {}	//software != null;
	void attachSoftwareLevel4(SoftwareLevel4 software) {}	//software != null;
	void attachSoftwareLevel5(SoftwareLevel5 software) {}	//software != null;

	//must be usable from outside the package (even though we are not allowed to use packages)
	public void attachSoftware(SoftwareHilfskraefte s) {}		//s != null;
	public void attachSoftware(SoftwareGesellschafter g) {}		//g != null;
	public void attachSoftware(SoftwareBauarbeiter b) {}		//b != null;
	public void attachSoftware(SoftwareServiceTechniker k) {}	//k != null;
	public void attachSoftware(SoftwareTransportarbeiter t) {}	//t != null;
	public void attachSoftware(SoftwareObjektbewacher o) {}		//o != null;
	public void attachSoftware(SoftwareLeibwaechter l) {}		//l != null;
	public void attachSoftware(SoftwareKaempfer k) {}			//k != null;

	//must be usable from outside the package (even though we are not allowed to use packages)
	public void attachSkinGepanzert(SkinGepanzert skin) {}		//skin != null;
	public void attachSkinHochfest(SkinHochfest skin) {}		//skin != nulll;
	public void attachSkinBeruehrungssensitiv(SkinBeruehrungssensitiv skin) {} //skin != null;

	//ask software (due to the implicit softwareLevel which contains the
	//information about the usable power) if it is valid to attach this kit
	public void attachKit(KitBelow1kW kit) {
		if(kit == null || software == null)
			return;
		software.attachKit(kit, this);
		//kit has been attached to android
	}
	public void attachKit(KitBelow5kW kit) {
		if(kit == null || software == null)
			return;
		software.attachKit(kit, this);
		//kit has been attached to android
	}
	public void attachKit(KitBelow10kW kit) {
		if(kit == null || software == null)
			return;
		software.attachKit(kit, this);
		//kit has been attached to android
	}
	public void attachKit(KitUnlimited kit) {
		if(kit == null || software == null)
			return;
		software.attachKit(kit, this);
		//kit has been attached to android
	}

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

	public String getCurrentParts() {
		return "Attachments: Software: " + this.getSoftware()
				+ ", Skin: " + this.getSkin() + ", Kit: "  + this.getKit();
		//returns the current parts of this android
	}

	void attachAfterCheck(Software s) {
		//s != null;
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString()); //add logentry
		//software was attached and parts' serialnumber is now the androids serialnumber
	}

	void attachAfterCheck(Kit k) {
		//s != null;
		this.kit = k;
		k.setSnr(snr);
		addToLog("Kit attached: " + k.toString()); //add logentry
		//kit was attached and parts' serialnumber is now the androids serialnumber
	}

	void attachAfterCheck(Skin s) {
		//s != null;
		this.skin = s;
		s.setSnr(snr);
		addToLog("Changed Skin to: " + s.toString()); //add logentry
		//skin was attached and parts' serialnumber is now the androids serialnumber
	}
}
