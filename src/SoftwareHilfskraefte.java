
public class SoftwareHilfskraefte implements SoftwareLevel1, SoftwareLevel2 {

	@Override
	public void attachToAndroid(Android a) {
		a.attachSoftware(this);
	}

}
