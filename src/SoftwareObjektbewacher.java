
public class SoftwareObjektbewacher extends SoftwareLevel4 {
	
	void attachToBeschuetzer(Beschuetzer a) {
		a.attachSoftwareLevel4(this);
	}
	public String toString () {
		return "SoftwareObjektbewacher";
	}

}
