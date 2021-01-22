
public class ChristmasTree {
  public static int solve(int[] A, int[] B) {
    int i,j;
    long ans=Integer.MAX_VALUE;
    int n=A.length;
    boolean true1=false,true2=false;
    for(i=1;i<n-1;i++){
      long cost1=Integer.MAX_VALUE,cost2=Integer.MAX_VALUE;
     for(j=i-1;j>=0;j--){
    	if(A[i]>A[j]){
    	  true1=true;
    	  cost1=Math.min(cost1,B[j]);    		
    	}
     }
     for(j=i+1;j<n;j++){
        if(A[j]>A[i]){
         true2=true;  
        cost2=Math.min(cost2,B[j]);	
        }
     }
    ans=Math.min(ans,cost1+cost2+B[i]);
    	
    }
    if(true1 && true2) return (int)ans;  
    else return -1;
	  
  }
  public static void main(String[] args) {
	  solve(new int[]{5,5,7,8,9},new int[]{1,2,3});
	}

}
