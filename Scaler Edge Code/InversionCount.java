
public class InversionCount {
   public static long ans=0;
   public static int solve(int[] A) {
		  
		  long ans=mergeHelper(A,0,A.length-1,0);	
		  System.out.println(ans);

		  return (int)(ans%1000000007);	
		}
	   public static long mergeHelper(int[] A,int st,int end,long ans){
		 if(st==end) return ans;
		 int mid=(end-st)/2+ st;
		 ans=mergeHelper(A,st,mid,ans);
		
		 ans=mergeHelper(A,mid+1,end,ans);


		 ans+=countInversion(A,st,mid,end);
		 return ans;

	   }
	  public static long countInversion(int[] A, int st,int mid, int end){
	   int p1=st;
	   int p2=mid+1;
	   int temp[]=new int[end-st+1];
	   int index=0;
	   long ans=0;
	   while(p1<=mid && p2<=end){
	     
		 if(A[p1]>A[p2]){
			ans+=mid-p1+1;
			ans%=1000000007;
			temp[index++]=A[p2++];
		 }
		 else{
		  temp[index++]=A[p1++];	 
		 }
	   }
	   while(p1<=mid) temp[index++]=A[p1++];
	   while(p2<=end) temp[index++]=A[p2++];
	   
	   for(index=0;index<end-st+1;index++) A[index+st]=temp[index]; 
	   return ans;
	  }
	public static void main(String[] args) {
	   solve(new int[]{45, 10, 15, 25, 50});
	}

}
