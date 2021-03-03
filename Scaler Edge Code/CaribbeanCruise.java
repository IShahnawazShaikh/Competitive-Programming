public class CaribbeanCruise {
  public  static  int solve(int A, int[] B) {
	int ans=0,i,n=B.length;
	int freq[]=new int[100000+1];
	for(i=0;i<n;i++)  freq[B[i]]+=1;
	int low=1,high=n;
	int mid=0;
	while(low<=high){
	 mid=(low+high)/2;
	 if(check(freq,mid)>=A){
	   ans=mid;
	   low=mid+1;
	  }
	 else high=mid-1;
	}	
	System.out.println(ans);
	return ans;
   }
   public static int check(int freq[],int mid){
	 int i;
	 int n=freq.length;
	 int sum=0;
	 for(i=0;i<n;i++){
	   sum+=freq[i]/mid;
	 }
	 return sum;
	 
    }
	public static void main(String[] args) {
	solve(4,new int[]{3,3,3,3,2,2,6,6,10,13});

	}

}
