//pending
import java.util.ArrayList;
import java.util.Arrays;

public class PrimeSum {
  	public static boolean isPrime[];
	public static ArrayList<Integer> primeNumbers;
	public static void seive(int num) {
		isPrime=new boolean[num+1];
		primeNumbers=new ArrayList<Integer>();
		Arrays.fill(isPrime,true);
		isPrime[0]=false;
		isPrime[1]=false;
		int i,j;
		for(i=2;i*i<=num;i++) {
			if(isPrime[i]) {
				for(j=i*i;j<=num;j+=i) isPrime[j]=false;	
			}
		}
	for(i=2;i<isPrime.length;i++) {
		if(isPrime[i]) primeNumbers.add(i);
	}
}
public static boolean primeLarger(int n) {
  if(n<isPrime.length) return isPrime[n];
  for(int i: primeNumbers) {
	  if(i>Math.sqrt(n)) return true;
	  if(n%i==0) return false;
  }
return true;	
}
public static int[] primesum(int num) {
 seive(num);
     int i;
      int ans[]=new int [2];
     for(i=0;i<primeNumbers.size();i++) {
       if(primeLarger(num-primeNumbers.get(i))) {
    	   ans[0]=primeNumbers.get(i);
    	   ans[1]=num-primeNumbers.get(i);
           break;
     }    	 
  }
 
  return ans;
}
	
  public static void main(String[] args) {
	  primesum(16777214);

	}

}
