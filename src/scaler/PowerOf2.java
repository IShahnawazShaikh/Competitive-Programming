package scaler;

public class PowerOf2 {
	public int power(String A) {

		int len = A.length();
		char ch[] = A.toCharArray();

		if (len == 1 && ch[len - 1] == '1')
			return 0;

		int num = 0;
		while (len != 1 || ch[len - 1] != '1') { // why we need len!=1 eg: 248 when we have [3,1] it will return 1 if we
													// not use.

			if (ch[len - 1] % 2 == 1)
				return 0;
			int idx = 0;
			for (int i = 0; i < len; i++) {

				num = num * 10 + (ch[i] - '0');

				if (num < 2) {

					if (i != 0)
						ch[idx++] = '0';

					continue;

				}
				ch[idx++] = (char) ((num / 2) + (int) '0');

				// eg of cases of even odd
				if ((num ^ 1) == (num + 1))
					num = 0; // case 12
				else
					num = 1; // case 13
			}
			len = idx; // length reduced
		}
		return 1;

	}

	public static void main(String[] args) {
		System.out.println(new PowerOf2().power("248"));

	}

}
