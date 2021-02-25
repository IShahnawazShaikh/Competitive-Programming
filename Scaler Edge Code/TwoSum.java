import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(final int[] A, int B) {
		int i, n = A.length;
		int p1 = -1, p2 = -1;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (i = 0; i < n; i++) {

			if (mp.containsKey(B - A[i])) {
				p1 = mp.get(B - A[i]);
				p2 = i;
				break;
			} else if (!mp.containsKey(A[i]))
				mp.put(A[i], i);

		}
		if (p1 == -1)
			return new int[] {};
		else
			return new int[] { p1 + 1, p2 + 1 };
	}

	public static void main(String[] args) {
		twoSum(new int[] { 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7,
				9, -4, 4, -8 }, -3);
	}

}
