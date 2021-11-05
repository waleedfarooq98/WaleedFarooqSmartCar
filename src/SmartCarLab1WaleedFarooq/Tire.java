package SmartCarLab1WaleedFarooq;

public class Tire {
	
	private float width;
	private int airPressure;
	
	public Tire(float width, int airPressure) {
		this.width = width;
		this.airPressure = airPressure;
	}
	
	public void checkAirPressure() {
		System.out.println("The air pressure is this: " + airPressure);
	}
	

}
