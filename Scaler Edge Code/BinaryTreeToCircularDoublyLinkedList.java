/*
class TreeNode {
    int val;
    TreeNode left, right;
    ListNode(int x) {
        val = x;
        left = right = null;
    }
}
*/
public class BinaryTreeToCircularDoublyLinkedList {
	static TreeNode prev = null, head = null;

	public static TreeNode solve(TreeNode root) {
		createDLL(root);
		
		prev.right = head;
		head.left = prev;
	   
		return head;
	}
	public static void createDLL(TreeNode root) {

		if (root == null)
			return;

		createDLL(root.left);

		if (head == null) {
			head = root;
		} else {
			prev.right = root;
			root.left = prev;
		}
		prev = root;
   
		createDLL(root.right);
	}
	public static void main(String[] args) {
		TreeNode h1 = new TreeNode(2);
		TreeNode h2 = new TreeNode(1);
		TreeNode h3 = new TreeNode(3);

		h1.left = h2;
		h1.right = h3;

		TreeNode head = h1;
		solve(head);
	}

}
