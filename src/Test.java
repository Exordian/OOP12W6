
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	// Fehlt: Zusicherungen
	// Fehlt: Klassenzusammenhalt?
	// Fehlt: Logging
	// Subtype vom Android wird implizit über die Software gegeben !
	public static void main(String[] args) {
		Beschuetzer b = new Beschuetzer();
		b.attachSoftware(new SoftwareKaempfer());
		b.attachKit(new SuperSoaker3000());
		System.out.println(b.getLog());
		Bediener a = new Bediener();
		a.attachSoftware(new SoftwareGesellschafter());
		a.attachKit(new SuperSoaker3000());
		// can not attach overpowered soak kit to "gesellschafter"
		System.out.println(a.getLog());
	}

}
