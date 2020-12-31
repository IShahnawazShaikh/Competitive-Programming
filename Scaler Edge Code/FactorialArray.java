import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FactorialArray {
	public static int N=1000000;
    public static int cnt[];
	public static void seive(){
	 cnt=new int[N+1];
	 boolean isPrime[]=new boolean[N+1];
	 Arrays.fill(isPrime,true);
	 isPrime[0]=isPrime[1]=false;
	 int i,j,k=(int) Math.sqrt(N);
	 for(i=2;i<=k;i++){
	   if(isPrime[i]){
		 for(j=i*i;j<=N;j+=i) isPrime[j]=false;
	   } 
	 }
	int primecnt=0;  
	for(i=2;i<N;i++) {
	  if(isPrime[i]){
		  primecnt+=1;
		  cnt[i]=primecnt;
	  }
	  else{
		  cnt[i]=primecnt;
	  }
	 }
       for(i=0;i<10;i++) System.out.println(i+": "+cnt[i]+" ");
	}
	public  static long power(int x,long y,int MOD){      	
	      	if(y==0) return 1L;
	          if(y==1)  return x;

	          long temp=power(x,y/2,MOD)%MOD;
	          temp = (temp*temp)%MOD;
	          if(y%2==1) {
	              temp = (temp*x)%MOD;
	          }
	          return temp;
	      }
	public static int solve(int[] ar) {
	 seive();
	 int i;
	 Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	 for(i=0;i<ar.length;i++){
//		 System.out.println(cnt[ar[i]]);
       if(ar[i]==1) continue;
	   if(mp.containsKey(cnt[ar[i]])){		   
		   mp.put(cnt[ar[i]],mp.get(cnt[ar[i]])+1);
	   }
	   else{
		   mp.put(cnt[ar[i]],1); 
	   }
	 }
	 
	 System.out.println(mp);
	 
	 long ans=0;
	 int MOD=1000000007;
	 
	 for(Map.Entry<Integer,Integer> mp1: mp.entrySet()){
		ans=ans+( power(2,mp1.getValue(),MOD)-1);
		ans%=MOD;
		 
	 }
	 
	 System.out.println(ans);
	 
	return (int)ans;
	}
	public static void main(String[] args) {
		solve(new int[]{251, 923, 561, 230, 100, 399, 542, 
				198, 548, 892, 721, 781, 174, 809, 9, 232, 165,
				861, 36, 837, 377, 313, 475, 269, 210, 530, 940, 
				570, 24, 434, 764, 275, 709, 325, 505, 161, 724, 
				47, 359, 625, 291, 81, 406, 465, 242, 767, 698, 
				408, 629, 86, 597, 358, 399, 72, 979, 962, 603, 
				919, 884, 627, 353, 1, 254, 414, 678, 111, 575, 
				755, 511, 287, 380, 802, 720, 138, 620, 314, 905,
				670, 74, 886, 756, 671, 244, 508, 744, 224, 822, 347,
				495, 706, 326, 201, 707, 580, 615, 386, 43, 543, 141, 554});

	}

}
