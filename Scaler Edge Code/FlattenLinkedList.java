
public class FlattenLinkedList {
	
	 class ListNode { 
		int val; ListNode right, down;
		ListNode(int x) {
			val =x; right = down = null;
		 } 
	 }
	 
	ListNode flatten(ListNode root) {
		return sortList(root);
	}

	public ListNode sortList(ListNode root) {
		if (root == null || root.right == null)
			return root;
		ListNode middle = getMiddle(root);
		ListNode root2 = middle.right;
		middle.right = null;
		ListNode A = sortList(root);
		ListNode B = sortList(root2);
		ListNode merge = mergeList(A, B);
		return merge;
	}

	public ListNode getMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.right != null && fast.right.right != null) {
			slow = slow.right;
			fast = fast.right.right;
		}
		return slow;
	}

	public ListNode mergeList(ListNode A, ListNode B) {
		ListNode merge = new ListNode(-1);
		ListNode tail = merge;
		while (A != null && B != null) {
			if (A.val <= B.val) {
				tail.down = A;
				tail = A;
				A = A.down;
			} else {
				tail.down = B;
				tail = B;
				B = B.down;
			}
		}
		if (A != null)
			tail.down = A;
		else if (B != null)
			tail.down = B;
		return merge.down;
	}

	public static void main(String[] args) {
		

	}

}
