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
	
	
	private static Node headNode;
	//private Node prevNode;
	private static Node tail;
	static int length;
	private static int totalDuplicatesFound=0;
	 
	// data carried by this LinkedList. could be of any type you need.
	
	public LinkedList() {
		
	}
	
	// LinkedList constructor
	public LinkedList(int value) {
		
		System.out.println("inside head");
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
	public   void append(int value) {
		
		
		 
		
		//newLinkedList.prev= this.tail;
		//System.out.println("<<<<<"+newLinkedList.prev);
		if(!CheckDuplicates(value)) {
			Node  newLinkedList = new Node(value);
			this.tail.next =newLinkedList;
			 
			 this.tail=newLinkedList;
			
		
			
			this.length++;
		 
		}
		 
	//	return this;
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
	
	//will find the index and displace adjacent
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

	//this will go through all the index and find the right one and return one before it
	public static Node transversingNode(int index) {
		int counter =0;
		Node leaderNode = headNode;
		while(index!=counter) {
		
			leaderNode =leaderNode.next;
			counter++;
		}
		
		return leaderNode;
	}
	public String toString(int a) {
		
		//System.out.println(" LinkedList \n {\n Head: " + headNode + ", \n tail=" + tail + ", \n length=" + length + "\n}");

  		for(int i=0;i<length-a;i++) {
			
			//System.out.println(b);
			this.headNode=headNode.next;
		}
// 		int countTransverseThrougHead=0;
// 	while(length-countTransverseThrougHead != a) {
// 			
// 		this.headNode=headNode.next;
// 			countTransverseThrougHead++;
//  		}
		// return "";
		return " LinkedList \n {\n Head: " + headNode + ", \n tail=" + tail + ", \n length=" + length + "\n}";
	}
	
	//value about to enter linkdedlist will enter below than result is rendered either true or false 
	public static boolean CheckDuplicates(int a) {
	  
		int counter =0;
		Node leaderNode = headNode;
		
		
		
		
		while(length!=counter) {
		
			if(a==leaderNode.value) {
				totalDuplicatesFound++;
				return true;
			}
			leaderNode =leaderNode.next;
			counter++;
		}
		
		return false;
	}
	
	public static int NumberOfDuplicate()
	{
		return totalDuplicatesFound;
	}
	
	
	public static void delete(int value) {
		
		Node PreviousNode=findNode(value);
		Node currentNode = PreviousNode.next;
		Node NodeNext = currentNode.next;
		
		PreviousNode.next =NodeNext;
		
		
	}
	
	public static Node findNode( int value) {
		int counter =0;
		Node leaderNode = headNode;
		while(length!=counter) {
		
			
			if(value ==leaderNode.next.value) {
				return leaderNode;
			}
			leaderNode =leaderNode.next;
			counter++;
		}
		return null;
		
		
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


	
 

