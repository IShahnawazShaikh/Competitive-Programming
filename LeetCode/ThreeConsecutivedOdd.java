
public class ThreeConsecutivedOdd {
	 public static boolean threeConsecutiveOdds(int[] arr) {
	   int n=arr.length;
		if(n<3) return false;
		int i;
		for(i=2;i<n;i++) {
			if((arr[i]^1)==arr[i]-1 && (arr[i-1]^1)==arr[i-1]-1 && (arr[i-2]^1)==arr[i-2]-1)
				 return true;
		}
	   return false;     
	 }
	public static void main(String[] args) {
		int ar[]= {2,3,3};
		System.out.println(threeConsecutiveOdds(ar));
	}

}
