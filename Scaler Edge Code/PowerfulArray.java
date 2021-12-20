
public class PowerfulArray {
	public static double EPS=1e-3;
	public static int solve(int[] A, int[] B) {
	   
	 int i,n=A.length,m=B.length;
	   double aCnt=0,bCnt=0;
	   for(i=0;i<n;i++){
		   aCnt+=Math.log(A[i]);  
	    }
	    for(i=0;i<m;i++){
	    	 bCnt+=Math.log(B[i]);  
	    }
	  System.out.println((int)(EPS+aCnt)+" "+(int)(EPS+bCnt)); 
	  return 0;	
	}
	public static void main(String...x){
		int a[]=new int[]{1,2,3,4,5};
		int b[]=new int[]{2,3,4,2};
		solve(a,b);
	}
	
}
