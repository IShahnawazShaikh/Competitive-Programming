
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class VerticalOrderTraversal {
	public List<List<Integer>> verticalTraversal(TreeNode A) {
		List<List<Integer>> Ans = new ArrayList<>();
		Map<Integer, List<Pair>> mp = new TreeMap<>();
		Queue<Pair> queue = new LinkedList<>();

		queue.add(new Pair(A, 0, 0));
		while (!queue.isEmpty()) {
			Pair P = queue.poll();
			TreeNode root = P.node;
			int line = P.line;
			int row = P.row;

			if (mp.containsKey(line)) {
				List<Pair> list = mp.get(line);
				list.add(P);
			} else {
				List<Pair> list = new ArrayList<>();
				list.add(P);
				mp.put(line, list);
			}
			if (root.left != null)
				queue.add(new Pair(root.left, line - 1, row + 1));
			if (root.right != null)
				queue.add(new Pair(root.right, line + 1, row + 1));

		}

		for (List<Pair> list : mp.values()) {
			Collections.sort(list, new MyComparator());
		}
		for (List<Pair> list : mp.values()) {

			List<Integer> l = new ArrayList<>();
			for (Pair p : list)
				l.add(p.node.val);
			Ans.add(l);
		}
		System.out.println(Ans);
		return Ans;
	}
}

class MyComparator implements Comparator<Pair> {
	public int compare(Pair p1, Pair p2) {
		if (p1.row == p2.row) {
			return p1.node.val - p2.node.val;
		}
		return 0;
	}
}

class Pair {
	TreeNode node;
	int line;
	int row;

	Pair(TreeNode node, int line, int row) {
		this.node = node;
		this.line = line;
		this.row = row;
	}
}