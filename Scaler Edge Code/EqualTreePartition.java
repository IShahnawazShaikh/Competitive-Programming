import java.util.HashSet;
import java.util.Set;

public class EqualTreePartition {
    public static Set<Integer> set=new HashSet<>();
    public static int solve(TreeNode A) {
	 int sum=check(A.left);
	 sum+=check(A.right);
	 sum+=A.val;
	 if((sum^1)==sum+1){
	  if(set.contains(sum/2))  return 1;
	  else return 0;
	 }
	 return 0; 
	}

	public static int check(TreeNode A) {
     if(A.left==null && A.right==null) { 
    	 set.add(A.val);
    	 return A.val;
     }
     int left=0,right=0;
	 if(A.left!=null) left=check(A.left);
	 if(A.right!=null) right=check(A.right);
	 set.add(left+right+A.val);
	 return left+right+A.val;	
	}


	public static void main(String... x) {
		LeastCommonAncestor obj = new LeastCommonAncestor();
		TreeNode h1 = new TreeNode(-8);
		TreeNode h2 = new TreeNode(3);
		TreeNode h3 = new TreeNode(9);
		 TreeNode h4=new TreeNode(-8);
		TreeNode h5=new TreeNode(4);

		h1.left = h2;
		h1.right=h3;
		
		h2.left=h4;
		h2.right=h5;
		TreeNode head = h1;
		solve(h1);
	}
}
