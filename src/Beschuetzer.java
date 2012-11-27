
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Beschuetzer extends Android {
	//Besch�tzer must have a software level of 4, 
	//except for K�mpfer who must have a software level of 5;
	//Besch�tzer must have an armored skin;
	//subtype of android is implicitly given by software;

	void attachSoftware(SoftwareLeibwaechter s) {
		//s != null;
		s.attachToBeschuetzer(this);
		//SoftwareLeibwaechter s has been attached to Beschuetzer
	}

	void attachSoftware(SoftwareKaempfer s) {
		//s != null;
		s.attachToBeschuetzer(this);
		//SoftwareKaempfer s has been attached to Beschuetzer
	}

	void attachSoftware(SoftwareObjektbewacher s) {
		//s != null;
		s.attachToBeschuetzer(this);
		//SoftwareObjektbewacher s has been attached to Beschuetzer
	}
	
	@Override	
	public void attachSoftwareLevel4(SoftwareLevel4 software) {
		//Besch�tzer must have a software level of 4,
		//except for K�mpfer who must have a software level of 5;
		//software != null;
		if(this.software == null) {
			addToLog("Software set to: " + software.toString()); //add logentry
			this.software = software;
			//software has been set
		} else
			this.software.checkLevel4(this, software);
			//software has been changed

	}
	
	@Override
	public void attachSoftwareLevel5(SoftwareLevel5 software) {
		//K�mpfer must have a software level of 5;
		//software != null;
		if(this.software == null) {
			addToLog("Software set to: " + software.toString()); //add logentry
			this.software = software;
			//software has been set
		} else
			this.software.checkLevel5(this, software);
			//software has been changed
	}
	
	@Override
	public void attachSkinGepanzert(SkinGepanzert skin) {
		//Besch�tzer must have an armored skin;
		//skin != null;
		skin.attachToBeschuetzer(this); 
		//armored skin has been attached to Besch�tzer
	}

}
