public class DistanceBetweenNodesBST {

	static int ans = 0;

	public static int solve(TreeNode A, int B, int C) {

		TreeNode P = getLCA(A, B, C);

		getPath(P, B);
		getPath(P, C);

		return ans - 2;
	}

	public static TreeNode getLCA(TreeNode A, int B, int C) {
		if (A == null || A.val == B || A.val == C)
			return A;

		TreeNode left = getLCA(A.left, B, C);

		TreeNode right = getLCA(A.right, B, C);

		if (left != null && right != null)
			return A;

		return left == null ? right : left;
	}

	public static boolean getPath(TreeNode A, int x) {
		if (A == null)
			return false;
		if (A.val == x) {
			ans += 1;
			return true;
		}

		boolean left = getPath(A.left, x);
		boolean right = getPath(A.right, x);

		if (left || right) {
			ans += 1;
			return true;
		}
		return false;
	}

	public static void main(String... x) {
		TreeNode h1 = new TreeNode(1);
		TreeNode h2 = new TreeNode(2);
		TreeNode h3 = new TreeNode(3);
		TreeNode h4 = new TreeNode(4);
		TreeNode h5 = new TreeNode(5);
		TreeNode h6 = new TreeNode(6);
		TreeNode h7 = new TreeNode(7);

		h1.left = h2;
		h1.right = h3;
		h2.left = h4;
		h2.right = h5;
		h3.left = h6;
		h3.right = h7;
		TreeNode head = h1;
		solve(head, 5, 6);
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}
}
