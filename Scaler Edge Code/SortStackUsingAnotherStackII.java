import java.util.Stack;
public class SortStackUsingAnotherStackII {
    public static int[] solve(int[] A) {
		int i, n = A.length;
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		for (i = 0; i < n; i++)
			stack1.push(A[i]);

		while (!stack1.empty()) {
			if (stack2.empty()) {
				stack2.push(stack1.pop());
				continue;
			}
			int element = stack1.pop();
			if (element >= stack2.peek()) {
				stack2.push(element);
				continue;
			}

			while (!stack2.empty() && element < stack2.peek()) {
				stack1.push(stack2.pop());
			}
			stack2.push(element);
		}
		// System.out.println(stack1);
		// System.out.println(stack2);
		int index = n - 1;
		while (!stack1.empty() && !stack2.empty()) {
			if (stack1.peek() <= stack2.peek()) {
				A[index--] = stack1.pop();
			} else {
				A[index--] = stack2.pop();
			}

		}

		while (!stack1.empty())
			A[index--] = stack1.pop();

		while (!stack2.empty())
			A[index--] = stack2.pop();

		for (i = 0; i < n; i++)
			System.out.print(A[i] + " ");

		return A;
        
     }
	public static void main(String[] args) {
	 solve(new int[]{66, 96, 43, 28, 14, 1, 41, 76, 70, 81, 22, 11, 42, 78, 4, 88, 70, 43, 90, 6, 12});	

	} 
}
//66, 96, 43, 28, 14, 1, 41, 76, 70, 81, 22, 11, 42, 78, 4, 88, 70, 43, 90, 6, 12
