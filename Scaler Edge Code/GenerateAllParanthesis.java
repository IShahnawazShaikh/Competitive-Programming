import java.util.ArrayList;

public class GenerateAllParanthesis {
	public static ArrayList<String> generateParenthesis(int A) {

		ArrayList<String> list = new ArrayList<>();
		getParanthesis(list, 0, 0, "", A);
		System.out.println(list);;
		return list;
	}

	public static void getParanthesis(ArrayList<String> list, int open, int close, String s, int n) {
		if (close == n) {
			list.add(s);
			return;
		}
		if (open < n) {
			String s2 = s + '(';
			getParanthesis(list, open + 1, close, s2, n);
		}
		if (open > close) {
			String s3 = s + ')';
			getParanthesis(list, open, close + 1, s3, n);
		}
	}
	public static void main(String[] args) {
		generateParenthesis(3);	
	}

}
