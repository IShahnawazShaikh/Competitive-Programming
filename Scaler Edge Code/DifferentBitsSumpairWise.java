

public class DifferentBitsSumpairWise {
  private static void solve(int[] ar) {
	int cnt[]=new int [31];
	int i,j,n=ar.length;
	int MOD=1000000007;
	  long ans=0; 
	for(i=0;i<31;i++){
		
		for(j=0;j<n;j++){
		  if((ar[j]&(1<<i))>0){
			  cnt[i]=cnt[i]+1;
			  System.out.println("if: "+i);
		  }
			
		}
		System.out.print(cnt[i]+" ");
	 ans+=((cnt[i]*(n-cnt[i]))%MOD);
	 ans%=MOD;
		
	}
    System.out.println(ans*2);
    
  }
 public static void main(String...x){
     
	  solve(new int[]{1,3,5});
  }	
}
