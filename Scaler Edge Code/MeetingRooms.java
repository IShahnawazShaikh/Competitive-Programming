import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms {
	public static int solve(int[][] A) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		int i, n = A.length;
		Pair[] PairArray = new Pair[n];
		for (i = 0; i < n; i++) {
			int start = A[i][0];
			int end = A[i][1];
			PairArray[i] = new Pair(start, end);
		}
        
		Arrays.sort(PairArray, new MyComparator());
		
        pq.add(PairArray[0].end);
        for(i=1;i<n;i++){
          if(PairArray[i].start>=pq.peek()){
        	pq.poll();
          }
      	 pq.add(PairArray[i].end);
        }
		System.out.println(pq.size());
		return pq.size();
	}

	static class MyComparator implements Comparator<Pair> {
		public int compare(Pair p1, Pair p2) {
			return p1.start - p2.start;
		}
	}

	static class Pair {
		int start, end;

		Pair(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static void main(String[] args) {
	 solve(new int[][]{ {0, 30},
	                     {5, 10},
	                    {15, 20}
	                  });
	}

}
