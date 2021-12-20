
public class SumofAllOddLengthSubarrays {

	public static void main(String[] args) {
	 int ar[]= {1,2};
	 System.out.println(solve(ar));
	 
		

	}

  private static int solve(int[] ar) {
	int ans=0;
	int i,j;
	int sum1=0;
	int sum=0;
	for(i=0;i<ar.length;i++) {
	   sum1+=ar[i];
	   sum+=ar[i];
	 for(j=i+2;j<ar.length;j+=2) {
	    sum+=ar[j-1]+ar[j];
		ans+=sum;
	 }
	 sum=0;	
	}
	return ans+sum1; 
  }

}
