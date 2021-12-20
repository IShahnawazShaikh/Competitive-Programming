import java.util.HashMap;
import java.util.Map;

public class SubArraywith0Sum {
	public static int solve(int[] A) {
		int i, n = A.length;
		Map<Long, Integer> set = new HashMap<>();
		set.put(0L, 1);
		long prefix = 0;
		for (i = 0; i < n; i++) {
			prefix += A[i];
			if (set.containsKey(prefix))
				return 1;

			else
				set.put(prefix, 1);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(solve(new int[] { 1, 2, -2, 4, -4 }));
	}

}
