import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;

public class NMaxPairCombinations {
	public int[] solve(int[] A, int[] B) {
		int i, n = A.length;
		int ans[] = new int[n];
		PriorityQueue<PairSum> pq = new PriorityQueue<>();
		HashSet<Pair> set = new HashSet<>();

		Arrays.sort(A);
		Arrays.sort(B);
		pq.add(new PairSum(A[n - 1] + B[n - 1], n - 1, n - 1));
		set.add(new Pair(n - 1, n - 1));

		for (i = 0; i < n; i++) {
			PairSum P = pq.poll();
			ans[i] = P.val;

			if (P.i - 1 >= 0 && !set.contains(new Pair(P.i - 1, P.j))) {
				pq.add(new PairSum(A[P.i - 1] + B[P.j], P.i - 1, P.j));
				set.add(new Pair((P.i) - 1, P.j));

			}
			if (P.j - 1 >= 0 && !set.contains(new Pair(P.i, P.j - 1))) {
				pq.add(new PairSum(A[P.i] + B[P.j - 1], P.i, P.j - 1));
				set.add(new Pair(P.i, P.j - 1));
			}
		}
		return ans;
	}

	static class PairSum implements Comparable<PairSum>{
		int val, i, j;
		PairSum(int v, int a, int b) {
			val = v;
			i = a;
			j = b;
		}
		public int compareTo(PairSum a) {
			return a.val - val;
		}	
	}

	static class Pair {
		int i, j;

		Pair(int a, int b) {
			i = a;
			j = b;
		}

		@Override
		public boolean equals(Object obj) {
			Pair p = (Pair) obj;
			if (i == p.i && j == p.j)
				return true;
			return false;
		}

		@Override
		public int hashCode() {
			return Objects.hash(i, j);
		}
	}

	public static void main(String[] args) {
		NMaxPairCombinations obj = new NMaxPairCombinations();
		obj.solve(new int[] { 2, 4, 1, 1 }, new int[] { -2, -3, 2, 4 });

	}

}
