package scaler;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Batches {
	public int solve(int A, int[] B, int[][] C, int D) {

		ArrayList<Integer> adj[] = new ArrayList[A + 1];
        for(int i=1;i<=A;i++) adj[i]=new ArrayList<Integer>(); 
		for (int i = 0; i < C.length; i++) {
			adj[C[i][0]].add(C[i][1]);
			adj[C[i][1]].add(C[i][0]);
		}
		boolean[] visited=new boolean[A+1];
		int count=0;
		for(int i=1;i<=A;i++) {
		  
			if(visited[i]==false) {
				if(bfs(i,adj,visited,B)>=D) count+=1;
			}
			
		}
        System.out.println(count);
		return count;
	}

	private long bfs(int src, ArrayList<Integer>[] adj, boolean[] visited,int[] B) {
		// TODO Auto-generated method stub
		//System.out.println("src: "+src);
		Queue<Integer> pq=new ArrayDeque<>();
		pq.add(src);
		
		long strength=0;
		while(!pq.isEmpty()) {
			int srcNode=pq.poll();
			visited[srcNode]=true;
			strength+=B[srcNode-1];
			for(int desNode: adj[srcNode]) {
				if(visited[desNode]) continue;
				pq.add(desNode);
			}
		}
		return strength;
		//System.out.println(strength);
	
	}

	public static void main(String[] args) {
		int A = 7, D = 12;
		int[] B = { 1, 6, 7, 2, 9, 4, 5 };
		int[][] C = { { 1, 2 }, { 2, 3 }, { 5, 6 }, { 5, 7 } };

		Batches b = new Batches();
		b.solve(A, B, C, D);

	}

}
