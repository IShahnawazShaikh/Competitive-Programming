import java.util.Stack;

public class KCharacterTrouble {
  public static String solve(String A, int B) {
    Stack<Character> stack = new Stack<>();
    int i = 0, n = A.length();
    if (B == 1)	return "";
	int cnt = 1;
	boolean st = false;
	while (i < n) {
	  cnt = 1;
	  st = false;
	  char ch = A.charAt(i);
	  if (stack.isEmpty()) stack.push(ch);
	  else {
	   if (ch == stack.peek()) {
		 int p = i;
		 while (p < n && A.charAt(p) == stack.peek()) {
			p++;
			cnt++;
			if (cnt == B) {
			  st = true;
			  break;
			}
 		  }		
	      if (st) {
	    	if (!stack.isEmpty())
	    		stack.pop();
	    	     i = p - 1;
		 }
	     else {
	       while (i < p) {
	    	 stack.push(ch);
	    	 i++;
	       }
	      i = p - 1;
	    }
	  }
	  else
		stack.push(ch);
	  }
	 i++;
	}
   StringBuilder ans = new StringBuilder("");
   String temp = "";
   while (!stack.isEmpty()) {
	 char ch = stack.pop();
	 temp += ch;
	 cnt = 1;
	 while (!stack.isEmpty() && ch == stack.peek()) {
		cnt += 1;
		stack.pop();
	  }
	 if (cnt == 3) {
	   cnt = 1;
	   continue;
	  }
	 ans.append(temp);
	 temp = "";
	}
 	System.out.println(ans);
	return ans.reverse().toString();
  }

 public static void main(String[] ar) {
		System.out.println("x: " + solve("abbac", 1));
	}
}
