/*
 * TC: O(N)
 * SC: O(N)
 *  improved : SC :O(1) in NextPointerBinaryTree2.java
 * */

import java.util.Queue;
class TreeLinkNode {
  int val;
  TreeLinkNode left, right, next; TreeLinkNode(int x) { val = x; }
  }
public class NextPointerBinaryTree {
 
	public class Solution {
		public void connect(TreeLinkNode root) {

//			Queue<TreeLinkNode> q1 = new LinkedList<>();
//			Queue<TreeLinkNode> q2 = new LinkedList<>();
			Queue<TreeLinkNode> q1=null,q2=null;
			q1.add(root);
			while (!q1.isEmpty()) {
				TreeLinkNode prev = null;
				while (!q1.isEmpty()) {
					TreeLinkNode node = q1.poll();
					if (prev != null) {
						prev.next = node;
					}
					prev = node;
					if (node.left != null)
						q2.add(node.left);
					if (node.right != null)
						q2.add(node.right);
				}
				Queue<TreeLinkNode> temp = q1;
				q1 = q2;
				q2 = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
