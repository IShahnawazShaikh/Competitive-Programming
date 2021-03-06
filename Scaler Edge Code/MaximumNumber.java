
public class MaximumNumber {
	public static int solve(int[] A, int B) {
		int i, n = A.length;
		int low = 1, high = n;
		long presum[] = new long[n];
		presum[0] = A[0];
		for (i = 1; i < n; i++)
			presum[i] = A[i] + presum[i - 1];
		int mid = 0, ans = 1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (check(presum, mid, B)) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static boolean check(long A[], int mid, int B) {
		int index = 0, i, n = A.length;
		long p = 0;
		for (i = mid - 1; i < n; i++) {
			if (A[i] - p > B)
				return false;
			p = A[index++];
		}
		return true;
	}

	public static void main(String[] args) {
		solve(new int[] { 145, 540, 460, 574, 719, 946, 675, 214, 724, 256, 102, 533, 569, 214, 961, 181, 691 }, 5093);

	}

}
