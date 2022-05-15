package scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EdgeInMST {

	int[] parent = null;
	int[] height = null;

	public int[] solve(int A, int[][] B) {

		ArrayList<Pair> list = new ArrayList<>();
		int i = 0, j = 0, m = B.length;
		for (i = 0; i < m; i++)
			list.add(new Pair(B[i][0], B[i][1], B[i][2], i));

		parent = new int[A + 1];
		height = new int[A + 1];

		for (i = 1; i <= A; i++)
			parent[i] = i;

		Collections.sort(list, new MyComparator());

		int[] ans = new int[B.length];

		i = 0;
		while (i < B.length) {

			i = j;

			while (j < m && list.get(j).w == list.get(i).w) {

				if (find(list.get(j).u) != find(list.get(j).v)) {
					ans[list.get(j).idx] = 1;
				}
				j += 1;
			}

			j = i;
			while (j < m && list.get(j).w == list.get(i).w) {

				if (find(list.get(j).u) != find(list.get(j).v)) {
					union(list.get(j).u, list.get(j).v);
				}
				j += 1;
			}
			i = j;

		}

		System.out.println(Arrays.toString(ans));
		return ans;
	}

	public int find(int x) {

		if (x == parent[x])
			return x;

		parent[x] = find(parent[x]);

		return parent[x];
	}

	public void union(int x, int y) {

		int u = find(x);
		int v = find(y);

		if (height[u] < height[v]) {

			parent[u] = v;
		} else if (height[v] < height[u]) {
			parent[v] = u;
		} else {
			parent[v] = u;
			height[u]++;
		}
	}

	class Pair {

		int u, v, w, idx;

		Pair(int u, int v, int w, int idx) {
			this.u = u;
			this.v = v;
			this.w = w;
			this.idx = idx;
		}

	}

	class MyComparator implements Comparator<Pair> {

		@Override
		public int compare(Pair p1, Pair p2) {

			return p1.w - p2.w;
		}

	}

	public static void main(String[] args) {
		EdgeInMST obj = new EdgeInMST();
		// int[][] B = { { 1, 2, 42 }};
		int[][] B = { { 1, 2, 468 }, { 2, 3, 335 }, { 3, 1, 501 }, { 2, 4, 170 }, { 2, 5, 725 }, { 2, 7, 479 },
				{ 4, 6, 359 }, { 5, 6, 963 } };
		obj.solve(7, B);

	}

}
