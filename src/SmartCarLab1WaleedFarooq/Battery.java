/**
 * 
 */
package SmartCarLab1WaleedFarooq;

/**
 * @author Waleed
 *
 */
public class Battery {
	
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

}
