
public class PascalTriangleRow {
    private static int[] solve(int n) {
    int ar[][]=new int [n+1][];
    int i,j;
    for(i=0;i<n+1;i++) {
      ar[i]=new int[i+1];
      ar[i][0]=1;
      ar[i][ar[i].length-1]=1;
     for(j=1;j<i;j++) {
       ar[i][j]=ar[i-1][j]+ar[i-1][j-1];
     }
    }
    
    
    return	ar[n];
    }
	public static void main(String[] args) {
		int ar[]=solve(3);
		for(int i=0;i<ar.length;i++) System.out.print(ar[i]+" ");

	}

}
