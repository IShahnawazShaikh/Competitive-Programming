package scaler;

import java.util.ArrayList;

public class ConstructRoads {
	public static int solve(int A, int[][] B) {
		
		ArrayList<Integer>[] adj=new ArrayList[A+1];
		
		for(int i=1;i<=A;i++) adj[i]=new ArrayList<Integer>();
	
		
		for(int i=0;i<B.length;i++) {
		  adj[B[i][0]].add(B[i][1]);
		  adj[B[i][1]].add(B[i][0]);
		}
		int[] color=new int[A+1];
		
		boolean[] visited=new boolean[A+1];
		
		for(int i=1;i<=A;i++) {
			
			if(visited[i]==false) {
			  color[i]=0;	
			  dfs(adj,i,visited,color);	
			}
			
		}
		
		long one=0,zero=0;
		for(int i=1;i<=A;i++) {
		  if(color[i]==0) zero+=1;
		  else one+=1;
		}
		int MOD=1000000007;
		long ans=(one%MOD)*(zero%MOD)-(A-1);
		System.out.println(ans);
		return (int)(ans%MOD);
	}

	private static void dfs(ArrayList<Integer>[] adj, int src, boolean[] visited, int[] color) {
		
		visited[src]=true;
		for(int des: adj[src]) {
			if(visited[des]==false) {
			  color[des]=(color[src]^1);
			  dfs(adj,des,visited,color);
			}
		}
		
	}

	public static void main(String[] args) {
		int[][] B = { { 1, 2}, { 1, 3 }};
		
		solve(3,B);

	}

}
