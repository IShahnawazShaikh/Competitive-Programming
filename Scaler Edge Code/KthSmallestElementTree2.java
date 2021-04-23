
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
 * 
 *  TC: O(N)
 *  SC: O(1)
 */
public class KthSmallestElementTree2 {
    int k;
    public int kthsmallest(TreeNode A, int B) {
      k=B;  
      return getAns(A);
    }
    public int getAns(TreeNode root){
    
     if(root==null) return -1;
     
     int ans=getAns(root.left);
     
     if(k==0) return ans;
     k--;
     if(k==0) return root.val;
     return getAns(root.right);
        
    } 
}
