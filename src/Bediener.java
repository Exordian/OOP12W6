
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Bediener extends Android {

	void attachSoftware(SoftwareHilfskraefte s) {
		s.attachToBediener(this);
	}

	void attachSoftware(SoftwareGesellschafter s) {
		s.attachToBediener(this);
	}

	public void attachSkinBeruehrungssensiv(SkinBeruehrungssensitiv skin) {
		skin.attachToBediener(this);
	}

	public void attachSoftwareLevel1(SoftwareLevel1 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel1(this, software);
	}

	public void attachSoftwareLevel2(SoftwareLevel2 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel2(this, software);

	}

	public void attachSkinGepanzert(SkinGepanzert skin) {
		skin.attachToBediener(this);
	}

	public void attachSkinHochfest(SkinHochfest skin) {
		skin.attachToBediener(this); 
	}

	public void attachSkinBeruehrungssensiv(SkinGepanzert skin) {
		skin.attachToBediener(this); 
	}

}
