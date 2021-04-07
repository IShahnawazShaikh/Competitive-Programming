import java.util.ArrayDeque;
import java.util.Deque;

public class NextLine1 {
	public ListNode solve(ListNode A, int B) {
		if (A == null || A.next == null)
			return A;
		Deque<Pair> deque = new ArrayDeque<>();
		ListNode temp = A;
		int cnt = 0;
		while (temp != null) {

			if (temp.val % B == 0) {
				deque.addLast(new Pair(cnt, temp.val));
			}
			cnt += 1;
			temp = temp.next;
		}

		temp = A;
		cnt = 0;
		while (temp != null && !deque.isEmpty()) {
			cnt += 1;
			Pair p = deque.getFirst();
			if (cnt <= p.count) {
				temp.val = p.val;
			} else {
				deque.removeFirst();
			}
			temp = temp.next;
		}
		return A;
	}
}

class Pair {
	int count, val;

	Pair(int count, int val) {
		this.count = count;
		this.val = val;
	}
}
