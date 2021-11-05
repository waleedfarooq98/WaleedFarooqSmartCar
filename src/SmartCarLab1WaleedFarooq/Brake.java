package SmartCarLab1WaleedFarooq;

public class Brake {
	
	private String type;
	
	public Brake(String type)
	{
		this.type = type;
	}
	
	public void apply() {
		System.out.println("Brakes have been applied");
	}

}
