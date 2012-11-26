
public class SkinGepanzert extends Skin {
	@Override
	void attachToBeschuetzer(Beschuetzer a) {
		a.attachAfterCheck(this);
	}
	public String toString () {
		return "SkinGepanzert";
	}

}
