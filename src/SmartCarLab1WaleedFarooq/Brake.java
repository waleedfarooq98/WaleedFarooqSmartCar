package SmartCarLab1WaleedFarooq;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Brake implements SelfCheckCapable{
	
	private String type;
	
	public Brake(String type)
	{
		this.type = type;
	}
	
	public void apply() {
		System.out.println("Brakes have been applied");
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
