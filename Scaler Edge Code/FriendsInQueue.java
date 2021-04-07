 class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
   }
 
public class FriendsInQueue {
	public ListNode solve(ListNode A, int B) {
		if (A == null || A.next == null)
			return A;
		ListNode temp = A;
		int pos = 0;
		ListNode heads[] = new ListNode[B];
		while (pos < B) {
			heads[pos] = temp;
			temp = temp.next;
			heads[pos].next = null;
			pos += 1;
		}

		while (temp != null) {
			ListNode p = temp;
			temp = temp.next;
			addAtFirst(heads[pos % B], p);
			pos += 1;
		}

		pos = 0;
		while (pos < B - 1) {
			ListNode head = heads[pos];
			temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = heads[pos + 1];

			pos += 1;
		}
		ListNode ans = heads[0];
		return ans;

	}

	public void addAtFirst(ListNode head, ListNode temp) {
		if (head.next == null) {
			head.next = temp;
			temp.next = null;

		} else {
			ListNode p = head.next;
			head.next = temp;
			temp.next = p;
		}
	}

	public static void main(String[] args) {
	

	}

}
