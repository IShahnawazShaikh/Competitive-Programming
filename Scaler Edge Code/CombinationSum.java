import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {

	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		Collections.sort(A);
		getCombinations(A, 0, new ArrayList<Integer>(), B, result);

		for (ArrayList<Integer> list : result)
			System.out.println(list);

		return result;
	}

	private void getCombinations(ArrayList<Integer> list, int st, ArrayList<Integer> curr, int k,
			ArrayList<ArrayList<Integer>> result) {

		if (k == 0) {
			result.add(new ArrayList<Integer>(curr));
			return;
		}

		for (int i = st; i < list.size(); i++) {
			if (k - list.get(i) >= 0) {
				curr.add(list.get(i));
				getCombinations(list, i, curr,(k - list.get(i)), result);
				curr.remove(curr.size() - 1);
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(10);
		list.add(6);
		list.add(11);
		list.add(1);
		list.add(16);
		list.add(8);

		new CombinationSum().combinationSum(list, 28);

	}

}
