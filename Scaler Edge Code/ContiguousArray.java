import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
  public static int solve(int[] A) {
		int i, n = A.length;
		int ans = 0, sum = 0;
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		mp.put(0,-1);
		for (i = 0; i < n; i++) {
		 if(A[i]==1) sum+=1;
		 else sum-=1;
		 if(mp.containsKey(sum)){
		  ans=Math.max(ans, i-mp.get(sum));	 
		 }
		 else mp.put(sum,i);
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		solve(new int[]{1,0});

	}

}
