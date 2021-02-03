
public class SearchForRangeII {
	public static int[] searchRange(final int[] A, int B) {
	  int n=A.length-1; 
	  int lower=lowerBound(A,0,n,B);	
	  if(lower==-1) return new int[]{-1,-1}; 
	  int upper=upperBound(A,0,n,B);
	  
	  System.out.println(lower+" "+upper);
	  
	  return new int[]{lower,upper};	
		
	}

	private static int lowerBound(int[] A, int lower, int upper, int B) {
		int mid=0;
		while (lower <= upper) {
			mid = (lower + upper) / 2;
			if ((mid==0 || B>A[mid-1]) && A[mid] == B) return mid;
			else if (B > A[mid]) lower = mid + 1;
			else upper = mid - 1;
		}
      return -1;
	}
	private static int upperBound(int[] A, int lower, int upper, int B) {
		int mid=0;
		while (lower <= upper) {
			mid = (lower + upper) / 2;
			if ((mid==A.length-1 || B < A[mid+1]) && A[mid] == B) return mid;
			else if (B < A[mid]) upper=mid-1;
			else lower = mid + 1;
		}
      return -1;
	}


	public static void main(String[] args) {
	 searchRange(new int[]{ 1, 1,6,7, 7, 7,10},20);
	

	}

}
