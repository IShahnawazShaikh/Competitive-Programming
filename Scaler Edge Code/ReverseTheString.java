import java.util.ArrayList;

public class ReverseTheString {
	public static String solve(String A) {
		ArrayList<String> ans = new ArrayList<String>();
		int i, n = A.length();
		String temp = "";
		String strAns = "";
		for (i = 0; i < n; i++) {
			if (A.charAt(i) == 32) {
				if (temp == "")
					continue;
				else {
					ans.add(temp);
					temp = "";
				}
			} else {
				temp += A.charAt(i);
			}

		}
		if (temp != "")
			ans.add(temp);

		for (i = ans.size() - 1; i > 0; i--)
			strAns += ans.get(i) + " ";

		strAns += ans.get(0);
        System.out.println(strAns); 
		return strAns;
	}

	public static void main(String[] args) {
	 solve("I am Shahnawaz");
	}

}
