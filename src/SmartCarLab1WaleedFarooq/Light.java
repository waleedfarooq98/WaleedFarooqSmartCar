/**
 * 
 */
package SmartCarLab1WaleedFarooq;

/**
 * @author Waleed
 *
 */
public class Light {
	
	private int brightness;
	private String type;
	
	public Light(int brightness, String type) {
		this.brightness = brightness;
		this.type = type;
	}
	
	public void turnOnLight() {
		System.out.println("Light is on");
	}
	
	public void turnOffLight() {
		System.out.println("Light is off");
	}
	
	

}
