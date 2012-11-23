
public class SoftwareKaempfer implements SoftwareLevel5 {

	@Override
	public void attachToAndroid(Android a) {
		a.attachSoftware(this);
	}

}
