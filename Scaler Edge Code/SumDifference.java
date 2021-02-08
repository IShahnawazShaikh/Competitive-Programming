import java.util.Arrays;

public class SumDifference {
 public static int solve(int[] A) {
	int i,n=A.length;
	long Cmin=0,Cmax=0,ans=0;
	int MOD=1000000007;
	Arrays.sort(A);
	for(i=0;i<n;i++){
      Cmin+=A[i]*power(2,(n-1)-i,MOD);
	  Cmin%=MOD;
	 }
	 System.out.println("Cmin: "+Cmin);
	 for(i=0;i<n;i++){
	  Cmax+=A[i]*power(2,i,MOD);
	  Cmax%=MOD;
	  }
	 System.out.println("Cmax "+Cmax);
	 ans=((Cmax-Cmin)+MOD)%MOD; 
	 System.out.println(ans);
	  return (int)(ans%MOD);	
     }
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
	public static void main(String[] args) {
	  solve(new int[]{5,4,2});	
	}

}
