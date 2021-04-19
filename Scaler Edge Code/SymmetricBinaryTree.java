public class SymmetricBinaryTree {
    public static int isSymmetric(TreeNode A) {
        
        if(check(A.left,A.right)) return 1;
        return 0;
    }
    public static boolean check(TreeNode A,TreeNode B){
      
      if(A==null && B==null) return true;
      if(A==null || B==null) return false;
      
      if(A.val!=B.val) return false;
      
      boolean left=check(A.left,B.right);
      boolean right=check(A.right,B.left);
      return left && right;
        
    }

	public static void main(String[] args) {
		TreeNode h1 = new TreeNode(1);
		TreeNode h2 = new TreeNode(2);
		TreeNode h3 = new TreeNode(2);
		TreeNode h4 = new TreeNode(3);
		TreeNode h5 = new TreeNode(4);

		TreeNode h6 = new TreeNode(4);
		TreeNode h7 = new TreeNode(3);
		h1.left = h2;
		h1.right = h3;
		h2.left = h4;
		h2.right = h5;

		h3.left = h6;
		h3.right = h7;

		TreeNode head = h1;
		isSymmetric(head);

	}

}
