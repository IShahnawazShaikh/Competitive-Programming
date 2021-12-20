package scaler;
//Minimum spanning Tree using Prims Algorithm
import java.util.ArrayList;
import java.util.PriorityQueue;

public class CommutableIslands {
	public static int solve(int A, int[][] B) {
		
		ArrayList<Pair>[] adj=new ArrayList[A+1];
		for(int i=1;i<=A;i++)  adj[i]=new ArrayList<Pair>();
	   
		for(int i=0;i<B.length;i++)  adj[B[i][0]].add(new Pair(B[i][1],B[i][2]));	
		
		
	    return bfs(adj,1,A);
		
	}

	private static int bfs(ArrayList<Pair>[] adj, int src,int A) {
		boolean[] visited=new boolean[A+1];
		int ans=0;
		PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
		pq.add(new Pair(src,0));
		while(!pq.isEmpty()) {
			
			Pair srcNode=pq.poll();
			if(visited[srcNode.node]) continue;
			
			visited[srcNode.node]=true;
			
			ans+=srcNode.weight;
			for(Pair desNode: adj[srcNode.node])  pq.add(desNode);
				
		}
		System.out.println(ans);
		return ans;
	}
	
	static class Pair{
		int node,weight;
		Pair(int node,int weight){
		   this.node=node;
		   this.weight=weight;
		}
	}

	public static void main(String[] args) {
		int A = 4;
		int[][] B = { { 1, 2, 1 }, { 2, 3, 2 }, { 3, 4, 4 }, { 1,4, 3 }};
		solve(A,B);

	}

}
