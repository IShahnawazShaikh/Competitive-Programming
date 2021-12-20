
public class LeastCommonAncestor2 {
	public int lca(TreeNode A, int B, int C) {
		if (isExist(A, B) && isExist(A, C)) {
			TreeNode P = getAns(A, B, C);
			return P.val;
		}
		return -1;
	}

	public TreeNode getAns(TreeNode A, int B, int C) {
		if (A == null || A.val == B || A.val == C)
			return A;

		TreeNode left = getAns(A.left, B, C);
		TreeNode right = getAns(A.right, B, C);
		if (left != null && right != null)
			return A;
		return left == null ? right : left;
	}

	public boolean isExist(TreeNode A, int X) {
		if (A == null)
			return false;

		if (A.val == X)
			return true;
		boolean left = isExist(A.left, X);
		boolean right = isExist(A.right, X);
		return left || right;
	}

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
}
