import java.util.ArrayList;

public class FindProbablity {

	long p = 0, q = 0;

	public int solve(ArrayList<Integer> A, int B, int C) {

		int mod = 1000000007;
		probablity(A, B, C, -1, 0);
		long ans = (p % mod) * power(q, mod - 2, mod);

		return (int) (ans % mod);

	}

	public void probablity(ArrayList<Integer> list, int B, int C, int candy, int turn) {

		if (turn == B) {
			if (candy < C)
				p += 1;
			q += 1;
		}

		int n = list.size();
		if (n == 0)
			return;

		int cn1 = list.get(0);
		list.remove(0);
		probablity(list, B, C, cn1, turn + 1);
		list.add(0, cn1);

		int cn3 = list.get(n - 1);
		list.remove(n - 1);
		probablity(list, B, C, cn3, turn + 1);
		list.add(n - 1, cn3);

		if (n % 2 == 1) {

			int cn2 = list.get(n / 2);
			list.remove(n / 2);
			probablity(list, B, C, cn2, turn + 1);
			list.add(n / 2, cn2);
		}
	}

	public static long power(long x, long y, int MOD) {
		if (y == 0)
			return 1;
		if (y == 1)
			return x;

		long temp = power(x, y / 2, MOD) % MOD;
		temp = (temp * temp) % MOD;
		if (y % 2 == 1) {
			temp = (temp * x) % MOD;
		}
		return temp;
	}

	public static void main(String... x) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(7);
		new FindProbablity().solve(list, 3, 7);
	}
} 
