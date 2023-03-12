
public class LinkedList {	
	static Node head = null, tail = head;	
	public static void main(String[] args) {
         Node first = AddFirst(1);
         Node second = AddFirst(2);  
         print();
         
         Node third = AddLast(3);
         Node fourth = AddLast(4);
         print();
         
         Node fifth = AddAfter(third, 5);
         print();
	}
	private static Node AddAfter(Node tmp, int x) {
		
		Node newNode = new Node(x);
		if(tmp == null)return null;
		
		newNode.next = tmp.next;
		tmp.next = newNode;
		
		return newNode;
	}
	private static Node AddLast(int x) {
		
		Node newNode = new Node(x);
		if(head ==null) {
			head = newNode;
			tail = head;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		return newNode;
		
	}
	private static void print() {
		if(head == null) return;
		
	    Node temp= head;
	    while(temp.next!=null) {
	       System.out.print(temp.val + "-> ");
	       temp = temp.next;
	    }
	    System.out.println(temp.val);
	}
	private static Node AddFirst(int x) {
	     Node newNode = new Node(x);
	     
	     if(head ==null) {
			head = newNode;
			tail = head;
		 }
	     else {
		     newNode.next = head;
		     head = newNode; 
	     }
		return newNode;
	}
}

class Node{
	int val;
	Node next;
	
	Node(int x){
		val =x;
		next = null;
	}
}
//output
//2-> 1
//2-> 1-> 3-> 4
//2-> 1-> 3-> 5-> 4
