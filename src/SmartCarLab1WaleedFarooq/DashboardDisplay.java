/**
 * 
 */
package SmartCarLab1WaleedFarooq;

/**
 * @author Waleed
 *
 */
public class DashboardDisplay {
	
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

}
