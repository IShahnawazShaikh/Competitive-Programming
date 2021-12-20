import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalRecursive {
	 List<Integer> list=null;
	  public List<Integer> preorderTraversal(TreeNode A) {
	      list=new ArrayList<Integer>();  
	      getTraversalList(A);
	      return list;
	   }
	  public void getTraversalList(TreeNode head){
	    if(head==null) return;    
	    list.add(head.val);
	    getTraversalList(head.left);
	    getTraversalList(head.right);    
	  }
}
