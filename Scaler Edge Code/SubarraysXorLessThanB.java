
public class SubarraysXorLessThanB {
	long count = 0;

	public int solve(int[] A, int B) {
		int j, i, n = A.length;

		int preXor[] = new int[n + 1];
		preXor[0] = 0;
		for (i = 1; i <= n; i++)
			preXor[i] = preXor[i - 1] ^ A[i - 1];

		int MOD = 1000000007;
		TrieNode root = new TrieNode(1);
		insert(root, 0);
		for (i = 1; i <= n; i++) {
			if (i == 3)
				findCount(root, preXor[i], B);
			insert(root, preXor[i]);
		}
		System.out.println("ans: " + count);
		return (int) (count % MOD);
	}

	public void findCount(TrieNode root, int x, int B) {
		int i, bit = 0, compBit = 0;
		TrieNode temp = root;
		int ans = 0;
		System.out.println("num: " + x);
		int xBit = 0, bBit = 0, MOD = 1000000007;
		for (i = 3; i >= 0; i--) {
			xBit = 0;
			bBit = 0;

			if ((x & (1 << i)) > 0)
				xBit = 1;
			if ((B & (1 << i)) > 0)
				bBit = 1;

			bit = (xBit ^ bBit);
			compBit = (1 ^ bit);

			if ((xBit ^ compBit) < bBit) {
				if (temp.child[compBit] != null) {
					ans += temp.child[compBit].count;
				}
				if (temp.child[bit] != null)
					temp = temp.child[bit];
				else {

					break;
				}

			} else {
				if (temp.child[bit] != null)
					temp = temp.child[bit];
				else {

					break;
				}
			}
		}
		count += ans;
		count%=MOD;
	}
	public void insert(TrieNode root, int x) {
		int i, bit = 0;
		TrieNode temp = root;
		for (i = 3; i > 0; i--) {
			bit = 0;
			if ((x & (1 << i)) > 0)
				bit = 1;

			if (temp.child[bit] == null) {
				temp.child[bit] = new TrieNode(1);
			} else
				temp.child[bit].count = temp.child[bit].count + 1;
			temp = temp.child[bit];
		}

	}

	public static void main(String[] args) {
		SubarraysXorLessThanB obj = new SubarraysXorLessThanB();
		obj.solve(new int[] { 9, 4, 3, 11 }, 7);

	}

	static class TrieNode {
		TrieNode[] child = new TrieNode[2];
		int count;

		TrieNode(int cnt) {
			count = cnt;
			child[0] = null;
			child[1] = null;
		}
	}
}
