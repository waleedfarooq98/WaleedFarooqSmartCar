package SmartCarLab1WaleedFarooq;

public class Speaker {
	
	private int volume;
	private String speakerType;
	
	public Speaker(int volume, String speakerType) {
		this.volume = volume;
		this.speakerType = speakerType;
	}
	
	public void lowerVolume() {
		System.out.println("Volume has been lowered");
	}
	
	public void increaseVolume() {
		System.out.println("Volume has been increased");
	}

}
