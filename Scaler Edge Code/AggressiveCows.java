import java.util.Arrays;

public class AggressiveCows {
	public static int solve(int[] A, int B) {
	  Arrays.sort(A);	
	 int i,ans=0,n=A.length;
	 int low=1,high=A[n-1]-A[0];
	 int mid=0;
	 while(low<=high){
	 mid= (high-low)/2 +low;
	 if(check(A,B,mid)){
		ans=mid; 
		low=mid+1; 
	 }
	 else high=mid-1;
	 }
	 System.out.println(ans);
	return ans;	
	}
  public static boolean check(int A[],int k,int minDist){
    int i,n=A.length;
    int recent_placed=A[0];
    int cow_placed=1;
    for(i=1;i<n;i++){
      if(A[i]-recent_placed >= minDist){
    	recent_placed=A[i];
       cow_placed+=1;	  
      }
      
    }
	return (cow_placed>=k) ? true : false;  
  }
  public static void main(String[] args) {
	 solve(new int[]{2, 6,11,14,19,25,30,39,43},4);

	}

}
