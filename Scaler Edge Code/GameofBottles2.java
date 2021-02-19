// To make TC O(N) use frequency array
import java.util.Arrays;
public class GameofBottles2 {
	public static int solve(int[] A) {
	 int i,n=A.length;
	 int cnt=1,ans=0;
	 Arrays.sort(A);
	 for(i=0;i<n-1 ;i++){
	  if(A[i]==A[i+1]) cnt+=1;  
	  else{
		ans=Math.max(cnt,ans);
		cnt=1;
	  }
	 }
	 System.out.println(ans);
	
	return ans;
	}
	
	public static void main(String[] args) {
	  solve(new int[]{1,2,3});
		
	}

}
