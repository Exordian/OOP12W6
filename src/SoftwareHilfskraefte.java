
public class SoftwareHilfskraefte extends SoftwareLevel1 {

	void attachToBediener(Bediener a) {
		a.attachSoftwareLevel1(this);
	}
	public String toString () {
		return "SoftwareHilfskraefte";
	}

}
