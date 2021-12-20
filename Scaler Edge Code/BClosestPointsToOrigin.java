import java.util.Comparator;
import java.util.PriorityQueue;

public class BClosestPointsToOrigin {
	public static int[][] solve(int[][] A, int B) {
		PriorityQueue<NewPair> queue = new PriorityQueue<>(new myComparatorx());
		int i, n = A.length;
		for (i = 0; i < n; i++) {
			long val = (1L * A[i][0] * A[i][0]) + (1L * A[i][1] * A[i][1]);
			queue.add(new NewPair(val, A[i][0], A[i][1]));
		}
		i = 1;
		int ans[][] = new int[B][];

		while (i <= B) {
			NewPair P = queue.poll();
			ans[i - 1] = new int[] { P.x, P.y };
			i++;
		}
		return ans;
	}
	public static void main(String... x) {
		int ar[][] = { { 1, 3 }, { -2, 2 } };
		solve(ar, 1);
	}
	static class myComparatorx implements Comparator<NewPair> {
		public int compare(NewPair p1, NewPair p2) {
			if (p1.dis < p2.dis)
				return -1;
			return 1;
		}
	}

	static class NewPair {
		long dis;
		int x, y;

		NewPair(long d, int x, int y) {
			dis = d;
			this.x = x;
			this.y = y;
		}
	}
}

