
/** Java documentation 
 * 
 * StackInterface represents the Stack Abstract Data Type which 
 * allows items to be added to the top of the stack and allows items
 * to be removed from the top of the stack
 * 
 * 
 *
 */
public interface StackInterface<T> { //<T> is a type parameter which allows the type to be passed as argument
	//generics are classes or interfaces that have type parameters 
	//being an interface that is parameterized over types
	//interfaces are not classes, they do not have instance variables, constructors, or methods
	//they have method headings that must be implemented by a class that chooses to implement
	//the interface
	
	/**
	 * Adds an item to the top of the stack if there is room
	 * otherwise throws StackFullException
	 * @param item will be added to the top of the stack
	 * @throws StackFullException when the stack is full 
	 */
	public void push(T item) throws StackFullException; //method heading
	
	/**
	 * Removes the item from the top of the stack if there is one
	 * otherwise throws StackEmptyException
	 * @throws StackEmptyException when the stack is empty
	 */
	public void pop() throws StackEmptyException; //method heading
	
	/**
	 * Returns the item at the top of the stack
	 * @return item at the top of the stack is returned
	 */
	public T peek() throws StackEmptyException; //method heading
	
	/**
	 * After the development of the Compact Disc class, the .java file for the 
	 * StackInterface<T> should be included in the project and it should be edited 
	 * to include a size method. Its method signature should be as follows:
			public int size() 
	 * @return
	 */
	
	public int size() ;//method heading
	
}                          

