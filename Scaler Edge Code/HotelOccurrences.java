import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HotelOccurrences {
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		Set<Integer> set = new HashSet();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i, n = A.size();
		for (i = n - 1; i >= 0; i--) {
			if (!set.contains(A.get(i))) {
				ans.add(A.get(i));
				set.add(A.get(i));
			}

		}
		Collections.reverse(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
