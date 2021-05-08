import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	public ListNode mergeKLists(ArrayList<ListNode> list) {
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new MyComparator());
		for (ListNode node : list)
			queue.add(node);
		ListNode head = new ListNode(-1);
		ListNode tail = head;
		while (!queue.isEmpty()) {
			ListNode temp = queue.poll();
			tail.next = temp;
		    tail=temp;
			if (temp.next != null)
				queue.add(temp.next);
		}
		return head.next;
	}
	 static class MyComparator implements Comparator<ListNode> {
		public int compare(ListNode node1, ListNode node2) {
			return node1.val - node2.val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
