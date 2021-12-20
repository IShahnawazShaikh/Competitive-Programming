import java.util.Arrays;

public class ArrayConsecutiveElement {
	
 public static int solve(int [] A){
	    Arrays.sort(A);
	    int i,n=A.length;
	    for(i=1;i<n;i++) if(A[i]-A[i-1]>1) return 0;
	    return 1;
 }
  public static void main(String[] args) {
	System.out.println(solve(new int[]{1,2,3,4}));
	}
}
