/*Delete Minimum number of Element to make remaining element GCD 1*/

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElement {
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
private static int solve(int[] A) {
    int i;
	for(i=0;i<A.length;i++) {
		if(A[i]==1 || primeLarger(A[i])) return 0;
	}
  return -1;  
}
public static void main(String[] args) {
 int ar[]= {7,2,5};
	solve(ar);

  }

}
