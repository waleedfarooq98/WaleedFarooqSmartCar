/**
 * 
 */
package SmartCarLab1WaleedFarooq;

/**
 * @author Waleed
 *
 */
public class Motor {
	
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

}
