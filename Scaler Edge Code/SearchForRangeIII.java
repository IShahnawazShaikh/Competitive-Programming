
public class SearchForRangeIII {
	public static int[] searchRange(final int[] A, int B) {
	  int n=A.length-1; 
	  int lower=lowerBound(A,0,n,B);	  
	  int upper=upperBound(A,0,n,B);
	  
	  System.out.println(lower+" "+upper);
	  if(lower!=-1) System.out.println("frequenct: "+(upper-lower+1));
	  else System.out.println("frequence: 0");
	  return new int[]{lower,upper};	
		
	}

	private static int lowerBound(int[] A, int lower, int upper, int B) {
		int idx=-1,mid=0;
		while (lower <= upper) {
			mid = (lower + upper) / 2;
			if (B > A[mid]) lower = mid + 1;
			else if(B<A[mid]) upper=mid-1;
			else{
			  idx=mid;
			  upper=mid-1;
			}
		}
      return idx;
	}
	private static int upperBound(int[] A, int lower, int upper, int B) {
		int idx=-1,mid=0;
		while (lower <= upper) {
			mid = (lower + upper) / 2;
			if (B > A[mid]) lower = mid + 1;
			else if(B<A[mid]) upper=mid-1;
			else{
			  idx=mid;
			  lower=mid+1;
			}
		}
      return idx;
	}
	public static void main(String[] args) {
	 searchRange(new int[]{1,1,6,7,7,7, 7,7,10},0);
	

	}

}
