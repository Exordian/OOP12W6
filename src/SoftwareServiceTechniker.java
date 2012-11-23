
public class SoftwareServiceTechniker implements SoftwareLevel3, SoftwareLevel4 {

	@Override
	public void attachToAndroid(Android a) {
		a.attachSoftware(this);
	}

}
