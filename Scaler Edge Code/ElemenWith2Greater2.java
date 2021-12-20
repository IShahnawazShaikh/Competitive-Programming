import java.util.ArrayList;
public class ElemenWith2Greater2 {
	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		int i, n = A.size();
		int FirstLargest = Integer.MIN_VALUE, SecondLargest = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {
			if (A.get(i) > FirstLargest) {
				SecondLargest = FirstLargest;
				FirstLargest = A.get(i);
			} else if (A.get(i) > SecondLargest)
				SecondLargest = A.get(i);
		}

		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (i = 0; i < n; i++)
			if (A.get(i) != SecondLargest && A.get(i) != FirstLargest)
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
