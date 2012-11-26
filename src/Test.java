
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
		b.attachSoftware(new SoftwareLeibwaechter());
		b.attachSoftware(new SoftwareObjektbewacher());
		b.attachSoftware(new SoftwareKaempfer());

	}

}
