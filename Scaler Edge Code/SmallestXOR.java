
public class SmallestXOR {
  public static int solve(int A, int B) {
     int cnt=0,ans=A;
      while(ans>0){
    	 if((ans&1)==1) cnt+=1; 
    	 ans>>=1;
      }
      ans=0;
      if(cnt==B) ans=A;
      else if(cnt<B){
    	int diff=B-cnt;
    	ans=A;
        int i=0;
    	while(i<B && diff>0){
    	 
    		if((ans&(1<<i))==0){
    		   diff-=1;
    		   ans=ans|(1<<i);
    		}
    		i+=1;
    	}
    	System.out.println("else if:"+ans);
      }
      else{
    	ans=A;  
    	int i=0;
    	B=cnt-B;
    	while(B>0){
    	  if((A&1)==1){
    		  ans=ans&(~(1<<i));
    		  B-=1;
    	  }
    	  i+=1;
    	 A>>=1;
    	}
    	  
    	System.out.println(ans);  
     }
     return ans;
 
  }
 public static void main(String[] args) {
		solve(2,0);

 }

}
