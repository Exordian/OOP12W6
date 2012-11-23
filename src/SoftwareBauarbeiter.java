
public class SoftwareBauarbeiter implements SoftwareLevel4, SoftwareLevel3 {

	@Override
	public void attachToAndroid(Android a) {
		a.attachSoftware(this);
	}

}
