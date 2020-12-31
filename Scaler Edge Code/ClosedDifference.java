
public class ClosedDifference {
	public static int solve(int[] A) {
	 int i;
	 int gd=A[0],mx=A[0],cnt=0;
	 if(A[0]==0) cnt+=1;
	 for(i=1;i<A.length;i++) {
		 gd=gcd(gd,A[i]);
		 mx=Math.max(mx,A[i]);
		 if(A[i]==0) cnt+=1;
	 }
	 return mx/gd+cnt;
    }
	public static int gcd(int a, int b) {
	if(a==0) return b;
	return gcd(b%a,a);
	}
	public static void main(String[] args) {
	  System.out.println(solve(new int[]{0,3,4}));
	}

}
