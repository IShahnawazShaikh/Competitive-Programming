
public class ReversePairs {
   public static int solve(int[] A) {
		  
		  long ans=mergeHelper(A,0,A.length-1,0);	
		  //System.out.println(ans);
          //for(int i=0;i<A.length;i++) System.out.print(A[i]+""); 
		  return (int)(ans);	
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
		 if(A[p1]> A[p2]){
			temp[index++]=A[p2++];
		 }
		 else{
		  temp[index++]=A[p1++];	 
		 }
	   }
	   while(p1<=mid) temp[index++]=A[p1++];
	   while(p2<=end) temp[index++]=A[p2++];
	   p1=st;
	   p2=mid+1;
	   while(p1<=mid && p2<=end){
		if(A[p1]> 2* A[p2]){
		 ans+=mid-p1+1;
		 p2+=1;
		}
		else{
		 p1+=1;	 
		}
	 }
	   
	for(index=0;index<end-st+1;index++) A[index+st]=temp[index]; 
	return ans;
	}
	public static void main(String[] args) {
	   solve(new int[]{4, 1, 2});
	}

}
