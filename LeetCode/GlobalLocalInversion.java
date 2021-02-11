
public class GlobalLocalInversion {
	public static boolean isIdealPermutation(int[] A) {
		int local = getLocalInversion(A);
    
		int global=mergeHelper(A, 0, A.length - 1, 0);
        
		//System.out.println(local+" "+global);
		return local==global ? true: false;
	}

	public static int mergeHelper(int[] A, int st, int end, int ans) {
	  
	  if(st==end) return ans;
	  int mid=(end-st)/2+st;
	  ans=mergeHelper(A,st,mid,ans);
	  ans=mergeHelper(A,mid+1,end,ans);
	  ans+=counteInversion(A,st,mid,end);
	  return ans;	
	}
	private static int getLocalInversion(int[] A) {
		int i, local = 0, n = A.length;
		for (i = 0; i < n - 1; i++)
			if (A[i] > A[i + 1])
				local += 1;
		return local;
	}
	
	public static int counteInversion(int[] A,int st,int mid,int end){
	 int p1=st;
	 int p2=mid+1;
	 int i,ans=0,k=0;
	 int temp[]=new int[end-st+1];
	 while(p1<=mid && p2<=end){
		if(A[p1]>A[p2]){
		  ans+=mid-p1+1; 
		  temp[k++]=A[p2++];
		   
		}
		else{
			temp[k++]=A[p1++];
		}
	 }
	 while(p1<=mid) temp[k++]=A[p1++];
	 while(p2<=end) temp[k++]=A[p2++];
	 
	 for(i=0;i<end-st+1;i++) A[i+st]=temp[i];
	 return ans;	
	}
	

	public static void main(String[] args) {
		isIdealPermutation(new int[] { 1,0,2});
	}

}
