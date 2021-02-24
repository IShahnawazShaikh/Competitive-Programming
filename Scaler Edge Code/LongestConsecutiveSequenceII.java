import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequenceII {
	public static int longestConsecutive(final int[] A) {
		Set<Integer> set = new TreeSet<Integer>();
		int i, n = A.length;
		for (i = 0; i < n; i++)
			set.add(A[i]);
		int cnt = 1, ans = 1;
		for (i = 0; i < n; i++) {
		  if(!set.contains(A[i]-1)){
			cnt=1;
			while(set.contains(A[i]+cnt)) cnt+=1;
			ans=Math.max(ans,cnt);
		  }
		}
		System.out.println(ans);
		return Math.max(ans, cnt);
	}
	public static void main(String[] args) {
		longestConsecutive(new int[]{2,1,0,5,4,2,4});

	}

}
