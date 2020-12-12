
public class MatrixRotation {
 private static void solve(int ar[][]) {
     int i,j;
     int n=ar.length;
     int ans[][]=new int[n][n];
	 for(i=0;i<n;i++) {
	    for(j=i+1;j<n;j++) {
	    	int temp=ar[i][j];
	    	ar[i][j]=ar[j][i];
	    	ar[j][i]=temp;
	     }
	 }
	 for(i=0;i<n;i++) {
		    for(j=0;j<n/2;j++) {
		    	int temp=ar[i][j];
		    	ar[i][j]=ar[i][n-j-1];
		    	ar[i][n-j-1]=temp;
		    }
		 }
	 for(i=0;i<n;i++) {
	    for(j=0;j<n;j++) {
	    	System.out.print(ar[i][j]+" ");
	    }
	    System.out.println();
	 }
	 
   }
 public static void main(String[] args) {
	 int ar[][]= {
			 {1,2,3,4},
			 {5,6,7,8},
			 {9,10,11,12},
			 {13,14,15,16}
	 }; 
	 solve(ar);	

	}

}
