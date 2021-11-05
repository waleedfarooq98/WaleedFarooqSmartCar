/**
 * 
 */
package SmartCarLab1WaleedFarooq;

/**
 * @author Waleed
 *
 */
public class Camera {
	
	private String cameraPosition;
	private int cameraResolution;
	
	public Camera(String cameraPosition, int cameraResolution) {
		this.cameraPosition = cameraPosition;
		this.cameraResolution = cameraResolution;
	}
	
	public void record() {
		System.out.println("Start recording");
	}
	
	public void takePicture() {
		System.out.println("Take Picture");
	}

}
