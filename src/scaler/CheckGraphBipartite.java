package scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckGraphBipartite {

	public static int solve(int A, int[][] B) {

		ArrayList<Integer>[] adj = new ArrayList[A];
		for (int i = 0; i < A; i++)
			adj[i] = new ArrayList<Integer>();

		for (int i = 0; i < B.length; i++) {
			int src = B[i][0];
			int des = B[i][1];

			adj[src].add(des);
			adj[des].add(src);
		}
		boolean[] visited = new boolean[A];
		int[] color = new int[A];
		Arrays.fill(color, -1);
		boolean st = false;
		for (int i = 0; i < A; i++) {

			if (visited[i] == false) {
				color[i] = 0;
				if (dfs(adj, i, visited, color)) {
					st = true;
					break;
				}
				;
			}

		}
         System.out.println(st);
		return st ? 0 : 1;

	}

	private static boolean dfs(ArrayList<Integer>[] adj, int src, boolean[] visited, int[] color) {

		visited[src] = true;

		for (int des : adj[src]) {

			if (visited[des] == false) {
				color[des] = (color[src] ^ 1);
				if (dfs(adj, des, visited, color))
					return true;
			} else {
				if (color[des] == color[src])
					return true; // not bipartite
			}

		}
		return false;

	}

	public static void main(String... x) {
		int[][] B = { { 0, 1 }, { 0, 2 },{1,3},{1,4},{5,6},{6,7},{7,5} };
		solve(8, B);

	}
}
