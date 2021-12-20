package scaler;

import java.util.Arrays;

public class SheldonPairCitiesFloyd {
	public int[] solve(int A, int B, int C, int[] D, int[] E, int[] F, int[] G, int[] H) {

		int[][] dis = new int[A + 1][A + 1];
		for(int[] arr: dis) Arrays.fill(arr, Integer.MAX_VALUE);
		
		for(int i=0;i<B;i++) {
		  int src=D[i];
		  int des=E[i];
		  int w=F[i];
		  dis[src][des]=w;
		  dis[des][src]=w;
		}
		
		for(int[] arr: dis) System.out.println(Arrays.toString(arr));
		
		for (int k = 1; k <= A; k++) {

			for (int u = 1; u <= A; u++) {

				for (int v = 1; v <= A; v++) {

					if (dis[u][v] > 1L * dis[u][k] + dis[k][v])
						dis[u][v] = dis[u][k] + dis[k][v];
				}
			}
		}

		int[] ans = new int[C];
		for (int i = 0; i < C; i++) {

			int src = G[i];
			int des = H[i];

			if (dis[src][des] == Integer.MAX_VALUE)
				ans[i] = -1;
			else
				ans[i] = dis[src][des];

		}
		return ans;

	}

	public static void main(String[] args) {
		SheldonPairCitiesFloyd obj2 = new SheldonPairCitiesFloyd();
		int A = 4, B = 6, C = 2;
		int[] D = { 1, 2, 3, 2, 4, 3 };
		int[] E = { 2, 3, 4, 4, 1, 1 };
		int[] F = { 4, 1, 1, 1, 1, 1 };
		int[] G = { 1, 1 };
		int[] H = { 2, 3 };
		obj2.solve(A, B, C, D, E, F, G, H);

	}

	class Pair {
		int node, w;

		Pair(int node, int w) {
			this.node = node;
			this.w = w;
		}
	}
}
