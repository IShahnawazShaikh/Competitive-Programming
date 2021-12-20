public class SubMatrixSumQueries {
	    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
	        int[] ans=new int[B.length];      
	        for (int i = 0; i < A.length; i++) 
	            for (int j = 1; j <A[0].length ; j++) 
	                A[i][j] = (A[i][j] + A[i][j-1])%1000000007; 
	                
	        for (int i = 0; i < A[0].length; i++) 
	            for (int j = 1; j < A.length; j++) 
	                A[j][i] =(A[j][i]+ A[j-1][i])%1000000007;
	                
	        for(int i=0;i<B.length;i++){
	            B[i]-=1;
	            C[i]-=1;
	            D[i]-=1;
	            E[i]-=1;
	        }
	        long sum=0;
	        for(int i=0;i<B.length;i++){
	            sum=A[D[i]][E[i]]%1000000007; 
	          
	        if (B[i] > 0) sum = sum - A[B[i]-1][E[i]]; 
	        
	       
	        if (C[i] > 0)  sum = sum- A[D[i]][C[i]-1];   
	        
	        if (B[i] > 0 && C[i] > 0)   sum = (sum + A[B[i]-1][C[i]-1]); 
	         
	         sum=sum%1000000007;
	         if(sum<0) sum+=1000000007;
	         ans[i]=(int)sum;
	        }
	      return ans;
	  }
 public static void main(String[] args) {
		
	 int ar[][]={ 
			 {1, 2, 3},
			 {4, 5,  6},
			 {7,8,9}    
	         };
	 int r1[]= {1,2};
	 int c1[]= {1,2};
	 int r2[]= {2,3};
	 int c2[]= {2,3};
	 solve(ar,r1,c1,r2,c2);
 }

}
