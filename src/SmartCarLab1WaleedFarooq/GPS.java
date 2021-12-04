package SmartCarLab1WaleedFarooq;

import edu.fiu.sysdesign.SelfCheckCapable;

public class GPS implements SelfCheckCapable {
	
	private String location;
	private String make;
	
	public GPS(String location, String make) {
		this.location = location;
		this.make = make;
	}
	
	public void navigate() {
		System.out.println("GPS is calculating directions to your destination");
	}
	
	public void checkLocation() {
		System.out.println("This is your current location");
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
