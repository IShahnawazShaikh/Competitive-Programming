import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
	public static int solve(int[] A, int[] B) {
		int i, n = A.length;
		Pair[] PairArray = new Pair[n];
		for (i = 0; i < n; i++)
			PairArray[i] = new Pair(A[i], B[i]);
		Arrays.sort(PairArray,new MyComparator());
		//for(i=0;i<n;i++) System.out.println(PairArray[i].start+" "+PairArray[i].end);
		
		int ans = 1;
		Pair prev = PairArray[0];
		for (i = 1; i < n; i++) {
			if (prev.end <= PairArray[i].start) {
				ans += 1;
				prev = PairArray[i];
			}
		}
		System.out.println(ans);
		return ans;
	}
	static class Pair{
		int start, end;

		Pair(int s, int e) {
			start = s;
			end = e;
		}
	}
	static class MyComparator implements Comparator<Pair>{
		public int compare(Pair p1,Pair p2){
		  return p1.end-p2.end;	
		}
	}
	public static void main(String[] args) {
		//solve(new int[] { 17, 8, 10 }, new int[] { 18, 10, 18 });

		solve(new int[]{2, 30, 4, 13, 1, 6, 3, 13 },new int[]{40, 49, 11, 30, 37, 23, 30, 37 });

	}
}
