
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Schwerarbeiter extends Android {

	void attachSoftware(SoftwareBauarbeiter s) {
		s.attachToSchwerarbeiter(this);
	}

	void attachSoftware(SoftwareServiceTechniker s) {
		s.attachToSchwerarbeiter(this);
	}

	void attachSoftware(SoftwareTransportarbeiter s) {
		s.attachToSchwerarbeiter(this);
	}

	@Override
	public void attachSoftwareLevel3(SoftwareLevel3 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel3(this, software);

	}
	@Override
	public void attachSoftwareLevel4(SoftwareLevel4 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel4(this, software);
		
	}
	@Override
	public void attachSkinGepanzert(SkinGepanzert skin) {
		skin.attachToSchwerarbeiter(this); 
	}
	@Override
	public void attachSkinHochfest(SkinHochfest skin) {
		skin.attachToSchwerarbeiter(this); 
	}
	@Override	
	public void attachSkinBeruehrungssensiv(SkinBeruehrungssensitiv skin) {
		skin.attachToSchwerarbeiter(this); 
	}

}
