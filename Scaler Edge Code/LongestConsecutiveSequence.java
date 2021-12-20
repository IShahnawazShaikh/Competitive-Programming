import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
	public static int longestConsecutive(final int[] A) {
		Set<Integer> set = new TreeSet<Integer>();
		int i, n = A.length;
		for (i = 0; i < n; i++)
			set.add(A[i]);
		ArrayList<Integer> al = new ArrayList<>(set);
		int cnt = 1, ans = 1;
		for (i = 0; i < al.size() - 1; i++) {
			if (al.get(i + 1) - al.get(i) == 1)
				cnt += 1;
			else {
				ans = Math.max(ans, cnt);
				cnt = 1;
			}
		}
		return Math.max(ans, cnt);
	}

	public static void main(String[] args) {
		longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});

	}

}
