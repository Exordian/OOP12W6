
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
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
	@Override	
	public void attachSoftwareLevel4(SoftwareLevel4 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel4(this, software);

	}
	@Override
	public void attachSoftwareLevel5(SoftwareLevel5 software) {
		if(this.software == null) {
			addToLog("Software set to: " + software.toString());
			this.software = software;
		} else
			this.software.checkLevel5(this, software);
	}
	@Override
	public void attachSkinGepanzert(SkinGepanzert skin) {
		skin.attachToBeschuetzer(this); 
	}

}
