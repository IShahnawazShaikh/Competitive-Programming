import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AutoComplete {
	public static void main(String[] args) {
		System.out.println("insert");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int i;
			int n = sc.nextInt();
			int m = sc.nextInt();
			String word[] = new String[n];
			int[] weight = new int[n];
			for (i = 0; i < n; i++)
				word[i] = sc.next();
			for (i = 0; i < n; i++)
				weight[i] = sc.nextInt();

			String prefix[] = new String[m];
			for (i = 0; i < m; i++)
				prefix[i] = sc.next();

			// main code

			Map<Integer, String> mp = new TreeMap();
			
			
			for (i = 0; i < n; i++)
				mp.put(weight[i], word[i]);
			i = n;
			for (String s : mp.values()) {
				word[--i] = s;
			}
			//System.out.println(mp);
			//System.out.println();
			
			TrieNode root = new TrieNode(-1);
			for (i = 0; i < n; i++) {
				constructTrie(root, word[i], i);
			}
			for (i = 0; i < m; i++) {
				findPrefix(root, prefix[i], word);
			}

		}
	}

	public static void findPrefix(TrieNode root, String s, String[] word) {
		int i, n = s.length();
		TrieNode temp = root;
		for (i = 0; i < n; i++) {
			if (temp.child[s.charAt(i) - 'a'] == null) {
				temp = temp.child[s.charAt(i) - 'a'];
				break;
			}
			temp = temp.child[s.charAt(i) - 'a'];
		}
		if (temp != null) {
			ArrayList<Integer> list = temp.list;
			//System.out.println(list);
			i=0;
			while(i<list.size() && i<5){
			  System.out.print(word[list.get(i)] + " ");
			  i++;
			}
		
		} else
			System.out.print(-1+" ");

		System.out.println();

	}

	public static void constructTrie(TrieNode root, String s, int index) {
		int i, n = s.length();
		TrieNode temp = root;
		for (i = 0; i < n; i++) {
			if (temp.child[s.charAt(i) - 'a'] == null) {
				temp.child[s.charAt(i) - 'a'] = new TrieNode(index);
			}
			else temp.child[s.charAt(i) - 'a'].list.add(index);
			temp = temp.child[s.charAt(i) - 'a'];
			
		}
	}

	static class TrieNode {
		ArrayList<Integer> list = new ArrayList<>();
		TrieNode child[] = new TrieNode[26];

		TrieNode(int index) {
			list.add(index);
		}
	}
}