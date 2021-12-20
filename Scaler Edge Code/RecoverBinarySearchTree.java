
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
	public class RecoverBinarySearchTree {
	    boolean flag=true;
	    int first=0,sec=0,prev=Integer.MIN_VALUE;
	    public int[] recoverTree(TreeNode A) {
	      getAns(A); 
	      return new int[]{sec,first};     //return must be smaller one
	    }
	    public void getAns(TreeNode root){
	     
	     if(root==null) return;
	     
	     getAns(root.left);
	     
	     if(prev>root.val){
	      if(flag){     
	        first=prev;
	        sec=root.val;
	        flag=false;
	      }
	      else sec=root.val; 
	     }
	     prev=root.val;
	     
	     getAns(root.right);
	         
	    }
	}
