import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}
public class LevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
		     ArrayList<ArrayList<Integer>> Ans=new ArrayList<ArrayList<Integer>>();
		     if(A==null)
		        return Ans;
		     Queue<Pair> queue=new LinkedList<>();
		     queue.add(new Pair(A,0));
		     
		     while(!queue.isEmpty()){
		        Pair p=queue.poll();
		        int level=p.level;
		        TreeNode node=p.node;
		        
		        if(node.left!=null) queue.add(new Pair(node.left,level+1));
		        if(node.right!=null) queue.add(new Pair(node.right,level+1));
		    
		        if(Ans.size()>level){
		          ArrayList<Integer> list=Ans.get(level);
		          list.add(node.val);    
		        }
		        else{
		          ArrayList<Integer> list=new ArrayList<Integer>();
		          list.add(node.val); 
		          Ans.add(list);
		        }
		     }
		    return Ans; 
		    }
}

class Pair {
	TreeNode node;
	int level;

	Pair(TreeNode node, int level) {
		this.node = node;
		this.level = level;
	}
}}
