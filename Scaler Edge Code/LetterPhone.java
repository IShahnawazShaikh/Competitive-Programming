import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterPhone {
	public ArrayList<String> letterCombinations(String A) {
		ArrayList<String> aList = new ArrayList<>();

		Map<Character, String> mp = new HashMap<>();
		mp.put('0', "0");
		mp.put('1', "1");
		mp.put('2', "abc");
		mp.put('3', "def");
		mp.put('4', "ghi");
		mp.put('5', "jkl");
		mp.put('6', "mno");
		mp.put('7', "pqrs");
		mp.put('8', "tuv");
		mp.put('9', "wxyz");

		char[] ch = A.toCharArray();

		String[] s = new String[ch.length];
		int i;
		for (i = 0; i < ch.length; i++)
			s[i] = mp.get(ch[i]);
	
		countCombinations(s, 0, "", aList);
		System.out.println(aList);

		return aList;
	}

	private void countCombinations(String[] s, int ind, String prefx, ArrayList<String> aList) {
		if (ind == s.length) {
			aList.add(prefx);
			return;
		}
		String s1 = s[ind];
		int i, n = s1.length();
		String s2 = "";
		for (i = 0; i < n; i++) {
			s2 = prefx + s1.charAt(i);
			countCombinations(s, ind + 1, s2, aList);
		}

	}

	public static void main(String[] args) {
		LetterPhone obj = new LetterPhone();

		obj.letterCombinations("10");
	}

}
