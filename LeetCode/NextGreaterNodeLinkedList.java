import java.util.Stack;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}
	ListNode(int val) {
		this.val = val;
		next = null;
	}
}

public class NextGreaterNodeLinkedList {
	public static int[] nextLargerNodes(ListNode head) {
		if (head == null)
			return new int[] {};
		if (head.next == null)
			return new int[] { 0 };
		Stack<ListNode> stack = new Stack();
		ListNode temp = head;
		int cnt = 0;
		while (temp != null) {
			cnt += 1;
			if (stack.isEmpty())
				stack.push(temp);
			else {
				while (!stack.isEmpty() && temp.val > (stack.peek()).val) {
					ListNode p = stack.pop();
					p.val = temp.val;
				}
				stack.push(temp);
			}
			temp = temp.next;
		}
		while (!stack.isEmpty()) {
			ListNode p = stack.pop();
			p.val = 0;
		}
		int ans[] = new int[cnt];
		temp = head;
		cnt = 0;
		while (temp != null) {
			ans[cnt++] = temp.val;
			temp = temp.next;
		}
		return ans;
	}
	public static void main(String... s) {
		ListNode h1 = new ListNode(2);
		ListNode h2 = new ListNode(1);
		ListNode h3 = new ListNode(5);
		h1.next = h2;
		h2.next = h3;
		ListNode head = h1;
		nextLargerNodes(head);
	}
}