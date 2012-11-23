
public class SoftwareObjektbewacher implements SoftwareLevel4 {

	@Override
	public void attachToAndroid(Android a) {
		a.attachSoftware(this);
	}

}
