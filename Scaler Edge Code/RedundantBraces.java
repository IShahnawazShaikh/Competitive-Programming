import java.util.Stack;

public class RedundantBraces {
 public static int braces(String A) {
  Stack<Character> stack = new Stack<Character>();
  int i, n = A.length();
  boolean st = true;
  for (i = 0; i < n; i++) {
	 char ch = A.charAt(i);
	 if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(' || ch == ')') {
		if (stack.empty() || ch == '(') {
		   stack.push(ch);
		   }
		else {
		 if (ch == ')') {
		   if (st && stack.peek() == '(') {
			   // System.out.println("YES");
			   return 1;
			}
		 st = true;
		 while (!stack.empty() && stack.peek() != '(') {
			stack.pop();
		  }
		 stack.pop();
		 }
		else {
	      while (!stack.empty() && prec(ch) <= prec(stack.peek())) {
	    	stack.pop();
	       }
	     stack.push(ch);
	     }
		}
	  }

   }
  // System.out.println("NO");
	return 0;
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

	public static void main(String[] args) {
		braces("(a+(a+b))");

	}

}
