import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {
	public static String solve(String A) {
	    return infixToPostfix(A);
	}

	public static int prec(char c) {
		if (c == '^')
			return 3;
		else if (c == '*' || c == '/')
			return 2;
		else if (c == '+' || c == '-')
			return 1;
		else
			return -1;
	}

	public static String infixToPostfix(String s) {
		Stack<Character> st = new Stack<Character>();
		st.push('N');
		ArrayList<Character> ns = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char C = s.charAt(i);
			// If the scanned character is an operand, add it to output string.
			if ((C >= 'a' && C <= 'z') || (C >= 'A' && C <= 'Z'))
				ns.add(C);

			// If the scanned character is an '(', push it to the stack.
			else if (C == '(')
				st.push('(');

			// If the scanned character is an ')', pop and to output string from
			// the stack
			// until an '(' is encountered.
			else if (C == ')') {
				while (st.peek() != 'N' && st.peek() != '(') {
					char c = st.peek();
					st.pop();
					ns.add(c);
				}
				if (st.peek() == '(') {
					char c = st.peek();
					st.pop();
				}
			}

			// If an operator is scanned
			else {
				while (st.peek() != 'N' && prec(C) <= prec(st.peek())) {
					char c = st.peek();
					st.pop();
					ns.add(c);
				}
				st.push(C);
			}

		}
		// Pop all the remaining elements from the stack
		while (st.peek() != 'N') {
			char c = st.peek();
			st.pop();
			ns.add(c);
		}

		StringBuilder result = new StringBuilder(ns.size());
		for (Character c : ns) {
			result.append(c);
		}
		return result.toString();

	}

	public static void main(String[] args) {
		solve("a+b*(c^d-e)^(f+g*h)-i");
	}

}
