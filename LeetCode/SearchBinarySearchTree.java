

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SearchBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
      return getNode(root,val);     
    }
    public TreeNode getNode(TreeNode root,int x){
       if(root==null) 
            return null;
        if(root.val==x) 
            return root;
        else if(root.val> x)
            return getNode(root.left,x);
        else
            return getNode(root.right,x);
    }
}