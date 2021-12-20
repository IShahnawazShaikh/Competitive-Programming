//not done
public class IntegerToRoman {
	public static String intToRoman(int A) {
		StringBuilder ans = new StringBuilder();
		while (A > 0) {
			if (A >= 1000) {
				add('M', ans, A / 1000);
				A = A % 1000;
			} else if (A >= 500) {

				if (A < 900) {
					add('D', ans, A / 500);
					A = A % 500;
				} else {
					ans = ans.append('C');
					ans = ans.append('M');
					A = A % 100;
				}
			} else if (A >= 100) {
				if (A < 400) {
					add('C', ans, A / 100);
				} else {
					ans = ans.append('C');
					ans = ans.append('D');
				}
				A %= 100;
			} else if (A >= 50) {
				if (A < 90) {
					add('L', ans, A / 50);
					A = A % 50;
				} else {
					ans = ans.append('X');
					ans = ans.append('C');
					A %= 10;
				}

			} else if (A >= 10) {
				if (A < 40) {
					add('X', ans, A / 10);
				} else {
					
					ans = ans.append('X');
					ans = ans.append('L');
					//System.out.println("else: "+ans);
				}
				A %= 10;
			} else if (A >= 5) {
				if (A < 9) {
					add('V', ans, A / 5);
					A %= 5;
				} else {
					ans = ans.append('I');
					ans = ans.append('X');
					A = 0;
				}

			} else if (A >= 1) {
				if (A < 4) {
					add('I', ans, A / 1);
				} else {
					ans = ans.append('I');
					ans = ans.append('V');
				}
				A = 0;
			}

		}
	  System.out.println(ans);
		return ans.toString();
	}

	public static void add(char ch, StringBuilder ans, int n) {
		int i;
		//System.out.println(ch);
		for (i = 1; i <= n; i++)
			ans = ans.append(ch);
		// return ans;
	}

	public static void main(String[] args) {
		intToRoman(5);
	}
}
