import java.util.Arrays;

public class PonyMobilePhones {
	public static int[] solve(int[] A, int[] B) {
	  int i,n=B.length;
	  int ans[]=new int[n];
	  for(i=1;i<A.length;i++) A[i]=A[i-1]+A[i]; 
	  for(i=0;i<A.length;i++) System.out.print(A[i]+" ");
	  System.out.println();
	  for(i=0;i<n;i++){
		 int t=Arrays.binarySearch(A,B[i]);
		 ans[i]=Math.abs(t+1); 
	  }
	 return ans;	
	}
	public static void main(String[] args) {
		solve(new int[]{10, 14, 46, 49, 58, 62, 94},
				new int[]{620, 177, 342, 115});

	}

}
