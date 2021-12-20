package scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijsktra {
	public static int[] solve(int A, int[][] B, int src) {

		int[] dis = new int[A];
		Arrays.fill(dis, Integer.MAX_VALUE);

		ArrayList<Pair> adj[] = new ArrayList[A];
		for (int i = 0; i < A; i++)
			adj[i] = new ArrayList<Pair>();

		for (int i = 0; i < B.length; i++) {

			adj[B[i][0]].add(new Pair(B[i][1], B[i][2]));

			adj[B[i][1]].add(new Pair(B[i][0], B[i][2]));

		}
		boolean[] visited = new boolean[A];

		bfs(src, adj, visited, dis);
		dis[src] = 0;
		for (int i = 0; i < A; i++)
			if (dis[i] == Integer.MAX_VALUE)
				dis[i] = -1;

		return dis;
	}

	private static void bfs(int src, ArrayList<Pair>[] adj, boolean[] visited, int[] dis) {

		PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.w - p2.w);

		pq.add(new Pair(src, 0));

		while (!pq.isEmpty()) {
			Pair p = pq.poll();
			visited[p.des] = true;

			for (Pair pp : adj[p.des]) {
				if (visited[pp.des] == true)
					continue;

				if (dis[pp.des] > pp.w + p.w) {
					dis[pp.des] = pp.w + p.w;
					pq.add(new Pair(pp.des, dis[pp.des]));
				}
			}
		}

	}

	static class Pair {
		int des, w;

		Pair(int des, int w) {
			this.des = des;
			this.w = w;
		}
	}

	public static void main(String... x) {

		// int[][] B = { { 0, 3, 4 }, { 2, 3, 3 }, { 0, 1, 9 }, { 3, 4, 10 }, { 1, 3, 8
		// } };
		int[][] B = { { 0, 4, 9 }, { 3, 4, 6 }, { 1, 2, 1 }, { 2, 5, 1 }, { 2, 4, 5 }, { 0, 3, 7 }, { 0, 1, 1 },
				{ 4, 5, 7 }, { 0, 5, 1 } };
		solve(6, B, 4);

	}
}
