
public class Stack {
	static int N = 5;
	static int stack[] = new int[N];
	static int top =-1, len =0;
	
	public static void main(String[] args) {
		
		for(int x = 1; x<=6; x++) {
			push(x);
		}
		
		size();
		System.out.println("current size of the stack: " + len);
		
		for(int i = 1; i<=6; i++) {
			pop();
		}
	}

	private static int size() {
		return len;
	}

	private static void pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		int del = stack[top];
		top--;
		len--;
		System.out.println("sucessfully deleted item: " + del);
	}

	private static boolean isEmpty() {
		return top==-1;
	}

	private static void push(int x) {
		if(isFull()) {
			System.out.println("stack is full: " + x + " can't be add");
			return;
		}
		top++;
		len++;
		stack[top] = x;
		System.out.println(x + ": added successfully");
	}
	

	private static boolean isFull() {		
		return top==N-1;
	}
}
//output
//1: added successfully
//2: added successfully
//3: added successfully
//4: added successfully
//5: added successfully
//stack is full: 6 can't be add
//current size of the stack: 5
//sucessfully deleted item: 5
//sucessfully deleted item: 4
//sucessfully deleted item: 3
//sucessfully deleted item: 2
//sucessfully deleted item: 1
//stack is empty

