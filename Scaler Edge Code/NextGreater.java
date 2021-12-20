import java.util.Stack;

public class NextGreater {
	public static int[] nextGreater(int[] A) {
		int i, n = A.length;
		Stack<Integer> stack = new Stack<Integer>();
		int ans[] = new int[n];
		for (i = 0; i < n; i++) {
			if (stack.empty())
				stack.push(i);
			else {
				if (A[i] <= A[stack.peek()])
					stack.push(i);
				else {
					while (!stack.empty() && A[i] > A[stack.peek()]) {
						ans[stack.peek()] = A[i];
						stack.pop();
					}
					stack.push(i);
				}
			}
		}
		while (!stack.empty()) {
			ans[stack.pop()] = -1;
		}
		return ans;
	}

	public static void main(String[] args) {
	  nextGreater(new int[]{4, 5, 2, 10});

	}

}
