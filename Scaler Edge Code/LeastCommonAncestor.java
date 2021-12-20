import java.util.Stack;

public class LeastCommonAncestor {
	Stack<Integer> stack = new Stack<>();

	public int lca(TreeNode A, int B, int C) {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		getPath(A, B);
		
		while(!stack.isEmpty()) stack1.push(stack.pop());
		
		getPath(A, C);
		while(!stack.isEmpty()) stack2.push(stack.pop());
		 
		int ans = -1;
		System.out.println(stack1+" "+stack2);
		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			if(stack1.peek()==stack2.peek()){
			   ans=stack1.peek();
			   break;
			}
			stack1.pop();
			stack2.pop();
		}
		System.out.println(ans);
		return ans;

	}

	public boolean getPath(TreeNode A, int B) {
		if (A == null)
			return false;
		if (A.val == B) {
			stack.push(A.val);
			return true;
		}
		boolean left = getPath(A.left, B);
		boolean right = getPath(A.right, B);
		if (left || right) {
			stack.push(A.val);
			return true;
		}
		return false;
	}

	public static void main(String... x) {
		LeastCommonAncestor obj = new LeastCommonAncestor();
		TreeNode h1=new TreeNode(1);
        TreeNode h2=new TreeNode(2);
        TreeNode h3=new TreeNode(3);
        TreeNode h4=new TreeNode(4);
        TreeNode h5=new TreeNode(5);
 
        
        h1.left=h2; h1.right=h3;
        h2.left=h4;
        h2.right=h5;
        TreeNode head=h1;
		obj.lca(head, 4, 5);
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}
}
