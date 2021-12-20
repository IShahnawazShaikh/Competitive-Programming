import java.util.Arrays;

public class ChocalateDistribution {
  public static int solve(int[] A, int B) {
   int i,n=A.length;
   if(B==0) return 0;
   Arrays.sort(A);
   int ans=Integer.MAX_VALUE;
   for(i=0;i+B<=n;i++){
	  ans=Math.min(ans,A[B+i-1]-A[i]); 
   }
   System.out.println(ans);
  	  
   return 0;
  }
 public static void main(String[] args) {
	 solve(new int[]{3, 4, 1, 9, 56, 7, 9, 12},0); 
	 
	 
	}

}
