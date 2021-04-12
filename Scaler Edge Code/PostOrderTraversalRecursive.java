import java.util.ArrayList;
import java.util.List;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//       this.right = right;
//   }
//}
public class PostOrderTraversalRecursive {
    List<Integer> list=null; 
    public List<Integer> postorderTraversal(TreeNode root) {
      list=new ArrayList<Integer>();  
      getTraversalList(root);
      return list;       
    }
 public void getTraversalList(TreeNode head){
    if(head==null) return;    
     getTraversalList(head.left);
     getTraversalList(head.right);
     list.add(head.val); 
        
  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
