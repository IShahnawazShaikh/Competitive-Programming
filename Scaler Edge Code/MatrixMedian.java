public class MatrixMedian {
  public static double findMedianSortedArrays(int[][] a) {
   int i, n = a.length;
   int m=a[0].length;
   int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
   for(i=0;i<n;i++){
	 low=Math.min(low,a[i][0]);
	 high=Math.max(high,a[i][m-1]);
	}	
   int k = ((n * m) / 2);

   int ans=getAns(low, high, a,k,n);
   System.out.println(ans);
   return ans;	
  }
	public static int getAns(int low, int high, int[][] a,int k,int n) {
		int mid = 0,i=0,p=0,q=0;
		while (low <= high) {
			p=0;q=0;
			mid = (high - low) / 2 + low;
			
			for(i=0;i<n;i++)  p+=countLess(a[i],mid);	
		    
			for(i=0;i<n;i++) q+=countEqual(a[i],mid);
			
			if (p > k)
				high = mid - 1;
			else {
				if (p + q <= k)
					low = mid + 1;
				else
			  return mid;
			}
		}
		return mid;
	}
	public static int countLess(int[] a, int x) {
		int low = 0, high = a.length-1;
		int mid = 0;
		int index = -1;
		while (low <= high) {
			mid = (high - low) / 2 + low;
			if (a[mid] >= x) {
				high = mid - 1;
			} else {
				index = mid;
				low = mid + 1;
			}
		}
	return index + 1;
	}
	private static int countEqual(int[] a, int x) {
		int low = 0, high = a.length-1;
		int mid = 0;
		int index = -1;
		while (low <= high) {
			mid = (high - low) / 2 + low;
			if (a[mid]>= x) {
				index = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		int index2 = -1;
		low = 0;
		high = a.length- 1;
		while (low <= high) {
			mid = (high - low) / 2 + low;
			if (a[mid] <= x) {
				index2 = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (index == -1)
			return 0;
		else
			return index2 - index + 1;
	}
	public static void main(String[] args) {
	    int a[][]={
	    		{1, 3, 5},
	    		{2, 6, 9},
	    		{3, 6, 9}
	           };
		findMedianSortedArrays(a);
	}

}
