import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class UniquePrimeFactors {
	public static boolean isPrime[];
	public static ArrayList<Integer> primeNumbers;
	private static void seive() {
		isPrime=new boolean[1000001];
		primeNumbers=new ArrayList<Integer>();
		Arrays.fill(isPrime,true);
		isPrime[0]=false;
		isPrime[1]=false;
		int i,j;
		for(i=2;i*i<=1000000;i++) {
			if(isPrime[i]) {
				primeNumbers.add(i);
				for(j=i*i;j<=1000000;j+=i) {
				  isPrime[j]=false;	
				}
			}
		}	
}
 private static void uniquePrime(TreeSet<Integer> set, int x) {
	 
	 int index=0;
	 int num=primeNumbers.get(index);
	 while(num*num<=x) {
		 
	   while(x%num==0) {
		   x/=num;
		   set.add(num);
	   }
	   index+=1;
	   num=primeNumbers.get(index);
	  }
	 if(x!=1) set.add(x);
}
private static int solve(int ar[]) {
	 seive();
     TreeSet<Integer> set=new TreeSet<Integer>();
     Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
     int i;
     for(i=0;i<ar.length;i++) {
      if(isPrime[ar[i]]) set.add(ar[i]);
     
      else {
    	  if(!mp.containsKey(ar[i])) {
    		  uniquePrime(set,ar[i]);
    		  mp.put(ar[i],1) ;  
    	  } 	  
      }
     }
	return set.size(); 
	 
  }

	public static void main(String[] args) {
	    int ar[]= { 63, 52, 28, 72, 9, 62, 79, 71, 43,
	    		15, 82, 21, 10, 12, 38, 96, 58, 99,
	    		59, 100, 10, 38, 92, 30, 24, 3, 49, 
	    		17, 2, 63, 54, 18, 71, 7, 65, 87, 82,
	    		31, 48, 39, 100, 82, 15, 60, 44, 84, 
	    		43, 5, 63, 17, 100, 94, 62, 26, 35, 29};	
		System.out.println(solve(ar));

	}

}
