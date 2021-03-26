import java.util.Stack;

public class SumOfSubarrayMinimums {
	public static int sumSubarrayMins(int[] arr) {
	  int i,n=arr.length;
	  int[] prevS=previousSmaller(arr);
	  int[] nextS=nextSmaller(arr);
	  
	  
	  for(i=0;i<n;i++){
		System.out.print(prevS[i]+" ");  
	  }
	  System.out.println();
	  for(i=0;i<n;i++){
		 System.out.print(nextS[i]+" "); 
	  }
	  
      long ans=0;
      int MOD=1000000007;
      System.out.println();
      for(i=0;i<n;i++){
    	int p=prevS[i];
  		int q=nextS[i];
  		ans+=(1L*arr[i]*(i-p)*(q-i))%MOD;
  		
  		System.out.println(1L*arr[i]*(i-p)*(q-i));
      }
      System.out.println();
     System.out.println(ans);
     return (int)(ans%MOD);
	}

	private static int[] nextSmaller(int[] A) {
		int i, n = A.length;
		int ans[] = new int[n];
		Stack<Integer> stack = new Stack<Integer>();
		for (i = 0; i < n; i++) {
			if (stack.empty())
				stack.push(i);
			else {
				while (!stack.empty() && A[i] <= A[stack.peek()]) {
					ans[stack.pop()] = i;
				}
				stack.push(i);
			}
		}
		while (!stack.empty()) {
			ans[stack.pop()] = n;
		}
		// for(i=0;i<n;i++) System.out.print(ans[i]+" ");
		return ans;
	}

	private static int[] previousSmaller(int[] A) {
		int i, n = A.length;
		int ans[] = new int[n];
		Stack<Integer> stack = new Stack<Integer>();
		for (i = n - 1; i >= 0; i--) {
			if (stack.empty())
				stack.push(i);
			else {
				while (!stack.empty() && A[i] < A[stack.peek()]) {
					ans[stack.pop()] = i;
				}
				stack.push(i);
			}
		}
		while (!stack.empty()) {
			ans[stack.pop()] = -1;
		}
		// for(i=0;i<n;i++) System.out.print(ans[i]+" ");
		return ans;
	}

	public static void main(String[] args) {
		sumSubarrayMins(new int[]{11,81,94,43,3});

	}

}
