import java.util.PriorityQueue;

public class MaximumSrraySumAfterBnegations {
	public static int solve(int[] A, int B) {
		int i, n = A.length;
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (i = 0; i < n; i++)
			queue.add(A[i]);
		i = 1;
		while (i <= B) {
			int x = queue.poll();
			queue.add(-x);
			i++;
		}
		int ans = 0;
		while (!queue.isEmpty())
			ans += queue.poll();
	    System.out.println(ans);	
		return ans;
	}

	public static void main(String[] args) {
		solve(new int[] { 24, -68, -29, -9, 84 }, 4);

	}

}
