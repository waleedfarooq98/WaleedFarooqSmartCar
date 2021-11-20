package SmartCarLab1WaleedFarooq;


public interface SelfCheckCapable {
		
		/**
		 * This should be pretty typical for most objects that should include
		 * a getComponentName method that the testers will use.
		 * @return a String representation of the name of the object being tested
		 */
		public String getComponentName();
		
		/**
		 * Any object that is self-check capable must implement this method to 
		 * check itself and any internal components.
		 * 
		 * @see SelfCheckUtils#randomCheck() for a simple random check function, 
		 * as well as to apply checks on a list of items as needed.
		 * 
		 * @return true if the self-check was successful, false otherwise.
		 */
		public boolean selfCheck();
		
		/**
		 * This is a "runner" for the self-check process that will print
		 * the status of this object and all its components to the
		 * terminal. Nothing is changed, only
		 * the status is printed. 
		 * 
		 * This will call the selfCheck method above to check status
		 * of the different components.
		 * 
		 * @return true if the self-check was successful, false otherwise.
		 */
		public boolean runSelfCheck();

	}

