public class DominantDivisor {
 public static int solve(int A, int B) {
    long ans=sum(B)-sum(A-1);
    System.out.println(ans);
	return (int)ans%1000000007; 
 }
public static long sum(long n){	 
	if(n==0) return 0;
 if((n^1)==n-1) return square((n+1)/2)+sum(n/2); 
 else return square(n/2)+sum(n/2);

}
private static long square(long n) {
  return n*n;
}

public static void main(String[] args) {
 solve(1,10);	
  
  }
}
