
public class PairswithgivensumII {
	public static int solve(int[] A, int B) {
		long ans=0;
	     int MOD=1000000007;
	     int p1=0,p2=A.length-1,x=0;
	     long cnt=0,cnt2=0,sum=0;
	     while(p1<p2){
	      sum=(1L*A[p1])+(1l*A[p2]);     
	      if(sum <B) p1+=1;
	      else if(sum >B) p2-=1;
	      else{
	    	  cnt=0;
	    	  cnt2=0;
	          if(A[p1]==A[p2]){
	             cnt=p2-p1+1;
	             ans+=((cnt%MOD) * ((cnt-1)%MOD))/2;
	             ans%=MOD;
	             break;
	          }
	          else{
	    	  x=A[p1];
	    	  while(p1<A.length && A[p1]==x){
	    		 p1+=1;
	    		 cnt+=1;
	    	  }
	    	  x=A[p2];
	    	  while(p2>0 && A[p2]==x){
	    		cnt2+=1;
	    		p2-=1;
	    	  }
	    	  ans+=((cnt%MOD)*(cnt2%MOD))%MOD;
	       }
	       ans%=MOD;
	      }
	     }
		 return (int)(ans%MOD);	    
	    }
	

	public static void main(String[] args) {
      solve(new int[]{1,1,1},2);
	}

}
