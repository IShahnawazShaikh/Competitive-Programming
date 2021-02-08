
public class SingleNumberSortedII {
	public static int solve(int[] A) {

		int ans = 0, n = A.length;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (mid == n - 1)
				return A[n - 1];

			if (A[mid] == A[mid + 1])
				mid++;

			// if all elements with index < mid are occuring twice then mid
			// should be odd
			if (mid % 2 == 1) {
				low = mid + 1;
			} else {
				ans = mid;
				high = mid - 1;
			}
		}
		return A[ans];
	}

	public static void main(String[] args) {
		solve(new int[] { -1, -1, 3, 3, 5, 5, 9 });

	}

}
