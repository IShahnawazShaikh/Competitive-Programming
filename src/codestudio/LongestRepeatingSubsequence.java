package codestudio;

import java.util.Arrays;

//not done
public class LongestRepeatingSubsequence {
	public static int longestRepeatingSubsequence(String st, int n) {
		int[][] dp = new int[n + 1][n + 1];
		for (int[] arr : dp)
			Arrays.fill(arr, -1);
		solve(st, st, n, n, dp);
		System.out.println(dp[n][n]);
		return dp[n][n];

	}

	public static int solve(String s1, String s2, int i, int j, int[][] dp) {

		if (i == 0 || j == 0)
			return 0;

		if (dp[i][j] != -1)
			return dp[i][j];

		if (s1.charAt(i - 1) == s2.charAt(j - 1) && i!=j)
			dp[i][j] = 1 + solve(s1, s2, i - 1, j - 1, dp);

		else
			dp[i][j] = Math.max(solve(s1, s2, i - 1, j, dp), solve(s1, s2, i, j - 1, dp));
		
		return dp[i][j];
	}

	public static void main(String[] args) {
		longestRepeatingSubsequence("CACCBDADA", 9);

	}

}
