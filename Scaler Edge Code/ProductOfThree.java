import java.util.ArrayList;

public class ProductOfThree {
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		int i, n = A.size();

		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> heap = new ArrayList<Integer>();

		insert(heap, A.get(0));
		insert(heap, A.get(1));
		insert(heap, A.get(2));

		ans.add(-1);
		ans.add(-1);
		int prod = A.get(0) * A.get(1) * A.get(2);
		ans.add(prod);
		for (i = 3; i < n; i++) {
			if (A.get(i) > heap.get(0)) {
				int min = extractMin(heap);
				prod /= min;
				prod *= A.get(i);
				ans.add(prod);
				insert(heap, A.get(i));
			} else
				ans.add(prod);
		}
	    System.out.println(ans);	
		return ans;
	}

	public void insert(ArrayList<Integer> heap, int x) {
		heap.add(x);
		int i = heap.size() - 1;

		if (i > 0 && heap.get((i - 1) / 2) > heap.get(i))
			swap(heap, (i - 1) / 2, i);
	}

	public int extractMin(ArrayList<Integer> list) {
		int mn = list.get(0);
		swap(list, 0, 2);
		list.remove(2);
		minHeapify(list, 0);
		return mn;
	}

	public void minHeapify(ArrayList<Integer> list, int curr) {

		int mn = curr;

		int left = 2 * curr + 1;
		if (left < list.size() && list.get(left) < list.get(mn))
			mn = left;

		if (mn != curr)
			swap(list, mn, curr);
	}

	public void swap(ArrayList<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public static void main(String[] args) {
		ProductOfThree obj=new ProductOfThree();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
		obj.solve(list);
	}
}
