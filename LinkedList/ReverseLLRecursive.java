
public class ReverseLLRecursive {
	static Node head = null, tail = head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for(int val = 1; val<=5; val++) {
	    	   AddLast(val);
	       }
	       System.out.print("current List: ");
	       print();
	       
	       head = reverseLL(head);
	       System.out.print("reverse List: ");
	       print();
	}
    private static Node reverseLL(Node head) {
		if(head == null || head.next == null) return head;
		
		Node revHead = reverseLL(head.next);
		
		head.next.next = head;
		head.next = null;
		return revHead;
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
//current List: 1-> 2-> 3-> 4-> 5
//reverse List: 5-> 4-> 3-> 2-> 1