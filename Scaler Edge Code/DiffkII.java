import java.util.HashSet;
import java.util.Set;

public class DiffkII {
	public static int diffPossible(final int[] A, int B) {
		int i, n = A.length;
		Set<Integer> set = new HashSet<>();
		for (i = 0; i < n; i++) {
			if (set.contains(A[i] - B) || set.contains(A[i] + B))
				return 1;

			set.add(A[i]);

		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(diffPossible(new int[] { 77, 28, 19, 21, 67, 15, 53, 25, 82, 52, 8, 94, 50, 30, 37, 39, 9,
				43, 35, 48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0 }, 53));
	}

}
