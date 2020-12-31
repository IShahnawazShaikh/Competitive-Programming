
public class VeryLargePower {
    public  static long power(int x,long y,int MOD){      	
        	if(y==0) return 1L;
            if(y==1)  return x;

            long temp=power(x,y/2,MOD)%MOD;
            temp = (temp*temp)%MOD;
            if(y%2==1) {
                temp = (temp*x)%MOD;
            }
            return temp;
        }
    public static int solve(int A, int B) {
     int i,MOD=1000000007;
     long ans=1;
     for(i=B;i>=2;i--){
    	 ans=ans *i;
    	  ans%=MOD-1;
     } 
     return (int) power(A,ans,MOD);
    }
	public static void main(String[] args) {
     
		solve(2,27);
		
 
	}

}
