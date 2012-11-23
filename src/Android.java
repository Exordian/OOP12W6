
public abstract class Android {
	private final Seriennummer snr;
	private String log;
	
	// TODO: do not change security level
	abstract void attachSoftware(Software software);
	
	abstract void attachSkin(Skin skin);
	
	abstract void attachAkteur(Akteur akteur);

	abstract void makeSubType(SubType akteur);
	
	public Android() {
		this.snr = new Seriennummer();
		log = "";
	}
	
	public void addToLog(String logentry) {
		log += logentry + "\n";
	}
	
	public String getLog() {
		return log;
	}
}
