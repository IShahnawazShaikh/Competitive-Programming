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

public class PostOrderTraversal {
	public ArrayList<Integer> postorderTraversal(TreeNode A) {
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		stack.push(A);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			if (temp.left != null)
				stack.push(temp.left);
			if (temp.right != null)
				stack.push(temp.right);
			stack2.push(temp.val);
		}
		ArrayList<Integer> list = new ArrayList<>();
		while (!stack2.isEmpty()) {
			list.add(stack2.pop());
		}
		return list;

	}
}
