
public class ToeplitzMatrix {
	private static int solve(int[][] ar) {
		
		int R=ar.length;
		int C=ar[0].length;
		int i,j;
		for(i=1;i<R;i++) {
		  for(j=1;j<C;j++) {
			 System.out.println(ar[i][j]+" "+ar[i-1][j-1]);
			  if(ar[i][j]!=ar[i-1][j-1]) return 0;  
		  }
		}
		
		return 1;
	}

	public static void main(String[] args) {
	int	ar[][]= { 
			{1,2,3},
	        };
	 
	  System.out.println(solve(ar));
	
	}

	
}
