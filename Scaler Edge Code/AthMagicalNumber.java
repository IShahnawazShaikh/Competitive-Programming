
public class AthMagicalNumber {
	public static int solve(int A, int B, int C) {
		long mx = Math.max(B, C);
		long ans = 0, low = 1, high = mx * A;
		long cnt = 0, mid = 0;
		int MOD = 1000000007;
		int lcm = ((B * C) / gcd(B, C));
		if (lcm == 0)
			lcm = B * C;
		while (low <= high) {
			mid = (high - low) / 2 + low;
			cnt = (mid / B) + (mid / C) - (mid / (lcm));
			if (cnt == A) {
				ans = mid;
				ans %= MOD;
				high = mid - 1;
			} else if (cnt < A)
				low = mid + 1;
			else
				high = mid - 1;
		}
		System.out.println(ans);
		return (int) (ans % MOD);
	}

	public static int gcd(int A, int B) {
		if (A == 0)
			return B;
		return gcd(B % A, A);
	}

	public static void main(String[] args) {
	  solve(4,2,3);
	}

}
