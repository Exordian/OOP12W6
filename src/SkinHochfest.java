
public class SkinHochfest extends Skin {
	@Override
	void attachToBeschuetzer(Beschuetzer a) {
		a.attachAfterCheck(this);
	}
	@Override
	void attachToSchwerarbeiter(Schwerarbeiter a) {
		a.attachAfterCheck(this);
	}
	public String toString () {
		return "SkinHochfest";
	}

}
