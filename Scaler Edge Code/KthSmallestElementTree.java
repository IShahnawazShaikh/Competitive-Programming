/*
 *  TC: O(N)
 *  SC: O(N)
 */

import java.util.HashMap;
import java.util.Map;

public class KthSmallestElementTree {
    static Map<TreeNode,Integer> mp=null;
    public int kthsmallest(TreeNode A, int B) {
     mp=new HashMap<>();
     countNode(A);
     TreeNode ans=getKthSmallest(A,B);
     return ans.val;
     
    }

    public static TreeNode getKthSmallest(TreeNode root,int x){
     
     if(mp.get(root)==x){
        return root; 
     }
     else if(mp.get(root)>x){
        return getKthSmallest(root.left,x); 
     }
     else
       return getKthSmallest(root.right,x-mp.get(root));
    }
    
    public static int countNode(TreeNode root){
      if(root==null) return 0;
      
      int left=countNode(root.left);
      int right=countNode(root.right);
      mp.put(root,left+1);
      return left+right+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
