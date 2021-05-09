import java.util.ArrayList;
import java.util.PriorityQueue;

public class ProductOfThree2 {
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int i, n = A.size();
		int prod = A.get(0) * A.get(1) * A.get(2);
		queue.add(A.get(0));
		queue.add(A.get(1));
		queue.add(A.get(2));
		ans.add(-1);
		ans.add(-1);
		ans.add(prod);

		for (i = 3; i < n; i++) {
			if (A.get(i) > queue.peek()) {
				int mn = queue.poll();
				prod /= mn;
				prod *= A.get(i);
				queue.add(A.get(i));
				ans.add(prod);
			} else
				ans.add(prod);
		}
		return ans;
	}
	public static void main(String[] args) {
		ProductOfThree2 obj = new ProductOfThree2();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		obj.solve(list);

	}

}
