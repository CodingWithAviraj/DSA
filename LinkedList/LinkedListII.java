
public class LinkedListII {
	static Node head = null, tail = head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int val = 1; val<=5; val++) {
    	   AddLast(val);
       }
       System.out.print("current List: ");
       print();
       boolean f = IsExist(3);
       System.out.println("search 3:" + f);
       
        f = IsExist(9);
       System.out.println("search 9:" + f);
       
       Node delNode = deleteFirst();
       System.out.println("Deleted first Node: " + (delNode!=null ? delNode.val: "not found"));
       
       System.out.print("current List: ");
       print();
       
       delNode = deleteLast();
       System.out.println("Deleted Last Last: " + (delNode!=null ? delNode.val: "not found"));
       
       System.out.print("current List: ");
       print();
       
       delNode = delete(3);
       System.out.println("Deleted Node of givenVal: " + (delNode!=null ? delNode.val: "not found"));
       
       System.out.print("current List: ");
       print();
	}
	
	private static Node delete(int val) {
		if(head == null) return head;
		
		Node temp = head;
		if(head.next==null) {
			head = null;
			return temp;
		}
	
		Node preNode = Search(temp, val);
		if(preNode == null) return null;
		
		Node delNode = preNode.next;
		preNode.next = delNode.next;
		
		delNode.next = null;
		return delNode;
	}

	private static Node Search(Node temp, int val) {
		Node pre = null;
		while(temp != null) {
			if(temp.val == val)return pre;
			pre = temp;
			temp = temp.next;
		}
		if(temp == null) return null;
		
		return pre;
	}

	private static Node deleteLast() {
		if(head == null)return head;
		
		Node temp = head, pre = null;
		if(head.next == null) {
			head = null;
			return temp;
		}
		
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		pre.next = null;
		return temp;
	}

	private static Node deleteFirst() {
		if(head == null)return head;
		Node temp = head;
		if(head.next == null) {
			head = null;
		}else {
			head = head.next;
		}
		temp.next = null;
		return temp;
	}

	private static boolean IsExist(int val) {
		if(head == null) return false;
		
		Node temp = head;
		while(temp!=null) {
			if(temp.val == val)return true;
			temp = temp.next;
		}
		return false;
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
//output:
//current List: 1-> 2-> 3-> 4-> 5
//search 3:true
//search 9:false
//Deleted first Node: 1
//current List: 2-> 3-> 4-> 5
//Deleted Last Last: 5
//current List: 2-> 3-> 4
//Deleted Node of givenVal: 3
//current List: 2-> 4


