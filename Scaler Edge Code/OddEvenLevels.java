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
public class OddEvenLevels {
    public int solve(TreeNode A) {
     if(A==null) return 0;
     Queue<Pair> queue=new LinkedList<>();
     queue.add(new Pair(A,1));
     long odd=0,even=0;
     while(!queue.isEmpty()){
        Pair P=queue.poll();
        TreeNode node=P.node;
        int level=P.level;
        if(node.left!=null) queue.add(new Pair(node.left,level+1));
        if(node.right!=null) queue.add(new Pair(node.right,level+1));
        
        if((level^1)==level+1){  //even
          even+=node.val;    
        }
        else{
          odd+=node.val;    
        }
     }
     
     return (int)(odd-even);
     
    }
}
 class Pair{
    int level;
    TreeNode node;
    Pair(TreeNode node,int level){
     this.level=level;
     this.node=node;
    }
}
