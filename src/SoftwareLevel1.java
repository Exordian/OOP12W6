
public class SoftwareLevel1 extends Software {
	void checkLevel1(Android a, SoftwareLevel1 s) {
		a.attachAfterCheck(s);
	}
	
	public String toString () {
		return "SoftwareLevel1";
	}

}
