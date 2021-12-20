package scaler;

import java.util.PriorityQueue;

public class MatrixAbsoluteDifference {
	public int solve(int A, int B, int[][] c) {
		int n = c.length, m = c[0].length;

		boolean[][] visited = new boolean[n][m];
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dis - b.dis);
		pq.add(new Pair(0,0,0,c[0][0]));
		int ans=0;
		while(!pq.isEmpty()) {
			
			Pair srcPair=pq.poll();
			
			if(visited[srcPair.x][srcPair.y]) continue;
			
			visited[srcPair.x][srcPair.y]=true;
			ans=Math.max(ans, srcPair.dis);
			int x=srcPair.x;
			int y=srcPair.y;
			if(x+1<n && visited[x+1][y]==false) pq.add(new Pair(x+1,y,Math.abs(srcPair.node-c[x+1][y]),c[x+1][y]));
			
			if(x-1>=0 && visited[x-1][y]==false) pq.add(new Pair(x-1,y,Math.abs(srcPair.node-c[x-1][y]),c[x-1][y]));
			if(y+1<m && visited[x][y+1]==false) pq.add(new Pair(x,y+1,Math.abs(srcPair.node-c[x][y+1]),c[x][y+1]));
			if(y-1>=0 && visited[x][y-1]==false) pq.add(new Pair(x,y-1,Math.abs(srcPair.node-c[x][y-1]),c[x][y-1]));
			
		}
		System.out.println(ans);

		return ans;
	}


	class Pair {
		int x, y, dis, node;

		Pair(int x, int y, int dis, int node) {
			this.x = x;
			this.y = y;
			this.dis = dis;
			this.node = node;
		}
	}

	public static void main(String[] args) {
		int A = 3, B = 3;
		int[][] C = { { 1, 5, 6 }, { 10, 7, 2 }, { 3, 6, 9 } };

		new MatrixAbsoluteDifference().solve(A, B, C);

	}

}
