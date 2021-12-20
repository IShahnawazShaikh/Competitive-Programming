
public class AnotherCountRectangles {
	 public static int solve(int[] A, int B) {
	     int p1=0,p2=A.length-1;
	     long ans=0;
	     int MOD=1000000007;
	     while(p1<=p2){
	        if(1l*A[p1]*A[p2] < B){
	          ans+=2L*(p2-p1+1)-1;
	          ans%=MOD;
	          p1+=1;
	        }
	        else if(A[p1]*A[p2]>B) p2-=1;
	        else p2-=1;
	     }
	     
	     return (int)(ans%MOD);   
	        
	    }
	public static void main(String[] args) {
	solve(new int[]{1,2,3,4,5},5);
	}

}
