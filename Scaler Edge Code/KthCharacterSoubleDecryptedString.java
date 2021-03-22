import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class KthCharacterSoubleDecryptedString {
	public static String solve(String A, int B) {
		int i, n = A.length();
		long count = 0;
		long C = 1L * B;
		Stack<Map<Character, Long>> stack = new Stack<>();
		for (i = 0; i < n; i++) {
			if (A.charAt(i) >= 'a' && A.charAt(i) <= 'z') {
				count++;
				if (count == C)
					return "" + A.charAt(i);
				Map<Character, Long> temp = new HashMap<>();
				temp.put(A.charAt(i), count);
				stack.push(temp);
			} else {
				StringBuilder num = new StringBuilder("");
				while (i < n && A.charAt(i) >= '0' && A.charAt(i) <= '9') {
					num.append(A.charAt(i));
					i++;
				}
				i--;
				count *= (Integer.parseInt(num.toString()));
			}
		}
		char ans = 'a';
		while (C > 0) {
			Map<Character, Long> mp = stack.pop();
			for (Character ch : mp.keySet()) {
				C = 1l * C % (mp.get(ch));
				ans = ch;
			}

		}
		return "" + ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
