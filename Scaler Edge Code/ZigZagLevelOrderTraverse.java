import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {

	public List<List<Integer>> zigzagLevelOrder(TreeNode A) {
		// Queue<Pair> queue=new LinkedList<>();
		Queue<Pair> queue = new ArrayDeque<>();
		List<List<Integer>> Ans = new ArrayList<>();
		if (A == null)
			return Ans;
		queue.add(new Pair(A, 1));
		Stack<Pair> stack = new Stack<>();
		while (!queue.isEmpty()) {

			int size = queue.size();
			List<Integer> list = new ArrayList<>();

			while (size-- > 0) {

				Pair P = queue.poll();

				TreeNode node = P.node;
				int level = P.level;
				if (level % 2 == 0) {
					if (node.right != null)
						stack.push(new Pair(node.right, level + 1));
					if (node.left != null)
						stack.push(new Pair(node.left, level + 1));
				} else {
					if (node.left != null)
						stack.push(new Pair(node.left, level + 1));
					if (node.right != null)
						stack.push(new Pair(node.right, level + 1));
				}

				list.add(node.val);
			}
			while (!stack.isEmpty()) {
				queue.add(stack.pop());
			}
			Ans.add(list);

		}
		return Ans;
	}

	static class Pair {
		int level;
		TreeNode node;

		Pair(TreeNode n, int l) {
			node = n;
			level = l;
		}
	}

}
