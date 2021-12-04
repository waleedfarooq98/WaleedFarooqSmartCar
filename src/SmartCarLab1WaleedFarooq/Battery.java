/**
 * 
 */
package SmartCarLab1WaleedFarooq;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author Waleed
 *
 */
public class Battery implements SelfCheckCapable {
	
	private int capacity;
	private String type;
	private int batteryLife = 95;
	
	public Battery(int capacity, String type, int batteryLife) {
		this.capacity = capacity;
		this.type = type;
		this.batteryLife = batteryLife;
	}
	
	public void turnOn() {
		System.out.println("Battery on");
	}
	
	public void turnOff() {
		System.out.println("Battery Off");
	}
	
	public void checkBatteryLife() {
		System.out.println("Battery life is: " + batteryLife + "%");
	}
	
	public void charge() {
		System.out.println("Battery is charging");
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
	
	public void runDiagnostics() {
		System.out.println("Systems are all OK");
	}
	

}
