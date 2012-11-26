
public class SoftwareBauarbeiter extends SoftwareLevel4 {
	
	void attachToSchwerarbeiter(Schwerarbeiter a) {
		a.attachSoftwareLevel4(this);
	}
	public String toString () {
		return "SoftwareBauarbeiter";
	}

}
