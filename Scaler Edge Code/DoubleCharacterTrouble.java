import java.util.Stack;

public class DoubleCharacterTrouble {
  public static String solve(String A) {
	Stack<Character> stack = new Stack<>();
	int i, n = A.length();
	for (i = 0; i < n; i++) {
	  if (stack.empty())
		stack.push(A.charAt(i));
	  else {
		if (!stack.empty() && stack.peek() != A.charAt(i))
			stack.push(A.charAt(i));
		else {
		   while (!stack.empty() && A.charAt(i) == stack.peek())
			 stack.pop();
			}
	  }
	 }
   StringBuilder ans = new StringBuilder();
   while (!stack.empty()) ans = ans.insert(0, stack.pop()); // insert of stringBuilder is used to append at begining
	 return ans.toString();
   }
  public static void main(String[] args) {
		solve("cddfeffe");

	}

}
