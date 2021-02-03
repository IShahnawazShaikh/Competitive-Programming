//More Efficient: SearchForRangeII
public class SearchForRange {
	public static int[] searchRange(final int[] A, int B) {
	  int mid=getIndex(A,0,A.length-1,B);
	  if(mid==-1)return new int[]{-1,-1};
	  
	  int l=mid;
	  while(mid+1<A.length){
		if(A[mid+1]!=B) break;
		mid+=1;  
	  }
	  while(l-1>=0){
			if(A[l-1]!=B) break;
			l-=1;  
		  }
	  //System.out.println(l+" "+mid);
	  return new int[]{l,mid};
		
	}

	private static int getIndex(int[] A, int l, int r,int B) {
		int mid=0;
		while (l <= r) {
			mid = (l + r) / 2;

			if (A[mid] == B) return mid;
			else if (B > A[mid]) l = mid + 1;
			else r = mid - 1;
		}
		System.out.println(mid);
      return -1;
	}

	public static void main(String[] args) {
	 searchRange(new int[]{ 1, 1, 2, 2, 10},5);
	

	}

}
