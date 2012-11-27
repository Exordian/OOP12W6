
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Bediener extends Android {
	//Bediener only can have software level of either 1 or 2;
	//Bediener always has to have a touch-sensitive skin;
	//subtype of android is implicitly given by software;

	void attachSoftware(SoftwareHilfskraefte s) {
		//s != null;
		s.attachToBediener(this);
		//SoftwareHilfskraefte s has been attached to Bediener
	}

	void attachSoftware(SoftwareGesellschafter s) {
		//s != null;
		s.attachToBediener(this);
		//SoftwareGesellschafter s has been attached to Bediener
	}

	public void attachSoftwareLevel1(SoftwareLevel1 software) {
		//Bediener only can have software level of either 1 or 2;
		//software != null;
		if(this.software == null) {
			addToLog("Software set to: " + software.toString()); //add logentry
			this.software = software;
			//software has been set
		} else
			this.software.checkLevel1(this, software);
			//software has been changed
	}

	public void attachSoftwareLevel2(SoftwareLevel2 software) {
		//Bediener only can have software level of either 1 or 2;
		//software != null;
		if(this.software == null) {
			addToLog("Software set to: " + software.toString()); //add logentry
			this.software = software;
			//software has been set
		} else
			this.software.checkLevel2(this, software);
			//software has been changed

	}

	@Override
	public void attachSkinHochfest(SkinHochfest skin) {
		//skin != null;
		skin.attachToBediener(this); 
		//high-strength skin has been attached to Bediener
	}

	@Override
	public void attachSkinBeruehrungssensitiv(SkinBeruehrungssensitiv skin) {
		//skin != null;
		skin.attachToBediener(this); 
		//touch-sensitive skin has been attached to Bediener;
	}

}
