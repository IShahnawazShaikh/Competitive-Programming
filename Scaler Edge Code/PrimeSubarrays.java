import java.util.Arrays;
public class PrimeSubarrays {
	public static boolean isPrime[];
	private static void seive() {
		isPrime=new boolean[1000000+1];
		Arrays.fill(isPrime,true);
		isPrime[0]=false;
		isPrime[1]=false;
		int i,j;
		for(i=2;i*i<=1000000;i++) {
			if(isPrime[i]) {
				for(j=i*i;j<=1000000;j+=i) isPrime[j]=false;	
			}
		}	
}
private static int solve(int ar[]) {
	 seive();
     int i,j;
     int sum;
     int cnt=0;
     for(i=0;i<ar.length;i++) {
       sum=0;
       for(j=i;j<ar.length;j++) {
    	 sum+=ar[j];
    	 if(isPrime[sum]) cnt+=1;
       }    	 
  }
  return cnt;
  }
  public static void main(String[] args) {
	    int ar[]= { 1,2,3,4};	
		System.out.println(solve(ar));

	}

}
