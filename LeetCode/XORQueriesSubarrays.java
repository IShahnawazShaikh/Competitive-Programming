
public class XORQueriesSubarrays {
    public static int[] xorQueries(int[] arr, int[][] queries) {
      int i,j,n=arr.length; 
      int ans[]=new int[queries.length];
      int preXor[]=new int[n];
      preXor[0]=arr[0];
      for(i=1;i<n;i++) preXor[i]=arr[i]^preXor[i-1];
      
      for(i=0;i<queries.length;i++){
    	 int l=queries[i][0];
    	 int r=queries[i][1];
    	 if(l==0){ ans[i]=preXor[r];}
    	 else{
    		 
    		ans[i]=preXor[l-1]^preXor[r]; 
    		
    	 }
      }
     for(i=0;i<queries.length;i++) System.out.print(ans[i]+" ");
      return ans;
    	
    }
	public static void main(String[] args) {
		xorQueries(new int[]{16},new int[][]{{0,0},{0,0},{0,0},{0,0}});

	}

}
