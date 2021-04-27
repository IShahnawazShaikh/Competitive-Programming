import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NodesAtGivenDistance {

	private void solve(TreeNode root, int target, int k) {
	 Map<TreeNode,TreeNode> mp=new HashMap<>(); 
	 getParentNodes(root,null,mp);	
	 TreeNode targetNode=getTarget(root,target);
	 //System.out.println(targetNode.val);
	 //System.out.println(mp);
	 getNodeAtKthDistance(targetNode,k); 
	 while(mp.get(targetNode)!=null && k>0){
	  k-=1; 	 
	  TreeNode temp=mp.get(targetNode);
	  //System.out.println(temp.val+" "+temp.right.val);
	  if(k==0) System.out.println(temp.val); 
	  
	  if(targetNode.val==temp.left.val){
		  getNodeAtKthDistance(temp.right,k-1);  
	  }
	  else{
		  getNodeAtKthDistance(temp.left,k-1);	  
	  }
	  targetNode=temp;
		 
	 }
	 
	 
	 
	 

	}

	private void getParentNodes(TreeNode root, TreeNode prev,Map<TreeNode,TreeNode> mp) {
	 
	  if(root==null) return;
	  
	  mp.put(root,prev);
	  
	  getParentNodes(root.left,root,mp);
	  getParentNodes(root.right,root,mp);
	}

	private void getNodeAtKthDistance(TreeNode root, int k) {
	  //System.out.println(root.val+" "+k);	
      if(root==null) return;
      if(k==0) {System.out.println(root.val); return;}
      getNodeAtKthDistance(root.left,k-1);
      getNodeAtKthDistance(root.right,k-1);
	}

	private TreeNode getTarget(TreeNode root, int target) {
		if(root==null) return null;
		if(root.val==target) return root;
		
		TreeNode left=getTarget(root.left,target);
		TreeNode right=getTarget(root.right,target);
	  	
	    if(left==null) return right;
	    return left;
	}

	public static void main(String[] args) {
	
		NodesAtGivenDistance obj = new NodesAtGivenDistance();
		TreeNode h1 = new TreeNode(2);
		TreeNode h2 = new TreeNode(4);
		TreeNode h3 = new TreeNode(5);
		TreeNode h4 = new TreeNode(6);
		TreeNode h5 = new TreeNode(7);
		TreeNode h6 = new TreeNode(10);
		TreeNode h7 = new TreeNode(11);

		TreeNode h8 = new TreeNode(8);
		TreeNode h9 = new TreeNode(9);

		h1.left = h2;
		h1.right = h3;

		h2.left = h4;
		h2.right = h5;
		h4.left = h8;
		h5.left = h9;

		h3.left = h6;
		h3.right = h7;
		TreeNode head = h1;
		obj.solve(head, 4, 2);
	}

}
