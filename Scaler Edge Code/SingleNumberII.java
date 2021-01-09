
public class SingleNumberII {
	private static void solve(int[] ar) {
		//int cntbit[]=new int[31];
		int i,j;
		int cnt=0;
		int ans=0,t=1;
		for(i=0;i<31;i++){
		  for(j=0;j<ar.length;j++){
			 if((ar[j]&(1<<i))>0){
				//cntbit[i]=cntbit[i]+1;   //Use Array to use Extraa Space
				 cnt+=1;
			 }
		  }
		  ans+=(t*(cnt%3));
		  t*=2;
		  cnt=0;
		}
//	 for(i=0;i<31;i++) System.out.print(cntbit[i]+" ");
//	 
//	 for(i=0;i<31;i++){
//		ans+=(t*cntbit[i]);
//		t*=2;
//	 }
	 
	System.out.println(ans); 
		
		
	}
   public static void main(String...x){
	  solve(new int[]{1, 2, 4, 3, 3, 2, 2, 3, 1, 1,4,4,9}); 
   }
}
