
public class Node {

//	public int value;
//	public Node next;
	
//	public Object head(int value) {
//		this.value= value;
//		 next=null;
//		 return this;
//		
//	}
//	public Object tail;
//	public int length;
//	public Node() {
//		
//	}
//	
//	public Node(int value) {
//		this.value= value;
//		 next=null;
//
//		
//	}; 
//	
	
	Node next;
	 
	// data carried by this node. could be of any type you need.
	int data;

	// Node constructor
	public Node(int dataValue) {
		next = null;
		data = dataValue;
	}

	// another Node constructor if we want to specify the node to point to.
	 
	public Node(int dataValue, Node nextValue) {
		next = nextValue;
		data = dataValue;
	}

	// these methods should be self-explanatory
	public int getData() {
		return data;
	}

 
	public void setData(int dataValue) {
		data = dataValue;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node nextValue) {
		next = nextValue;
	}

	 

}


	
 

