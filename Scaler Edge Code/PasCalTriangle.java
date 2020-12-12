
public class PasCalTriangle {
    private static int[][] solve(int n) {
    int ar[][]=new int [n][];
    int i,j;
    for(i=0;i<n;i++) {
      ar[i]=new int[i+1];
      ar[i][0]=1;
      ar[i][ar[i].length-1]=1;
     for(j=1;j<i;j++) {
       ar[i][j]=ar[i-1][j]+ar[i-1][j-1];
     }
    }
    
    for(i=0;i<n;i++) {
    	for(j=0;j<ar[i].length;j++) {
    		System.out.print(ar[i][j]+" ");
    	}
    	System.out.println();
    }
     return	ar;
    }
	public static void main(String[] args) {
		solve(8);

	}

}
