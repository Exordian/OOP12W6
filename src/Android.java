import java.util.ArrayList;


/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public abstract class Android {
	private static Integer cSnr = 0;
	protected final Integer snr;
	private String log;
	protected Software software = null;
	protected Skin skin = null;
	protected Integer maxKW;
	
	private ArrayList<Kit> attachedKits;
	private ArrayList<Integer> levelList;

	public void attachSoftwareLevel1(SoftwareLevel1 software) {}
	public void attachSoftwareLevel2(SoftwareLevel2 software) {}
	public void attachSoftwareLevel3(SoftwareLevel3 software) {}
	public void attachSoftwareLevel4(SoftwareLevel4 software) {}
	public void attachSoftwareLevel5(SoftwareLevel5 software) {}

	public void attachSkinGepanzert(SkinGepanzert skin) {}
	public void attachSkinHochfest(SkinHochfest skin) {}
	public void attachSkinBeruehrungssensiv(SkinBeruehrungssensitiv skin) {}

	public Android() {
		this.snr = ++cSnr;
		log = "";
		attachedKits = new ArrayList<Kit>();
	}

	protected void addToLog(String logentry) {
		log += logentry + "\n";
	}
	
	protected void attachKit(Kit k) {
		int temp = 0;
		
		for (Kit tempKit : attachedKits) {
			temp += tempKit.getKW();
		}
		temp += k.getKW();
		
		if(possibleToAttach(levelList, temp)) {
			attachedKits.add(k);
		} else {
			log += "Could not attach Kit to Android\n";
		}
	}
	
	private boolean possibleToAttach(ArrayList<Integer> level, Integer x) {
		if (level.isEmpty()) {
			return true;
		}
		
		if (level.get(x-1) != null) {
			return true;
		}
		return false;
	}

	public String getLog() {
		return log;
	}

	public Integer getSnr() {
		return snr;
	}
	
	public Integer getMaxKW() {
		return maxKW;
	}
	
	public void attachAfterCheck(SoftwareLevel1 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		
		this.maxKW = 1;
		levelList = new ArrayList<Integer>();
		levelList.add(1);
	}

	public void attachAfterCheck(SoftwareLevel2 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		
		this.maxKW = 1;
		levelList = new ArrayList<Integer>();
		levelList.add(1);
	}

	public void attachAfterCheck(SoftwareLevel3 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		
		this.maxKW = 5; 
		levelList = new ArrayList<Integer>();
		levelList.add(1);
		levelList.add(2);
		levelList.add(3);
		levelList.add(4);
		levelList.add(5);
	}

	public void attachAfterCheck(SoftwareLevel4 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		
		this.maxKW = 10;
		levelList = new ArrayList<Integer>();
		levelList.add(1);
		levelList.add(2);
		levelList.add(3);
		levelList.add(4);
		levelList.add(5);
		levelList.add(6);
		levelList.add(7);
		levelList.add(8);
		levelList.add(9);
		levelList.add(10);
	}

	public void attachAfterCheck(SoftwareLevel5 s) {
		this.software = s;
		s.setSnr(snr);
		addToLog("Changed Software to: " + s.toString());
		
		levelList = new ArrayList<Integer>();
	}

	public void attachAfterCheck(Skin s) {
		this.skin = s;
		s.setSnr(snr);
		addToLog("Changed Skin to: " + s.toString());
	}
}
