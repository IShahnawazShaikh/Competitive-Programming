import java.util.ArrayList;

public class RangeMinimumQuery {
	static int segment[] = null;

	public static int[] solve(int[] A, int[][] Q) {
		int i, n = A.length, q = Q.length;

		segment = new int[4 * n];
		buildSegmentTree(A, 0, 0, n - 1);
		for (i = 0; i < 4 * n; i++)
			System.out.print(segment[i] + " ");
		System.out.println();
		ArrayList<Integer> list = new ArrayList<>();
		for (i = 0; i < q; i++) {

			if (Q[i][0] == 1) {
				list.add(search(0, 0, n - 1, Q[i][1] - 1, Q[i][2] - 1));
			} else {
				update(0, 0, n - 1, Q[i][1] - 1, Q[i][2]);
			}
		}

		int ans[] = new int[list.size()];
		for (i = 0; i < list.size(); i++)
			ans[i] = list.get(i);
		for (i = 0; i < list.size(); i++)
			System.out.print(ans[i] + " ");
		return new int[] {};
	}

	public static void update(int index, int left, int right, int uIndex, int val) {
		if (left == right) {
			segment[index] = val;
			return;
		}
		int mid = (left + right) / 2;
		if (uIndex <= mid) {
			update(2 * index + 1, left, mid, uIndex, val);
		} else {
			update(2 * index + 2, mid + 1, right, uIndex, val);
		}
		segment[index] = Math.min(segment[2 * index + 1], segment[2 * index + 2]);
	}

	public static int search(int index, int left, int right, int L, int R) {
		if (L > right || R < left)
			return Integer.MAX_VALUE;

		if (left >= L && right <= R) {
			return segment[index];
		}
		int mid = (left + right) / 2;
		int a1 = search(2 * index + 1, left, mid, L, R);
		int a2 = search(2 * index + 2, mid + 1, right, L, R);
		return Math.min(a1, a2);
	}

	public static void buildSegmentTree(int[] A, int index, int left, int right) {
		if (left == right) {
			segment[index] = A[left];
			return;
		}
		int mid = (left + right) / 2;
		buildSegmentTree(A, 2 * index + 1, left, mid);
		buildSegmentTree(A, 2 * index + 2, mid + 1, right);
		segment[index] = Math.min(segment[2 * index + 1], segment[2 * index + 2]);
	}

	public static void main(String[] args) {
		int[][] Q = { { 1, 1, 3 }, { 0, 1, 5 }, { 1, 1, 2 } };
		solve(new int[] { 1, 4, 1 }, Q);

	}

}
