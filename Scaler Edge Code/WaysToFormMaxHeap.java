public class WaysToFormMaxHeap {
	long dp1[];
	long dp2[][];
	int log2[];

	long ans = 0;
	int MOD = 1000000007;

	public int solve(int A) {
		dp1 = new long[A + 1];
		dp2 = new long[A + 1][A + 1];
		log2 = new int[A+1];
		int i, j;
		for (i = 0; i <= A; i++) {
			dp1[i] = -1;
			for (j = 0; j < A; j++)
				dp2[i][j] = -1;
		}
		int currlog2 = -1;
		int power = 1;
		for (i = 1; i <= A; i++) {
			if (i == power) {
				currlog2++;
				power *= 2;
			}
			log2[i] = currlog2;
		}
		long ans2 = ways(A);
		System.out.println(ans2);
		return (int) (ans2 % MOD);
	}

	public long ways(int n) {
		if (n <= 1)
			return 1;
		if (dp1[n] != -1)
			return dp1[n];
		int L = getLeft(n);

		ans = ((fact(n - 1, L) * (1l * ways(L))%MOD) * (1l * ways(n - 1 - L))%MOD);
		ans %= MOD;
		dp1[n] = ans;

		return ans;
	}
	public int getLeft(int n) {
		if (n == 1)
			return 0;
		int h = log2[n];

		int lastlevel = n - ((1 << h) - 1);
		int maxNodeHthLevel = (1 << h);

		if (lastlevel >= maxNodeHthLevel / 2) {
			return (1 << h) - 1;
		}

		return (1 << h) - 1 - ((maxNodeHthLevel / 2) - lastlevel);

	}
	public long fact(int n, int k) {
		if (k > n)
			return 0;

		if (n <= 1)
			return 1;

		if (k == 0)
			return 1;

		if (dp2[n][k] != -1)
			return dp2[n][k];

		long ans = fact(n - 1, k) + fact(n - 1, k - 1);
		ans %= MOD;
		dp2[n][k] = ans;

		return ans;
	}

	public static void main(String[] args) {
		WaysToFormMaxHeap obj = new WaysToFormMaxHeap();
		obj.solve(99);
	}
}
