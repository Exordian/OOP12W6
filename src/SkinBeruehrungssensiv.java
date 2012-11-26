
public class SkinBeruehrungssensiv extends Skin {
	@Override
	void attachToBediener(Bediener a) {
		a.attachAfterCheck(this);
	}
	@Override
	void attachToSchwerarbeiter(Schwerarbeiter a) {
		a.attachAfterCheck(this);
	}
	@Override
	void attachToBeschuetzer(Beschuetzer a) {
		a.attachAfterCheck(this);
	}
	
	public String toString () {
		return "SkinBeruehrungssensiv";
	}
}
