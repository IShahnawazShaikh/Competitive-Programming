
public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode A) {
        invert(A); 
        return A;   
     }
     public static void invert(TreeNode A){
       if(A==null) return;
       
       TreeNode temp=A.left;
       A.left=A.right;
       A.right=temp;
       invert(A.left);
       invert(A.right);
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
//		h2.left = h4;
//		h2.right = h5;
//		h3.left = h6;
//		h3.right = h7;
		TreeNode head = h1;
		invertTree(head);
	}

}
