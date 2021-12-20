//More Optimized in SC and TC in ElemenWith2Greater-02
import java.util.ArrayList;
import java.util.Arrays;
public class ElemenWith2Greater {
	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		int i, n = A.size();
		int[] temp = new int[n];
		for (i = 0; i < n; i++) temp[i] = A.get(i);
		Arrays.sort(temp);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (i = 0; i < n; i++)
			if (A.get(i) != temp[n - 1] && A.get(i) != temp[n - 2])
				ans.add(A.get(i));
		System.out.println(ans);
		return ans;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(17);
		list.add(100);
		list.add(5);

		solve(list);

	}

}
