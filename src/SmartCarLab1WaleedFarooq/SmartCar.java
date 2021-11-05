/**
 * 
 */
package SmartCarLab1WaleedFarooq;

/**
 * @author Waleed
 *
 */
public class SmartCar {
	
	private String registrationNum;
	private int year;
	private String licenseNum;
	private String model;
	
	public SmartCar(String registrationNum, int year, String licenseNum, String model) {
		this.registrationNum = registrationNum;
		this.year = year;
		this.licenseNum = licenseNum;
		this.model = model;
		
	}
	
	public void moveFoward() {
		System.out.println("Move Car Foward");
	}
	
	public void moveBackward() {
		System.out.println("Move Car Backward");
	}
	
	public void turnLeft() {
		System.out.println("Turn Left");
	}
	
	public void turnRight() {
		System.out.println("Turn Right");
	}
	
	public void stop() {
		System.out.println("Stop the Car");
	}
	
	public void runDiagnostics() {
		System.out.println("Systems are all OK");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartCar myCar = new SmartCar("F650L30", 2021, "G3506U50", "Tesla Model S");
		
		System.out.println("Model: " + myCar.model);
		System.out.println("Model Year: " + myCar.year);
		System.out.println("Registration Number: " + myCar.registrationNum);
		System.out.println("License Number: " + myCar.licenseNum + "\n");
		
		myCar.runDiagnostics();
		
		
		
	

	}

}
