import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FreeCars {
	public static int solve(int[] A, int[] B) {
		long profit = 0;
		int i, n = A.length, MOD = 1000000007;
		Pair[] PairArray = new Pair[n];
		for (i = 0; i < n; i++)
			PairArray[i] = new Pair(A[i], B[i]);
		Arrays.sort(PairArray, new MyComparator());

		PriorityQueue<Integer> pq = new PriorityQueue<>(); // storing profit in   min-heap
													
		pq.add(PairArray[0].profit);
		int time = 0;
		for (i = 1; i < n; i++) {
			if (PairArray[i].start - time == 1) {
				if (pq.peek() < PairArray[i].profit) {
					pq.poll();
					pq.add(PairArray[i].profit);
				}
			} else {
				time += 1;
				pq.add(PairArray[i].profit);
			}
		}
		while (!pq.isEmpty()) {
			profit += pq.poll();
			profit %= MOD;
		}
		System.out.println(profit);
		return (int) (profit % MOD);
	}

	static class Pair {
		int start, profit;

		Pair(int s, int p) {
			start = s;
			profit = p;
		}
	}

	static class MyComparator implements Comparator<Pair> {
		public int compare(Pair p1, Pair p2) {
			return p1.start - p2.start;
		}
	}

	public static void main(String[] args) {
		solve(new int[] { 3, 8, 7, 5 }, new int[] { 3, 1, 7, 19 });
	}

}
