
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Schwerarbeiter extends Android {
	//Schwerarbeiter only can have software level of 3 and 4;
	//subtype of android is implicitly given by software;

	void attachSoftware(SoftwareBauarbeiter s) {
		//s != null;
		s.attachToSchwerarbeiter(this);
		//SoftwareBauarbeiter s has been attached to Schwerarbeiter;
	}

	void attachSoftware(SoftwareServiceTechniker s) {
		//s != null;
		s.attachToSchwerarbeiter(this);
		//SoftwareServiceTechniker s has been attached to Schwerarbeiter;
	}

	void attachSoftware(SoftwareTransportarbeiter s) {
		//s != null;
		s.attachToSchwerarbeiter(this);
		//SoftwareTransportarbeiter s has been attached to Schwerarbeiter;
	}

	@Override
	public void attachSoftwareLevel3(SoftwareLevel3 software) {
		//Schwerarbeiter only can have software level of 3 and 4;
		//software != null;
		if(this.software == null) {
			addToLog("Software set to: " + software.toString()); //add logentry
			this.software = software;
			//software has been set
		} else
			this.software.checkLevel3(this, software);
			//software has been changed

	}
	
	@Override
	public void attachSoftwareLevel4(SoftwareLevel4 software) {
		//Schwerarbeiter only can have software level of 3 and 4;
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
	public void attachSkinGepanzert(SkinGepanzert skin) {
		//skin != null;
		skin.attachToSchwerarbeiter(this); 
		//armored skin has been attached to Schwerarbeiter
	}
	
	@Override
	public void attachSkinHochfest(SkinHochfest skin) {
		//skin != null;
		skin.attachToSchwerarbeiter(this); 
		//high-strength skin has been attached to Schwerarbeiter
	}
	
	@Override	
	public void attachSkinBeruehrungssensiv(SkinBeruehrungssensitiv skin) {
		//skin != null;
		skin.attachToSchwerarbeiter(this); 
		//touch-sensitive skin has been attached to Schwerarbeiter
	}

}
