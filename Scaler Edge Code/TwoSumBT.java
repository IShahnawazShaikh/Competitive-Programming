import java.util.HashSet;
import java.util.Set;

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
public class TwoSumBT {
    Set<Integer> set=null;
    public int t2Sum(TreeNode A, int B) {
     set=new HashSet<>();
     return getAns(A,B);
    }
    
    public int getAns(TreeNode root,int x){
      if(root==null) return 0;
       
      if(set.contains(x-root.val)){
        return 1;  
      }
      else  set.add(root.val); 
      int b1=getAns(root.left,x);
      int b2=getAns(root.right,x);
      
      return (b1|b2);
    }
}
