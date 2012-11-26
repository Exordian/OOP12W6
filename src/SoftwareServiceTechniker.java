
public class SoftwareServiceTechniker extends SoftwareLevel3{

	void attachToSchwerarbeiter(Schwerarbeiter a) {
		a.attachSoftwareLevel3(this);
	}
	public String toString () {
		return "SoftwareServiceTechniker";
	}

}
