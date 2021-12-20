import java.util.Stack;

public class OrderThem {
	public static int solve(int[] A) {
		int i, n = A.length;
		int B[] = new int[n];
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		for (i = 0; i < n - 1; i++) {
			if (A[i] <= A[i + 1]) {
				B[index] = A[i];
				if (index > 0 && B[index] < B[index - 1])
					return 0;
				index++;
			} else {
				if (stack.empty())
					stack.push(A[i]);
				else {
					int el = checkBack(stack, A[i]);
					if (el == -1)
						continue;
					else {
						B[index] = el;
						if (index > 0 && B[index] < B[index - 1])
							return 0;
						index++;
					}
				}

			}
		}
		B[index++] = A[n - 1];
		index = n - 1;
		while (!stack.empty())
			B[index--] = stack.pop();

		for (i = 0; i < n - 1; i++) {
			if (B[i] > B[i + 1]) {
				return 0;
			}
		}

		return 1;
	}

	private static int checkBack(Stack<Integer> stack, int x) {
		if (stack.size() == 1) {
			if (x <= stack.peek()) {
				int p = stack.pop();
				stack.push(x);
				stack.push(p);
				return -1;
			} else {
				int element = stack.pop();
				stack.push(x);
				return element;
			}
		}
		int q = stack.pop();
		int element = checkBack(stack, x);
		stack.push(q);
		return element;
	}

	public static void main(String[] args) {
		System.out.println(solve(new int[] { 5, 3, 1, 4, 2 }));
	}

}
