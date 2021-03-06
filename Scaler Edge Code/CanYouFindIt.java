
public class CanYouFindIt {
	public static int solve(int A, int B, int C, int D) {
		long gd = gcd(A, B);
		long lcm1 = A * B / gd;
		long lcm2 = B * C / gcd(B, C);
		long lcm3 = A * C / gcd(A, C);
		long lcm4 = (lcm1 * C) / gcd(lcm1, C);

		int mn = Math.min(C, Math.min(A, B));

		int low = mn, high = mn * D;
		
		int ans = 0, mid = 0;
		long cnt = 0;
		while (low <= high) {
			mid = (high - low) / 2 + low;
			cnt = (mid / A + mid / B + mid / C) - (mid / lcm1) - (mid / lcm2) - (mid / lcm3) + (mid / lcm4);
	
			if (cnt >= D) {
				ans = mid;
				high = mid - 1;
			} else
				low = mid + 1;
		}
		System.out.println(ans);
		return ans;
	}

	public static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	public static void main(String[] args) {
		solve(3,6,12,6);

	}

}
