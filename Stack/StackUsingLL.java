
public class StackUsingLL {
    static Node top = null;
	public static void main(String[] args) {
		
		for(int val=1; val<=5; val++) {
			push(val);
		}
		
		print();
		
		pop();
		pop();
		
		print();
		
		peek();
	}

	private static Node peek() {
		if(top== null) {
			System.out.println("stack is empty");
			return null;
		}
		System.out.println("peek element: "+  top.val);
		return top;
	}

	private static Node pop() {
		if(top== null) {
			System.out.println("stack is empty");
			return null;
		}
		Node del = top;
		top = top.next;
		del.next = null;
		System.out.println("Pop element: "+  del.val);
		return del;
	}

	private static void print() {
		if(top== null) {
			System.out.println("stack is empty");
		}
		System.out.print("Stack Elements: ");
		Node temp = top;
		while(temp.next!=null) {
			System.out.print(temp.val + "<-");
			temp = temp.next;
		}
		System.out.println(temp.val);
	}

	private static void push(int val) {
		Node newData = new Node(val);
		newData.next = top;
		top = newData;
	}

}

class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
}
//output:
//	Stack Elements: 5<-4<-3<-2<-1
//	Pop element: 5
//	Pop element: 4
//	Stack Elements: 3<-2<-1
//	peek element: 3
