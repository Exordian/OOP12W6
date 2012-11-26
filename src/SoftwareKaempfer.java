
public class SoftwareKaempfer extends SoftwareLevel5 {

	void attachToBeschuetzer(Beschuetzer a) {
		a.attachSoftwareLevel5(this);
	}
	public String toString () {
		return "SoftwareKaempfer";
	}

}
