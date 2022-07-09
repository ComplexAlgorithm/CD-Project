
/**
 * StackEmptyException represents the situation where
 * the stack is empty and no items can be removed from it
 * 
 *
 */
public class StackEmptyException extends Exception {
	//instance variables
	//none
	
	/**
	 * Default constructor calls the default constructor of the parent class (Exception)
	 */
	public StackEmptyException() {
		super();
	}
	
	/**
	 * Overloaded constructor calls the constructor of the parent class (Exception)
	 * which accepts a String argument 
	 * @param message represents the situation that has occurred
	 */
	public StackEmptyException(String message) {
		super(message);
	}
	
	
	//non-static methods
	//none
	
}
