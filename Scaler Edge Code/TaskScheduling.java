import java.util.Deque;
import java.util.LinkedList;

public class TaskScheduling {
	public static int solve(int[] A, int[] B) {
		Deque<Integer> deque = new LinkedList<Integer>();
		int i, n = A.length;
		int cnt = 0;
		for (i = 0; i < n; i++)
			deque.addLast(A[i]);

		for (i = 0; i < n; i++) {

			while (!deque.isEmpty() && deque.getFirst() != B[i]) {
				int first = deque.removeFirst();
				deque.addLast(first);
				cnt += 1;
			}
			cnt += 1;
			deque.removeFirst();

		}
		System.out.println(cnt);
		return cnt;
	}

	public static void main(String[] args) {
		solve(new int[]{2,3,1,5,4},new int[]{1,3,5,4,2});

	}

}
