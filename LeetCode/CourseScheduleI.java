package leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class CourseScheduleI {
	public boolean canFinish(int numCourses, int[][] prerequisites) {

		ArrayList<Integer>[] adj = new ArrayList[numCourses];
		for (int i = 0; i < numCourses; i++)
			adj[i] = new ArrayList<Integer>();
		int[] ID = new int[numCourses];
		for (int i = 0; i < prerequisites.length; i++) {
			int src = prerequisites[i][1];
			int des = prerequisites[i][0];
			ID[des]++;
			adj[src].add(des);
		}

		boolean[] visited = new boolean[numCourses];

		int nodeCnt = bfs(adj, ID, visited);
		return nodeCnt == numCourses;

	}

	public int bfs(ArrayList<Integer>[] adj, int[] ID, boolean[] visited) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int nodeCnt = 0;
		for (int i = 0; i < ID.length; i++) {
			if (ID[i] == 0)
				pq.add(i);
		}
		while (!pq.isEmpty()) {
			int src = pq.poll();
			nodeCnt += 1;
			visited[src] = true;

			for (int des : adj[src]) {

				if (visited[des] == false) {
					ID[des]--;
					if (ID[des] == 0)
						pq.add(des);
				}

			}

		}

		return nodeCnt;
	}

	public static void main(String[] args) {
		new CourseScheduleI().canFinish(2, new int[][] { { 1, 0 }, { 0, 1 } });
	}

}
