
public class Bediener extends Android {
	
	void attachSoftware(SoftwareHilfskraefte s) {
		s.attachToBediener(this);
	}
	
	void attachSoftware(SoftwareGesellschafter s) {
		s.attachToBediener(this);
	}

	public void attachSkinBeruehrungssensiv(SkinBeruehrungssensiv skin) {
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

}
