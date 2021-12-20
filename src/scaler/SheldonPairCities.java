package scaler;


/*
 * It will cause TLE Tc: O(C*ELogV))
 * 
 * We will use floyd-warshall Algorithm (DP)
 * 
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class SheldonPairCities {
	public int[] solve(int A, int B, int C, int[] D, int[] E, int[] F, int[] G, int[] H) {
		int i;

		ArrayList<Pair>[] adj = new ArrayList[A + 1];
		for (i = 1; i <= A; i++)
			adj[i] = new ArrayList<Pair>();
		for (i = 0; i < B; i++) {
			int src = D[i];
			int des = E[i];
			int w = F[i];
			adj[src].add(new Pair(des, w));
			adj[des].add(new Pair(src, w));
		}
		int[] ans = new int[C];
		for (i = 0; i < C; i++) {

			int src = G[i];
			int des = H[i];

			int x = bfs(adj, src, des, A);
			ans[i] = x;

		}
		System.out.println(Arrays.toString(ans));
		return ans;
	}

	public int bfs(ArrayList<Pair>[] adj, int src, int des, int A) {

		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.w - b.w);
		boolean[] visited = new boolean[A + 1];
		int[] dis = new int[A + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[src] = 0;
		pq.add(new Pair(src, 0));

		while (!pq.isEmpty()) {

			Pair srcPair = pq.poll();
			
			if(srcPair.node==des) return dis[srcPair.node];
			
			visited[srcPair.node] = true;
			
			for (Pair desPair : adj[srcPair.node]) {
				System.out.println("src: "+srcPair.node+" destination: "+desPair.node);
				
				if (visited[desPair.node] == true)
					continue;

				if (dis[desPair.node] > 1l * desPair.w + 1l * srcPair.w) {
					dis[desPair.node] = desPair.w + srcPair.w;
		            
					//System.out.println("src: "+srcPair.node+" destination: "+desPair.node+" "+dis[desPair.node]);
					pq.add(new Pair(desPair.node, dis[desPair.node]));
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		SheldonPairCities obj = new SheldonPairCities();
		int A = 4, B = 6, C = 2;
		int[] D = { 1, 2, 3, 2, 4, 3 };
		int[] E = { 2, 3, 4, 4, 1, 1 };
		int[] F = { 4, 1, 1, 1, 1, 1 };
		int[] G = { 1, 1 };
		int[] H = { 2, 3 };
		obj.solve(A, B, C, D, E, F, G, H);

	}

	class Pair {
		int node, w;

		Pair(int node, int w) {
			this.node = node;
			this.w = w;
		}
	}
}
