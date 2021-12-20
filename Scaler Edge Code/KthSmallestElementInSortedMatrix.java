import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {
	public int solve(int[][] A, int k) {
		int i, n = A.length, m = A[0].length;
		PriorityQueue<Pair> queue = new PriorityQueue<>(new MyComparator());
		for (i = 0; i < n; i++)
			queue.add(new Pair(A[i][0], i, 0));
		i = 0;
		int ans = 0;
		while (i < k) {
			Pair p = queue.poll();
			ans = p.val;
			if (p.column + 1 < m)
				queue.add(new Pair(A[p.row][p.column + 1], p.row, p.column + 1));
			i += 1;
		}
		return ans;
	}

	static class MyComparator implements Comparator<Pair> {
		public int compare(Pair p1, Pair p2) {
			return p1.val - p2.val;
		}
	}

	static class Pair {
		int row, column, val;

		Pair(int v, int r, int c) {
			val = v;
			row = r;
			column = c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
