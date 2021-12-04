package SmartCarLab1WaleedFarooq;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Tire implements SelfCheckCapable{
	
	private float width;
	private int airPressure;
	
	public Tire(float width, int airPressure) {
		this.width = width;
		this.airPressure = airPressure;
	}
	
	public void checkAirPressure() {
		System.out.println("The air pressure is this: " + airPressure);
	}
	
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		String name = null;
		return name;
	}
	
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

}
