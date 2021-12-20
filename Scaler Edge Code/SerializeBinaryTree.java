import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

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
public class SerializeBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
      ArrayList<Integer> Ans=new ArrayList<>();
      Queue<TreeNode> queue=new ArrayDeque<>();
      queue.add(A);
      while(!queue.isEmpty()){
        TreeNode node=queue.poll();
        if(node==null){
           Ans.add(-1);     
        }
        else{
          Ans.add(node.val);
          queue.add(node.left);
          queue.add(node.right);
        }
          
      }
      return Ans;
    }
}
