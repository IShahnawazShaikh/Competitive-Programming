
public class CountPairWithSum {
	public static int solve(int[] A, int B) {
	     int p1=0,ans=0;
	     int p2=A.length-1;
	     while(p1<p2){
	      if(A[p1]+A[p2]==B) {
	          ans+=1;
	          p1+=1;
	          p2-=1;
	      }
	      else if(A[p1]+A[p2] > B) p2-=1;
	      else p1+=1;
	     }
	     System.out.println(ans);
	     return ans;    
	        
	    }
	public static void main(String[] args) {
		solve(new int[]{1,2,3,4,5},5);
	}

}
