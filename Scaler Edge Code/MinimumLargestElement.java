import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumLargestElement {
	public int solve(int[] original, int B) {
		int i, n = original.length;
		PriorityQueue<Pair> queue = new PriorityQueue<Pair>(new MyComparator());
		int ans[] = new int[n];
		for (i = 0; i < n; i++) {
			ans[i] = original[i];
			queue.add(new Pair(i,2*original[i]));
		}
		i = 1;
		
		while (i <= B) {
			Pair P = queue.poll();
			ans[P.index] = P.val;
			queue.add(new Pair(P.index,original[P.index] + P.val));
			i += 1;
		}
		int max = Integer.MIN_VALUE;
		for (i = 0; i < n; i++)
			max = Math.max(ans[i], max);
		
		System.out.println(max);
		return max;

	}
	static class Pair {
		int index;
		int val;

		Pair(int i, int v) {
			index = i;
			val = v;
		}
	}

	static class MyComparator implements Comparator<Pair> {
		public int compare(Pair p1, Pair p2) {
			return p1.val - p2.val;
		}
	}

	public static void main(String[] args) {
		MinimumLargestElement obj = new MinimumLargestElement();
		obj.solve(new int[]{5, 1, 4, 2},5);

	}

}
