
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class TreeHeight {
    public int solve(TreeNode A) {
     return getAns(A);    
    }
    public static int getAns(TreeNode A){
     if(A==null) return 0;
     
     int left=getAns(A.left);
     int right=getAns(A.right);
     
     return 1+Math.max(left,right);
    }
}
