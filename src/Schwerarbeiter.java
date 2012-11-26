
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

	public void attachSoftwareLevel3(SoftwareLevel3 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel3(this, software);

	}
	public void attachSoftwareLevel4(SoftwareLevel4 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel4(this, software);
		
	}

}
