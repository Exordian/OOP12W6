
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Test {

	//			General info:
	//
	// 			Subtype vom Android wird implizit ueber die Software gegeben!
	//			Kits werden an die Software gebunden

	public static void main(String[] args) {
		AndroidList list = new AndroidList(); //creates AndroidList (a list of sent away androids)
		String code = ""; //LogCode for AndroidList

		System.out.println("-----------------------------------------------\nSchwerarbeiter/Bauarbeiter:\n");

		Schwerarbeiter schwer1 = new Schwerarbeiter();
		schwer1.attachSoftware(new SoftwareBauarbeiter());	//can be attached
		System.out.println(list.insert(schwer1) + "\n"); 	//try to send out incomplete android (only with software)
		schwer1.attachSkinBeruehrungssensitiv(new SkinBeruehrungssensitiv()); //can be attached
		schwer1.attachSkinGepanzert(new SkinGepanzert());	//cannot be attached
		schwer1.attachSkinHochfest(new SkinHochfest());  	//can be attached
		schwer1.attachKit(new SuperSoaker3000());			//can be attached
		schwer1.attachKit(new SuperSoakerLightningStorm()); //can be attached
		schwer1.attachKit(new SuperSoakerTornadoStorm());	//can be attached
		schwer1.attachKit(new SuperSoakerVortexPyragon()); 	//cannot be attached
		System.out.println("Log for schwer1:\n" + schwer1.getLog()); //shows possible the attaches
		System.out.println(list.insert(schwer1) + "\n"); //try to send out complete android

		System.out.println("-----------------------------------------------\nSchwerarbeiter/Transportarbeiter:\n");

		Schwerarbeiter schwer2 = new Schwerarbeiter();
		schwer2.attachSoftware(new SoftwareTransportarbeiter()); //can be attached
		schwer2.attachSkinBeruehrungssensitiv(new SkinBeruehrungssensitiv()); //can be attached
		schwer2.attachSkinGepanzert(new SkinGepanzert());	//cannot be attached
		schwer2.attachSkinHochfest(new SkinHochfest());  	//can be attached
		System.out.println(list.insert(schwer2) + "\n"); 	//try to send out incomplete android (only software and skin)
		schwer2.attachKit(new SuperSoaker3000());			//can be attached
		schwer2.attachKit(new SuperSoakerLightningStorm()); //can be attached
		schwer2.attachKit(new SuperSoakerTornadoStorm());	//can be attached
		schwer2.attachKit(new SuperSoakerVortexPyragon()); 	//cannot be attached
		System.out.println("Log for schwer2:\n" + schwer2.getLog()); //shows possible the attaches
		System.out.println(list.insert(schwer2) + "\n"); //try to send out complete android

		System.out.println("-----------------------------------------------\nSchwerarbeiter/ServiceTechniker:\n");

		Schwerarbeiter schwer3 = new Schwerarbeiter();
		schwer3.attachSoftware(new SoftwareServiceTechniker());//can be attached
		schwer3.attachSkinBeruehrungssensitiv(new SkinBeruehrungssensitiv()); //can be attached
		schwer3.attachSkinGepanzert(new SkinGepanzert());	//cannot be attached
		schwer3.attachSkinHochfest(new SkinHochfest());  	//can be attached
		schwer3.attachKit(new SuperSoaker3000());			//cannot be attached
		schwer3.attachKit(new SuperSoakerLightningStorm()); //can be attached
		schwer3.attachKit(new SuperSoakerTornadoStorm());	//can be attached
		schwer3.attachKit(new SuperSoakerVortexPyragon()); 	//cannot be attached
		System.out.println("Log for schwer3:\n" + schwer3.getLog()); //shows possible the attaches
		System.out.println(list.insert(schwer3) + "\n"); //try to send out complete android

		System.out.println("-----------------------------------------------\nBeschuetzer/Kaempfer:\n");

		Beschuetzer besch1 = new Beschuetzer();
		besch1.attachSoftware(new SoftwareKaempfer()); //can be attached
		besch1.attachSkinBeruehrungssensitiv(new SkinBeruehrungssensitiv()); //can be attached
		besch1.attachSkinGepanzert(new SkinGepanzert());	//can be attached
		besch1.attachSkinHochfest(new SkinHochfest());  	//can be attached
		besch1.attachKit(new SuperSoaker3000());			//can be attached
		besch1.attachKit(new SuperSoakerLightningStorm());	//can be attached
		besch1.attachKit(new SuperSoakerTornadoStorm());	//can be attached
		besch1.attachKit(new SuperSoakerVortexPyragon()); 	//can be attached
		System.out.println("Log for besch1:\n" + besch1.getLog()); //shows possible the attaches
		System.out.println(list.insert(besch1) + "\n"); //try to send out complete android

		System.out.println("-----------------------------------------------\nBeschuetzer/Leibwaechter:\n");

		Beschuetzer besch2 = new Beschuetzer();
		besch2.attachSoftware(new SoftwareLeibwaechter()); //can be attached
		besch2.attachSkinBeruehrungssensitiv(new SkinBeruehrungssensitiv()); //can be attached
		besch2.attachSkinGepanzert(new SkinGepanzert());	//can be attached
		besch2.attachSkinHochfest(new SkinHochfest());  	//can be attached
		besch2.attachKit(new SuperSoaker3000());			//can be attached
		besch2.attachKit(new SuperSoakerLightningStorm());	//can be attached
		besch2.attachKit(new SuperSoakerTornadoStorm());	//can be attached
		besch2.attachKit(new SuperSoakerVortexPyragon()); 	//cannot be attached
		System.out.println("Log for besch2:\n" + besch2.getLog()); //shows possible the attaches
		System.out.println(list.insert(besch2) + "\n"); //try to send out complete android

		System.out.println("-----------------------------------------------\nBeschuetzer/Objektbewacher:\n");

		Beschuetzer besch3 = new Beschuetzer();
		besch3.attachSoftware(new SoftwareObjektbewacher()); //can be attached
		besch3.attachSkinBeruehrungssensitiv(new SkinBeruehrungssensitiv()); //can be attached
		besch3.attachSkinGepanzert(new SkinGepanzert());	//can be attached
		besch3.attachSkinHochfest(new SkinHochfest());  	//can be attached
		besch3.attachKit(new SuperSoaker3000());			//can be attached
		besch3.attachKit(new SuperSoakerLightningStorm());	//can be attached
		besch3.attachKit(new SuperSoakerTornadoStorm());	//can be attached
		besch3.attachKit(new SuperSoakerVortexPyragon()); 	//cannot be attached
		System.out.println("Log for besch2:\n" + besch3.getLog()); //shows possible the attaches
		System.out.println(list.insert(besch3) + "\n"); //try to send out complete android

		System.out.println("-----------------------------------------------\nBediener/Gesellschafter:\n");

		Bediener bed1 = new Bediener();
		bed1.attachSoftware(new SoftwareGesellschafter());//can be attached
		bed1.attachSkinBeruehrungssensitiv(new SkinBeruehrungssensitiv()); //can be attached
		bed1.attachSkinGepanzert(new SkinGepanzert());	//cannot be attached
		bed1.attachSkinHochfest(new SkinHochfest());  	//cannot be attached
		bed1.attachKit(new SuperSoaker3000());			//cannot be attached
		bed1.attachKit(new SuperSoakerLightningStorm());//cannot be attached
		bed1.attachKit(new SuperSoakerTornadoStorm());	//can be attached
		bed1.attachKit(new SuperSoakerVortexPyragon()); //cannot be attached
		System.out.println("Log for bed1:\n" + bed1.getLog()); //shows possible the attaches
		System.out.println(list.insert(bed1) + "\n"); //try to send out complete android

		System.out.println("-----------------------------------------------\nBediener/Hilfskraefte:\n");

		Bediener bed2 = new Bediener();
		bed2.attachSoftware(new SoftwareHilfskraefte());//can be attached
		bed2.attachSkinBeruehrungssensitiv(new SkinBeruehrungssensitiv()); //can be attached
		bed2.attachSkinGepanzert(new SkinGepanzert());	//cannot be attached
		bed2.attachSkinHochfest(new SkinHochfest());  	//cannot be attached
		bed2.attachKit(new SuperSoaker3000());			//cannot be attached
		bed2.attachKit(new SuperSoakerLightningStorm());//cannot be attached
		bed2.attachKit(new SuperSoakerTornadoStorm());	//can be attached
		bed2.attachKit(new SuperSoakerVortexPyragon()); //cannot be attached
		System.out.println("Log for bed2:\n" + bed2.getLog()); //shows possible the attaches
		System.out.println(list.insert(bed2) + "\n"); //try to send out complete android

		/* Try to attach wrong Software to android:
		 *
		 * Schwerarbeiter schwer4 = new Schwerarbeiter();
		 * schwer4.attachSoftware(new SoftwareLeibwaechter());	//cannot be attached
		 *
		 * Beschuetzer besch4 = new Beschuetzer();
		 * besch4.attachSoftware(new SoftwareHilfskraefte());	//cannot be attached
		 *
		 * Bediener bed3 = new Bediener();
		 * bed3.attachSoftware(new SoftwareObjektbewacher());	//cannot be attached
		 *
		 * This is not possible.
		 */

		System.out.println("-----------------------------------------------\nTry to swap the Subtypes:\n");


	}

}
