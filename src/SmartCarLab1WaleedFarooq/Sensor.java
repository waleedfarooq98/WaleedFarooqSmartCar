/**
 * 
 */
package SmartCarLab1WaleedFarooq;

import javax.sql.rowset.serial.SQLOutputImpl;

/**
 * @author Waleed
 *
 */
public class Sensor {
	
	private int sensitivity;
	private int resolution;
	private float range;
	
	public Sensor(int sensitivity, int resolution, float range) {
		this.sensitivity = sensitivity;
		this.resolution = resolution;
		this.range = range;
	}
	
	public void checkDistance() {
		System.out.println("Distance between object checked");
	}
	
	public void readLanes() {
		System.out.println("You are this close to the left or right lane");
	}
	

}
