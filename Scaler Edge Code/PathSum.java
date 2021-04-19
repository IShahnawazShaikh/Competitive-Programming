public class PathSum {
	public static int hasPathSum(TreeNode A, int B) {

		if (check(A, B)) {
			return 1;
		}
		return 0;
	}

	public static boolean check(TreeNode A, int sum) {

		sum = sum - A.val;
		boolean left = false, right = false;

		if (A.left != null) {
			left = check(A.left, sum);
		}
		if (A.right != null) {
			right = check(A.right, sum);
		}
		if ((A.left == null && A.right == null) && sum == 0) {
			return true;
		} else {
			return left || right;
		}

	}

	public static void main(String[] args) {
		TreeNode h1 = new TreeNode(1);
		TreeNode h2 = new TreeNode(2);
		TreeNode h3 = new TreeNode(3);
		TreeNode h4 = new TreeNode(2);
		h1.left = h2;
		h1.right = h4;
		h2.left = h3;
		TreeNode head = h1;
		hasPathSum(head, 6);

	}

}
