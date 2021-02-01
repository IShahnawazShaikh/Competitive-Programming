
public class SortWithSquares {
	public static int[] solve(int[] A) {
      int i,n=A.length;
      int p1=0,p2=n-1;
      int ans[]=new int[n];
      for(i=n-1;i>=0;i--){
    	  int t1=Math.abs(A[p1]);
    	  int t2=Math.abs(A[p2]);
    	 if(t1>=t2){
    	   ans[i]=t1*t1;	 
    	   p1+=1;
    	 }
    	 else{
    		 ans[i]=t2*t2;
    		 p2-=1; 
    	 }
      }
    for(i=0;i<n;i++) System.out.print(ans[i]+" ");  
	return ans;	
		
	}
	public static void main(String[] args) {
		solve(new int[]{5, 4, 2});

	}

}
