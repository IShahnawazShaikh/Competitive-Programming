import java.util.ArrayList;

public class Seats {
	public static int seats(String A) {
		ArrayList<Integer> pos = new ArrayList<>();
		int i, n = A.length();
		for (i = 0; i < n; i++) {
			if (A.charAt(i) == 'x')
				pos.add(i);
		}
		int median = 0;
		int MOD = 10000003;
		if (pos.size() == 0)
			return 0;
		if (pos.size() % 2 == 0) {
			median = pos.get(pos.size() / 2) + pos.get(pos.size() / 2 - 1);
			median /= 2;
		} else {
			median = pos.get(pos.size() / 2);
		}
		// left count
		int p = median;
		long ans = 0;
		for (i = median; i >= 0; i--) {
			if (A.charAt(i) == 'x') {
				ans += p - i;
				ans %= MOD;
				p--;
			}
		}
		// right count
		p = median + 1;
		for (i = median + 1; i < n; i++) {
			if (A.charAt(i) == 'x') {
				ans += i - p;
				p++;
			}
		}
		System.out.println(ans);
		return (int) (ans % MOD);
	}
	public static void main(String[] args) {
		seats(".x..x");

	}

}
