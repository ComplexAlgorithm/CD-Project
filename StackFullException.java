/**
 * StackFullException represents the situation
 * where the stack is full and no more items can be added
 * to it
 * 
 *
 */
public class StackFullException extends Exception {
	//instance variables
	//none 
	
	/**
	 * Default constructor calls the constructor of the parent class (Exception)
	 */
	public StackFullException() {
		super();
	}
	
	/**
	 * Overloaded constructors calls the constructor the parent class (Exception)
	 * that accepts a String as an argument
	 * @param message is the String that gives information about the exception
	 */
	public StackFullException(String message) {
		super(message);
	}
	
	//non-static methods
	//none 
}
