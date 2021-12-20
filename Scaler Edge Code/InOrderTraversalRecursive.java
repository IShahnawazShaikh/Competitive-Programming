import java.util.ArrayList;
import java.util.List;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
     }
 }
class InOrderTraversalRecursive {
    List<Integer> list=null;
    public List<Integer> inorderTraversal(TreeNode root) {
      list=new ArrayList<Integer>();  
      getTraversalList(root);
      return list;       
    }
 public void getTraversalList(TreeNode head){
    if(head==null) return;    
    getTraversalList(head.left);
    list.add(head.val); 
    getTraversalList(head.right);
        
  } 
}