import java.util.*;

public class parenthisisCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] arr = { "(()}", "{{}}}]", "((", "{{[]}}()" };
		
		for(String str : arr) {
			boolean res = isBalance(str);
			System.out.println("input: " + str + "   "+ res);
		}
		
		s.close();
	}
	
	static boolean isBalance(String str) {
		Stack<Character> st = new Stack<>();
		
		for(char ch: str.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
				continue;
			}
			
			if(st.isEmpty()) {
				return false;
			}
			
			char pop = st.pop();
			
			if(pop == '(' && (ch=='}' || ch==']')) {
				return false;
			}
			if(pop == '{' && (ch==')' || ch==']')) {
				return false;
			}
			if(pop == '[' && (ch=='}' || ch==')')) {
				return false;
			}
		}
		return st.isEmpty();
	}

}

//output:
//input: (()}   false
//input: {{}}}]   false
//input: ((   false
//input: {{[]}}()   true
