
/**
 * Definition for binary tree class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class FlattenBinaryTreeLinkedList {
	TreeNode prev, head;
	public TreeNode flatten(TreeNode root) {
		 prev = null;
		 head = null;
		 constructLinkedList(root);
		 return  head;	
		    
		}
		
		public void constructLinkedList(TreeNode root) {
			
			if (root == null)
				return;
		
			TreeNode temp=null;
			if (head == null) {
				head = root;
				temp=head.right;
			} else {
			    temp=root.right;
				prev.right = root;
			}
			prev = root;
			constructLinkedList(root.left);
			constructLinkedList(temp);
			root.left=null;
		}

	public static void main(String[] args) {
		TreeNode h1 = new TreeNode(1);
		TreeNode h2 = new TreeNode(2);
		TreeNode h3 = new TreeNode(3);

		h1.left = h2;
		h1.right = h3;

		TreeNode head = h1;
		FlattenBinaryTreeLinkedList obj=new FlattenBinaryTreeLinkedList();
		obj.flatten(head);
	}
}
