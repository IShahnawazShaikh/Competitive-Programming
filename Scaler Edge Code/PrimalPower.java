import java.util.ArrayList;
import java.util.Arrays;

public class PrimalPower {
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
	
private static int solve(int[] ar) {
	 seive();
     int i,ans=0;
     for(i=0;i<ar.length;i++) {
      if(ar[i]>1 && isPrime[ar[i]]) ans+=1;	        	 
     }
 
  return ans;
  }
  public static void main(String[] args) {
	  int ar[]= {-11, 7, 8, 9, 10, 11};	
	  System.out.println(solve(ar));

	}

}
