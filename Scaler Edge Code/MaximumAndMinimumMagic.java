import java.util.Arrays;

public class MaximumAndMinimumMagic {
	public static int[] solve(int[] A) {
	 int i,n=A.length;
	 int MOD=1000000007;
	 long sum1=0,sum2=0;
	 int p1=0,p2=n-1,p3=n-1;
	 Arrays.sort(A);
	 for(i=0;i<n/2;i++){
	   sum1+=Math.abs(A[p1]-A[p2]);
	   sum2+=Math.abs(A[p3]-A[p3-1]);
	   sum1%=MOD;
	   sum2%=MOD;
	   p1+=1;
	   p2-=1;
	   p3-=2; 
	 }
	 //System.out.println(sum1+" "+sum2);
	 return new int[]{(int)sum1,(int)sum2};	
	}

	public static void main(String[] args) {
	solve(new int[]{3,2,6,-4,3,1});

	}

}
