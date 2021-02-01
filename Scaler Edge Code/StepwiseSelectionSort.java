
public class StepwiseSelectionSort {
	public static int[] solve(int[] A) {
		int i, j, n = A.length;
		int min = 0, idx = -1;
		int ans[] = new int[n - 1];
		for (i = 0; i < n - 1; i++) {
			idx = -1;
			min = Integer.MAX_VALUE;
			for (j = i; j < n; j++) {
				if (min > A[j]) {
					min = A[j];
					idx = j;
				}
			}
			ans[i] = idx;
			A[i] = (A[i] + A[idx]) - (A[idx] = A[i]);
		}
		for (i = 0; i < n - 1; i++)
			System.out.print(ans[i] + " ");
		return ans;
	}

	public static void main(String[] args) {
		solve(new int[]{6, 4, 3, 7, 2, 8});

	}

}
