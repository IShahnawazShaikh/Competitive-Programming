public class LinkedListCycle1 {
	static ListNode head = null;
	static int size = 0;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public static void insertBegining(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public static void print() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int countNode(ListNode A) {
		int count = 0;
		ListNode temp = A;
		while (temp != null) {
			count += 1;
			temp = temp.next;
		}
		return count;
	}

	public static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		insertBegining(5);
		insertBegining(4);
		insertBegining(3);
		insertBegining(2);
		insertBegining(1);
		print();
		hasCycle(head);
	}

}
