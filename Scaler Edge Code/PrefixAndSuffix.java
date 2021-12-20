
public class PrefixAndSuffix {
	public int[] solve(String[] A, String[] B) {
		TrieNode root1 = new TrieNode(1);
		TrieNode root2 = new TrieNode(1);
		int i, n = A.length, m = B.length;
		for (i = 0; i < n; i++) {
			constructTrie(root1, A[i]);
		}
		for (i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(A[i]);
			sb.reverse();
			constructTrie(root2, sb.toString());
		}

		int ans[] = new int[m];
		for (i = 0; i < m; i++) {
			int prefixCount = getWordCount(root1, B[i]);
			StringBuilder sb = new StringBuilder(B[i]);

			int suffixCount = getWordCount(root2, sb.reverse().toString());

			ans[i] = Math.min(prefixCount, suffixCount);
		}

		return ans;
	}

	public int getWordCount(TrieNode root, String s) {

		int i, n = s.length();
		TrieNode temp = root;
		for (i = 0; i < n; i++) {
			if (temp.child[s.charAt(i) - 'a'] == null)
				return 0;

			else {
				temp = temp.child[s.charAt(i) - 'a'];
			}
		}

		return temp.count;
	}

	public void constructTrie(TrieNode root, String s) {
		int i, n = s.length();
		TrieNode temp = root;
		for (i = 0; i < n; i++) {
			if (temp.child[s.charAt(i) - 'a'] == null) {
				TrieNode node = new TrieNode(1);
				temp.child[s.charAt(i) - 'a'] = node;
			} else {
				temp.child[s.charAt(i) - 'a'].count += 1;
			}
			temp = temp.child[s.charAt(i) - 'a'];
		}
	}

	public static void main(String[] args) {
		PrefixAndSuffix obj=new PrefixAndSuffix();
		obj.solve(new String[]{"ababa", "aabbvaab", "aecdsaaec", "abaaxbqaba"},
				new String[]{"aba", "aec", "abb", "aab"});
	}

	static class TrieNode {
		int count;
		TrieNode child[] = new TrieNode[26];

		TrieNode(int cnt) {
			count = cnt;
			for (int i = 0; i < 26; i++)
				child[i] = null;
		}
	}
}
