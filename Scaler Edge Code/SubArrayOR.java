
public class SubArrayOR {
    public static int solve(int[] A) {
        int i,j,n=A.length,MOD=1000000007;
        long ans=0,temp=0,cnt=0;
          long max=((1L*n)*(n+1))/2;
          for(i=0;i<31;i++){
        	  cnt=0;
        	  temp=0;
        	for(j=0;j<n;j++){
        	  if(A[j]>0){	
        	   if((A[j]&(1<<i)) > 0){
        		  temp+=(cnt*(cnt+1))/2;
        		  cnt=0;
        	   }
        	   else {
        		   cnt+=1;
        	   }
        	  }
        	}
           if(cnt!=0) temp+=(cnt*(cnt+1))/2; 
           if(temp<max){ 
        	  ans+=((max-temp)<<(1L*i));
        	  ans%=MOD;
           }
          }	
          //System.out.println(ans);
        	
           return (int)(ans%MOD);
    }
	public static void main(String...x){
		
		solve(new int[]{1,2,3,4,5});
		
	}
	
}
