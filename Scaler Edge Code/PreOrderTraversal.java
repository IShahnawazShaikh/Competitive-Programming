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
public class PreOrderTraversal {
	public ArrayList<Integer> preorderTraversal(TreeNode A) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		stack.push(A);
		while (!stack.isEmpty()) {
			TreeNode root = stack.pop();
			list.add(root.val);
			if (root.right != null)
				stack.push(root.right);
			if (root.left != null)
				stack.push(root.left);
		}
		return list;
	}
}
