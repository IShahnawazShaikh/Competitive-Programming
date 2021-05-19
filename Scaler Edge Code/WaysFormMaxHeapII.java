public class WaysFormMaxHeapII {
	long dp1[];
	long dp2[][];
	long dp3[];
	int log2[];

	int MOD = 1000000007;

	public int solve(int[] A) {
		int i, j, n = A.length;
		if (n < 2)
			return 0;
		dp1 = new long[n + 1];
		dp3 = new long[n + 1];
		dp2 = new long[n + 1][n + 1];
		log2 = new int[n + 1];

		for (i = 0; i <= n; i++) {
			dp1[i] = -1;
			dp3[i] = -1;
			for (j = 0; j <= n; j++)
				dp2[i][j] = -1;
		}
		int currlog2 = -1;
		int power = 1;
		for (i = 1; i <= n; i++) {
			if (i == power) {
				currlog2++;
				power *= 2;
			}
			log2[i] = currlog2;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int mxCnt = 0;
		for (i = 0; i < n; i++) {
			max = Math.max(max, A[i]);
			min = Math.min(min, A[i]);

		}
		for (i = 0; i < n; i++)
			if (max == A[i])
				mxCnt++;
		long ans2 = 0;
		if (mxCnt == 2) {
			ans2 = ways(n);
		} else {
			ans2 = ways2(n);
		}
		return (int) (ans2 % MOD);
	}

	public long ways2(int n) {
		if (n < 2)
			return 1;
		if (n < 4)
			return 1;
		if (n == 4)
			return 2;
		if (n == 5)
			return 4;
		if (dp3[n] != -1)
			return dp3[n];
		int L = getLeft(n);
		int R = n - 1 - L;
		long ans = 0;
		ans = (((fact(n - 3, L - 2) * (1L * ways2(L))) % MOD) * (1L * ways(R)) % MOD);
		ans %= MOD;
		ans += (((fact(n - 3, R - 2) * (1L * ways(L))) % MOD) * (1L * ways2(R)) % MOD);
		ans %= MOD;
		ans += (((fact(n - 3, L - 1) * (1L * ways(L))) % MOD) * (1L * ways(R)) % MOD);
		ans %= MOD;
		dp3[n] = ans;
		return ans;
	}

	public long ways(int n) {
		if (n <= 1)
			return 1;
		if (dp1[n] != -1)
			return dp1[n];
		int L = getLeft(n);
		long ans = 0;
		ans = (((fact(n - 1, L) * (1l * ways(L))) % MOD) * (1l * ways(n - 1 - L)) % MOD);
		ans %= MOD;
		dp1[n] = ans;

		return ans;
	}

	public int getLeft(int n) {
		if (n == 1)
			return 0;
		int h = log2[n];

		int X = (1 << h) - 1; // No of Node Upto Second Last Level
		int L = (X - 1) / 2 + Math.min(n - X, (X + 1) / 2); // ( x+1)/2== 2^h/2 total max nodes in left subtree
															 
		return L;
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
		WaysFormMaxHeapII obj = new WaysFormMaxHeapII();
		obj.solve(new int[] { 9, 9, 21, 34, 44, 48, 68, 79, 88, 97, 113, 114, 124, 141, 145, 164, 170, 177, 189, 191,
				207, 227, 236, 241, 250, 252, 263, 277, 278 });

	}
}
