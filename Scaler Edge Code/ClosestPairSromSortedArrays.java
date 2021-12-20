
public class ClosestPairSromSortedArrays {
	public static int[] solve(int[] A, int[] B, int C) {
		int p1 = 0, n = A.length, m = B.length;
		int p2 = m - 1;
		int ans[] = new int[2];
		int diff = Integer.MAX_VALUE;
		while (p1 < n && p2 >= 0) {
			System.out.println(Math.abs(A[p1] + B[p2] - C));
			if (Math.abs(A[p1] + B[p2] - C) <= diff) {
				if (Math.abs(A[p1] + B[p2] - C) < diff) {
					ans[0] = A[p1];
					ans[1] = B[p2];
					diff = Math.abs(A[p1] + B[p2] - C);
				} else if (Math.abs(A[p1] + B[p2] - C) == diff && ans[0] == A[p1]) {
					ans[1] = B[p2];
				}
			}
			if (A[p1] + B[p2] < C)
				p1++;
			else
				p2--;
		}

		System.out.println(ans[0] + " " + ans[1]);
		return ans;
	}
	public static void main(String[] args) {
		solve(new int[] { 1 }, new int[] { 2, 4 }, 4);
	}

}
