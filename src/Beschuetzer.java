
public class Beschuetzer extends Android {

	void attachSoftware(SoftwareLeibwaechter s) {
		s.attachToBeschuetzer(this);
	}
	
	void attachSoftware(SoftwareKaempfer s) {
		s.attachToBeschuetzer(this);
	}
	
	void attachSoftware(SoftwareObjektbewacher s) {
		s.attachToBeschuetzer(this);
	}

	public void attachSoftwareLevel4(SoftwareLevel4 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel4(this, software);

	}
	public void attachSoftwareLevel5(SoftwareLevel5 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel5(this, software);
	}

}
