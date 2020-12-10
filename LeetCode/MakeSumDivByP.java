import java.util.HashMap;
import java.util.Map;

public class MakeSumDivByP {
  public static int minSubarray(int[] ar, int p) {
	long sum=0;
	int i;
	int n=ar.length;
	sum+=ar[0];
	ar[0]=ar[0]%p;
	
	for(i=1;i<n;i++) {
		sum+=ar[i];
		ar[i]=(ar[i-1]+ar[i])%p;
	 }	
	if(sum%p==0) return 0;
	Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	mp.put(0,-1);
	 int ans=n;
	for(i=0;i<n;i++) {
	 int req=(ar[i]-ar[n-1]+p)%p;
	 if(mp.containsKey(req)) {
		 ans=Math.min(ans,i-mp.get(req));
	 }
	 mp.put(ar[i],i);
	}
	return (ans==n) ? -1: ans; 
  }
  public static void main(String[] args) {
	 int ar[]= {1,2,3};
	 
	System.out.println(minSubarray(ar,7));	

  }

}
