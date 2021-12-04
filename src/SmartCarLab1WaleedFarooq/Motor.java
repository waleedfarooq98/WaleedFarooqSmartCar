/**
 * 
 */
package SmartCarLab1WaleedFarooq;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author Waleed
 *
 */
public class Motor implements SelfCheckCapable {
	
	private int voltage;
	
	private int horsepower;
	
	public Motor(int voltage, int horsepower) {
		this.voltage = voltage;
		this.horsepower = horsepower;
	}
	
	public void start() {
		System.out.println("Car is started");
	}
	
	public void brake() {
		System.out.println("Brake");
	}
	
	public void accelerate() {
		System.out.println("Accelerate");
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
