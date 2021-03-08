
public class MinimizeAbsoluteDifference {
  public static int solve(int[] A, int[] B, int[] C) {
    int ans=Integer.MAX_VALUE,l=A.length,m=B.length,n=C.length;
    int p1=0,p2=0,p3=0;
    int mx=0,mn=0;
    while(p1<l && p2< m && p3 < n){
     mx=Math.max(A[p1],Math.max(B[p2],C[p3]));
     mn=Math.min(A[p1],Math.min(B[p2],C[p3]));
     ans=Math.min(ans, mx-mn);
     
     if(mx==A[p1]){
      if(B[p2]<=C[p3]) p2++;
      else p3++;
     }
     else if(mx==B[p2]){
      if(A[p1]<=C[p3]) p1++;
      else p3++;	 
     }
     else{
    	 if(A[p1]<=B[p2]) p1++;
         else p2++; 	 
     }
    }
    System.out.println(ans);
    return ans;    
  }
 public static void main(String[] args) {
  solve(new int[]{ 1, 4, 5, 8, 10},new int[] {6, 9, 15 },new int[]{2, 3, 6, 6});

 }

}
