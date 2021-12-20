public class NthRootOfNumberUsingBS {
	public static long nthRoot(long A, long x) {
		if (A == 1)
			return 1;
		long ans = 0;
		long low = 1, high = A / x;
		long mid = 0;
		while (low <= high) {
			mid = (high - low) / 2 + low;
			if (getMidMultiple(mid,x) <= A) {
				ans = mid;
				low = mid + 1;
			} else
				high = mid - 1;

			
		}
		System.out.println(ans);
		return ans;
	}

	public static long getMidMultiple(long mid, long x) {
		int i;
		long fact=mid;
		for (i = 1; i < x; i++) mid *= fact;
		 //System.out.println("mid x time: "+mid);
		return mid;
	}

	public static void main(String[] args) {
		nthRoot(128, 4);
	}

}
