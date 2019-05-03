package test;

public class LinkedList {

//	public int value;
//	public LinkedList next;
	
//	public Object Node(int value) {
//		this.value= value;
//		 next=null;
//		 return this;
//		
//	}
//	public Object tail;
//	public int length;
//	public LinkedList() {
//		
//	}
//	
//	public LinkedList(int value) {
//		this.value= value;
//		 next=null;
//
//		
//	}; 
//	
	
	
	private Node headNode;
	//private Node prevNode;
	private Node tail;
	private int length;
	 
	// data carried by this LinkedList. could be of any type you need.
	
	public LinkedList() {
		
	}
	
	// LinkedList constructor
	public LinkedList(int value) {
		
	this.headNode = new Node(value);
	 
	this.tail = this.headNode;
	this.length = 1;
	 
	//System.out.println(Node.toString());
	

	}
	
//	public int[] printList() {
//		int[] array = null;
//		
//		 
//		Node currentLinkedList = this.Node;
//		for(int i=0;i<;i++) {
//			array[0]=currentLinkedList.value;
//			currentLinkedList = currentLinkedList.next;
//		}
//		return array;
//	}
//	
	
	//this will append any incoming node at the end
	public   LinkedList append(int value) {
		
		Node  newLinkedList = new Node(value);
		 
		
		//newLinkedList.prev= this.tail;
		//System.out.println("<<<<<"+newLinkedList.prev);
		 this.tail.next =newLinkedList;
		 
		 this.tail=newLinkedList;
		
	
		
		this.length++;
	 
		return this;
	}
	//this will set the incoming node to be the head
	public void prepend(int value) {
		
		 Node newNode = new Node(value);
		 Node currentHeadNode = this.headNode;
	//	 this.headNode.prev = newNode;
	//	 this.prevNode =newNode;
		 this.headNode=newNode;
		 newNode.next= currentHeadNode;
		 this.length++;
 		
	}
	
	
	public void insert(int index, int value) {
		if(  index>= this.length) {
			append(value);
			}
		
		Node incomingNode = new Node(value);
		
		Node leaderNode =transversingNode(index-1);
		Node holdingNode= leaderNode.next;
		
		
		
		incomingNode.next=holdingNode;
		leaderNode.next= incomingNode;
		//incomingNode.prev= leaderNode;
		 //holdingNode.prev = incomingNode;
		
		this.length++;
	}

	
	public Node transversingNode(int index) {
		int counter =0;
		Node leaderNode = this.headNode;
		while(index!=counter) {
		
			leaderNode =leaderNode.next;
			counter++;
		}
		
		return leaderNode;
	}
	public String toString(int a) {
		
		//System.out.println(" LinkedList \n {\n Head: " + headNode + ", \n tail=" + tail + ", \n length=" + length + "\n}");

		
 		int countTransverseThrougHead=0;
 	while(length-countTransverseThrougHead != a) {
 			
 		this.headNode=headNode.next;
 			countTransverseThrougHead++;
  		}
		 
		return " LinkedList \n {\n Head: " + headNode + ", \n tail=" + tail + ", \n length=" + length + "\n}";
	}
	
	 
	
	
	
	
	
//	@Override
//	public String toString() {
//		return "[\n Node={ value : " + Node.value +" ,next :{ " +this.Node.value+"  }" 
//	+"},\n tail:{ value: " + this.tail.value + ", next: { " +this.Node.value+"  } },  length=" + length + "]";
	//}

//	@Override
//	public String toString() {
//		return "LinkedList [data=" + Node.value + ", next=" + this.tail.toString() + ", Node=" + Node + ", tail=" + tail + ", length=" + length
//				+ "]";
//	}
//	
	
	
	
	

//	// another LinkedList constructor if we want to specify the LinkedList to point to.
//	 
//	public LinkedList(int dataValue, LinkedList nextValue) {
//		data = dataValue;
//		next = nextValue;
//
//	}
//
//	// these methods should be self-explanatory
//	public int getData() {
//		return data;
//	}
//
// 
//	public void setData(int dataValue) {
//		data = dataValue;
//	}
//
//	public LinkedList getNext() {
//		return next;
//	}
//
//	public void setNext(LinkedList nextValue) {
//		next = nextValue;
//	}
//
//	 

}


	
 

