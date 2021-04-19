
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
public class BSTNodesInRange {
    public int solve(TreeNode A, int B, int C) {
     return getCount(A,B,C);    
    }
    public int getCount(TreeNode A,int B,int C){
     if(A==null) return 0;
     
     int left=getCount(A.left,B,C);
     
     int right=getCount(A.right,B,C);
     
     if(A.val>=B && A.val<=C) return left+right+1;
     
     else return left+right;      
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}  
}
