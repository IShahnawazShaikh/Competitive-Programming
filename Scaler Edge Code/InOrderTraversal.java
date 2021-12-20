import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class InOrderTraversal {
	public ArrayList<Integer> inorderTraversal(TreeNode A) {
		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (A != null || !stack.isEmpty()) {
			if (A != null) {
				stack.push(A);
				A = A.left;
			} else {
				A = stack.pop();
				list.add(A.val);
				A = A.right;
			}
		}
		return list;
	}
}
