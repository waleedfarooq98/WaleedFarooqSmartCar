package SmartCarLab1WaleedFarooq;

public class GPS {
	
	private String location;
	private String make;
	
	public GPS(String location, String make) {
		this.location = location;
		this.make = make;
	}
	
	public void navigate() {
		System.out.println("GPS is calculating directions to your destination");
	}
	
	public void checkLocation() {
		System.out.println("This is your current location");
	}

}
