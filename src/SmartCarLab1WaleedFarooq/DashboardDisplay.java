/**
 * 
 */
package SmartCarLab1WaleedFarooq;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author Waleed
 *
 */
public class DashboardDisplay implements SelfCheckCapable {
	
	private String name;
	private double updateVersion;
	
	public DashboardDisplay(String name, double updateVersion) {
		this.name = name;
		this.updateVersion = updateVersion;
	}
	
	public void autoPilot() {
		System.out.println("Car is in autopilot");
	}
	
	public void connectBluetooth() {
		System.out.println("Device is connected");
	}
	
	public void playMusic() {
		System.out.println("The vibes are playing");
	}
	
	public void modifyAC() {
		System.out.println("AC is changed to your preffered setting");
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
