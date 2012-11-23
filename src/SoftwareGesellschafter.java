
public class SoftwareGesellschafter implements SoftwareLevel1 {

	/* FAIL: checking consistent android not required !
	public void attachToAndroid(Bediener a) {
		
	}*/

	@Override
	public void attachToAndroid(Android a) {
		a.attachSoftware(this);
	}

}
