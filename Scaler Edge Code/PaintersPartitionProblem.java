public class PaintersPartitionProblem {

	public static int paint(int A,int B, int[] C){ 
		int i,n = C.length;
		int sum=0,low=0,MOD=10000003;
		long ans=0;
		for(i=0;i<n;i++){
		  low=Math.max(low,C[i]);	
		  sum+=C[i];
		}
		int high=sum,mid = 0;		
		while (low <= high) {
			mid = (high +low)/2;
			if (check(C, A, mid)) {
				ans=mid;
				ans%=MOD;
			    high=mid-1;
			} 
			else low=mid+1;
		}
		System.out.println("ans: " +(ans*B)%MOD);
		ans=ans*B;
		return (int)(ans%MOD);

	}
  public static boolean check(int A[],int p,int mid){
    int i,n=A.length;
	int painter=1;
    int sum=0;
    for(i=0;i<n;i++){
      sum+=A[i];
      if(sum>mid) {
    	  painter++;
    	  sum=A[i];
	   }
	}
   return (painter<=p) ? true : false;  
  }
	public static void main(String[] args) {
	 paint(2,5,new int[]{1,10});

	}

}
