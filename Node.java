/**
 * Node class allows for the creation of special types of objects
 * that have the ability to refer to other objects of the Node class 
 * these are sometimes referred to as self-referential objects basically
 * that means objects that can refer to other objects of the Node class
 * 
 *
 * @param <T> T is a type parameter which will receive its value from a type argument
 */
public class Node<T> extends Object {
	//instance variables
	private T data;
	private Node<T> link; //reference to a Node object
	
	//constructor
	public Node(T newData) {
		super();
		data = newData;
		link = null;
	}
	
	//non-static methods
	public void setData(T newData) {
		data = newData;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node<T> otherNode) {
		this.link = otherNode;
	}
	
	public Node<T> getLink() {
		return link;
	}
}
