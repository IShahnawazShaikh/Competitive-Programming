import java.util.Arrays;

public class CountPrimeSubsequence {
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

private static long solve(int ar[]) {
	 seive();
     int i;
     long cnt=1;
     for(i=0;i<ar.length;i++) {
    	 
      if(isPrime[ar[i]]) cnt=(cnt*2)%1000000007;  //because answer can be larger
 
     }
   return (cnt==1) ? 0: (cnt-1)%1000000007;
  }
  public static void main(String[] args) {
	    int ar[]= {9,9,3,6,7,5};	
		System.out.println(solve(ar));

	}

}
