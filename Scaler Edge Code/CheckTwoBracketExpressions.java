import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckTwoBracketExpressions {
	public static int solve(String A, String B) {
		Map<Character, Integer> mp1 = new HashMap<>();
		Map<Character, Integer> mp2 = new HashMap<>();

		int i, n = A.length();
		mp1 = getSignMap(A);
		System.out.println(mp1);

		System.out.println();
		System.out.println();

		mp2 = getSignMap(B);
		System.out.println(mp2);

		if (mp1.size() != mp2.size())
			return 0;
		for (Character key : mp1.keySet()) {
			if (mp1.get(key) != mp2.get(key))
				return 0;
		}
		return 1;
	}

	public static Map<Character, Integer> getSignMap(String A) {
		Stack<Integer> sign = new Stack<Integer>();
		sign.push(1);
		Map<Character, Integer> mp = new HashMap<>();
		int i, n = A.length();
		for (i = 0; i < n; i++) {
			// System.out.println(sign);
			char ch = A.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (i > 0) {
					if (A.charAt(i - 1) == '+' || A.charAt(i - 1) == '(') {
						mp.put(ch, sign.peek() * 1);
					} else {
						mp.put(ch, sign.peek() * -1);
					}
				} else
					mp.put(ch, 1);
			} else if (i > 0 && ch == '(') {
				if (A.charAt(i - 1) == '(') {
					sign.push(sign.peek());
				} else if (A.charAt(i - 1) == '+') {
					sign.push(sign.peek() * 1);
				} else {
					sign.push(sign.peek() * (-1));
				}

			} else if (ch == ')') {
				sign.pop();
			} else
				continue;
		}

		return mp;
	}

	public static void main(String[] args) {
		System.out.println(solve("-(a+((b-c)-(d+e)))", "-(a+b-c-d-e)"));
	}

}
