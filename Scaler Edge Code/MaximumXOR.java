
class MaximumXOR {
	public int findMaximumXOR(int[] A) {
		TrieNode root = new TrieNode();
		insert(root, A[0]);
		int i, n = A.length;
		int ans = 0;
		for (i = 1; i < n; i++) {
			int tempAns = findXor(root, A[i]);
			ans = Math.max(tempAns, ans);
			insert(root, A[i]);
		}

		return ans;
	}

	public int findXor(TrieNode root, int x) {
		TrieNode temp = root;
		int i;
		int ans = 0;
		int bit = 0, compBit = 0;
		for (i = 31; i >= 0; i--) {

			if ((x & (1 << i)) > 0)
				bit = 1;
			else
				bit = 0;
			compBit = (1 ^ bit);
			if (temp.child[compBit] != null) {
				ans = ans + (1 << i);
				temp = temp.child[compBit];
			} else
				temp = temp.child[bit];
		}

		return ans;

	}

	public void insert(TrieNode root, int x) {
		TrieNode temp = root;
		int i;
		int bit = 0;
		for (i = 31; i >= 0; i--) {
			bit = 0;
			if ((x & (1 << i)) > 0)
				bit = 1;
			if (temp.child[bit] == null) {
				TrieNode node = new TrieNode();
				temp.child[bit] = node;
			}
			temp = temp.child[bit];
		}
	}

	static class TrieNode {
		TrieNode child[] = new TrieNode[2];

		TrieNode() {
			int i;
			for (i = 0; i < 2; i++)
				child[i] = null;
		}
	}

}