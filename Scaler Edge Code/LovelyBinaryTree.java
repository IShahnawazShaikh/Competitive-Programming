import java.util.HashMap;
import java.util.Map;

/**
 * Definition for binary tree class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; left=null; right=null; }
 * 
 * }
 */
public class LovelyBinaryTree {
	int ans = 0;
	Map<Integer, Integer> mp = new HashMap<>();

	public int solve(TreeNode A) {
		count(A);
		return ans;
	}

	public void count(TreeNode A) {
		if (A == null)
			return;

		Map<Integer, Integer> mp = getFrequency(A, new HashMap<>());
		if (subtreePalindrome(mp))
			ans += 1;
		count(A.left);
		count(A.right);
	}

	public Map<Integer, Integer> getFrequency(TreeNode A, Map<Integer, Integer> mp) {
		if (A == null)
			return mp;

		if (mp.containsKey(A.val))
			mp.put(A.val, mp.get(A.val) + 1);
		else
			mp.put(A.val, 1);

		mp = getFrequency(A.left, mp);
		mp = getFrequency(A.right, mp);

		return mp;
	}
	public boolean subtreePalindrome(Map<Integer, Integer> mp) {
		boolean ok = true;
		for (int val : mp.values()) {
			if (val % 2 == 0)
				continue;
			else {
				if (ok) {
					ok = false;
				} else
					return false;
			}
		}
		return true;
	}
}
