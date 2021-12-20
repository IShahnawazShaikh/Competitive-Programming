import java.util.Arrays;

public class PairswithGivenDifference {
	public static int solve(int[] A, int B) {
	     Arrays.sort(A);
	     int p1=0,p2=1,ans=0,n=A.length;
	     while(p2<n){
	     if(A[p2]-A[p1]<B) p2+=1;
	     else if(A[p2]-A[p1] > B){
	       p1+=1;
	       if(p1==p2) p2+=1;
	     }
	     else{
	         ans+=1;
	         int f=A[p1];
	         int s=A[p2];
	         while(p1<n-1 && A[p1]==f) p1++;
	         while(p2<n && A[p2]==s) p2+=1;   
	         if(p1==p2) p2+=1;
	      }
	     }
	     System.out.println(ans);
	     return ans;   
	  }
	public static void main(String[] args) {
		solve(new int[]{1, 5, 3, 4, 2},3);

	}

}
