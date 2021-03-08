import java.util.Set;
import java.util.TreeSet;

public class CountSubarrays {
  public static int solve(int[] A) {
    int j, i = 0, n = A.length;
	long ans = 0;
	int MOD = 1000000007;
	Set<Integer> set = new TreeSet<Integer>();
	set.add(A[i]);
	for (j = 1; j < n; j++) {
	 if (set.contains(A[j])) {
	  ans += j - i;
	  set.remove(A[i]);
	  i++;
	  }
	 else {
	  set.add(A[j]);
	  }
	 }
	ans += (1L * (j - i) * ((j - i) + 1)) / 2;
	ans %= MOD;
	System.out.println(ans);
	return 0;
	}

	public static void main(String[] args) {
		solve(new int[] { 93, 9, 12, 32, 97, 75, 32, 77, 40, 79, 61, 42, 57, 19, 64, 16, 86, 47, 41, 67, 76, 63, 24, 10,
				25, 96, 1, 30, 73, 91, 70, 65, 53, 75, 5, 19, 65, 6, 96, 33, 73, 55, 4, 90, 72, 83, 54, 78, 67, 56, 8,
				70, 43, 63 });
	}

}
