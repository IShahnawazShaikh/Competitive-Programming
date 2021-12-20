import java.util.Arrays;

public class LuckyNumberAppr2{
  	public static boolean isPrime[];
	public static void seive(int num) {
		isPrime=new boolean[num+1];	
		Arrays.fill(isPrime,true);
		isPrime[0]=false;
		isPrime[1]=false;
		int i,j;
		for(i=2;i*i<=num;i++) {
			if(isPrime[i]) {
				for(j=i*i;j<=num;j+=i)	isPrime[j]=false;		
			}
		}	
}
private static int solve(int num) {
   seive(50001);
   int i,j;
   int cnt[]=new int[50001];
   for(i=1;i<50001;i++) {
	 for(j=2;j*j<=i;j++) {
		if(i%j==0) {
			if(isPrime[j]) cnt[i]++;
			if(i/j!=j && isPrime[i/j]) cnt[i]++;
		}
	 }
	   
   }
   int ans=0;
   for(i=1;i<=num;i++)  if(cnt[i]==2) ans+=1; 
 
  return ans;
}
public static void main(String[] args) {
	solve(40);

	}

}
