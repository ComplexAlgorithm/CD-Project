
public class NodeBasedStack<T> extends Object implements UnBoundedStackInterface<T> {
	//instance variables
	private Node<T> top; //reference to an object of the Node class, aggregation
	
	//default constructor
	public NodeBasedStack() {
		super();
		top = null;
	}
	
	@Override
	public void pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(top == null) {
			throw new StackEmptyException("Pop attempted on an empty stack!");
		}
		else {
			top = top.getLink(); 
		}
	}

	@Override
	public T peek() throws StackEmptyException{
		T topItem;
		if(top == null) {
						throw new StackEmptyException("Stack is empty!");
		}
		else {
			topItem = top.getData();
		}
		return topItem;
	}
	

	@Override
	public void push(T item) throws StackFullException {
		// TODO Auto-generated method stub
		Node<T> currentNode = new Node<T>(item);
		if(top == null) {
			top = currentNode;
		}
		else {
			currentNode.setLink(top);
			top = currentNode;
		}
	}

/**
 * Then depending on which implementation is selected either the ArrayBasedStack<T> class or
NodeBasedStack<T> class should be included in the project. Whichever one is selected should
override the toString method from the Object class and implement the new size method required
in the updated StackInterface<T> interface. If the NodeBasedStack<T> class is selected then the
Node<T> class will also have to be included without any changes. 
 */
	

	public int size() {
		Node<T> currentNode = top;
		int stackSize = 0;
		if(top == null)
			return stackSize;
		
		while(currentNode != null) {
			stackSize++;
			currentNode = currentNode.getLink();
		}
		return stackSize;
			
	}
	
	public String toString() {
		Node<T> currentNode = top;
		String info = null;
		if(top == null)
			return info;
		
		while(currentNode != null) {
			info = info + currentNode.getData().toString();
			currentNode = currentNode.getLink();
		}
		
		return info;
			
	}
}
