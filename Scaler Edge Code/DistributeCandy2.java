
public class DistributeCandy2 {
	//TC: O(N) SC=O(2*N)
	public static int candy(int[] A) {
		int i, n = A.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int ans = 0;
		left[0] = 1;
		right[n - 1] = 1;
		for (i = 1; i < n; i++) {
			if (A[i] > A[i - 1])
				left[i] = left[i - 1] + 1;
			else
				left[i] = 1;
		}
		for (i = n - 2; i >= 0; i--) {
			if (A[i] > A[i + 1])
				right[i] = right[i + 1] + 1;
			else
				right[i] = 1;
		}

		for (i = 0; i < n; i++)
			ans += Math.max(left[i], right[i]);
		return ans;
	}
	
	//space optimization SC=O(N)
	public static int candy2(int[] A) {
		int i, n = A.length;
		int left[] = new int[n];
		
		left[0] = 1;
		for (i = 1; i < n; i++) {
			if (A[i] > A[i - 1])
				left[i] = left[i - 1] + 1;
			else
				left[i] = 1;
		}
		int right=1;
		int ans=Math.max(left[n-1],1);
		for (i = n - 2; i >=0; i--) {
       	  if(A[i]>A[i+1]) {
       		right= 1+ right;
       	
       	  }
       	  else right=1;
       	  ans+=Math.max(left[i],right);
		}
		return ans;
	}	
	
	public static void main(String[] args) {
	 candy2(new int[]{1,5,2,1});
	}

}
