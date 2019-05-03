package test;

public class Node {
	String value;
	Node next; 
	 
	
	public Node() {
		
	}
	public   Node(String value) {
		 this.value= value;
		 this.next= null;
		 
		 
		 
		 
		 
	} 
	
	@Override
	public String toString() {
		
		
		return " {value=" + value + ", next=" + next + "}";
	}
	 
	
	
	
}
