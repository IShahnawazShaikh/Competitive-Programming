
public class ProductArrayPuzzle {
	 static final double EPS =1e-3;	
  public static int[] solve(int[] A) {
    int i,n=A.length;
    double sum=0;
    System.out.println(EPS);
    for(i=0;i<n;i++){
      sum+=Math.log10(A[i]);
    }
    int ans[]=new int[n];
    for(i=0;i<n;i++){
     System.out.println(Math.log10(Math.pow(10.00,(sum-Math.log10(A[i]))))+": "+(EPS + Math.pow( 10.00, sum - Math.log10(A[i]))));
     System.out.println((int)(EPS+Math.pow( 10.00, sum - Math.log10(A[i]))));
     
     ans[i]=(int)(EPS * Math.pow( 10.00, sum - Math.log10(A[i]))); 
     System.out.println();
    } 
    
   for(i=0;i<n;i++) System.out.println(ans[i]+" ");
   return ans;
  }
  public static void main(String...x){
	  solve(new int[]{3, 2, 10, 1, 4, 7, 7, 1, 10, 2, 6, 6, 7, 6, 5, 1, 1, 1, 1});
  }
}
