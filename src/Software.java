
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Software extends AndroidPart {
	//subtype of android is implicitly given by software;
	
	void attachToBediener(Bediener a) {}			 //a != null;
	void attachToBeschuetzer(Beschuetzer a) {}		 //a != null;
	void attachToSchwerarbeiter(Schwerarbeiter a) {} //a != null;

	void checkLevel1(Android a, SoftwareLevel1 s) {} //a != null; s != null;
	void checkLevel2(Android a, SoftwareLevel2 s) {} //a != null; s != null;
	void checkLevel3(Android a, SoftwareLevel3 s) {} //a != null; s != null;
	void checkLevel4(Android a, SoftwareLevel4 s) {} //a != null; s != null;
	void checkLevel5(Android a, SoftwareLevel5 s) {} //a != null; s != null;

	void attachKit(KitBelow1kW kit, Android a) {}
	void attachKit(KitBelow5kW kit, Android a) {}
	void attachKit(KitBelow10kW kit, Android a) {}
	void attachKit(KitUnlimited kit, Android a) {}
	
}
