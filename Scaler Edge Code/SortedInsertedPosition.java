public class SortedInsertedPosition {
	public static int searchInsert(int[] A, int B) {
	  int mid=getIndex(A,0,A.length-1,B);
	  System.out.println(mid);
	  return mid;	
	}
	private static int getIndex(int[] A, int l, int r,int B) {
		int mid=0;
		while (l <= r) {
			mid = (l + r) / 2;

			if (A[mid] == B) return mid;
			else if (B > A[mid]) l = mid + 1;
			else r = mid - 1;
		}
	 // while(mid < A.length && B > A[mid]) mid+=1;	
		 
      return l;
      //return mid;
	}

	public static void main(String[] args) {
	searchInsert(new int[]{1, 3, 5, 6},7);
	}

}
