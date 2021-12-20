
public class SumAllSubmatrices {
  private static int solve(int[][] ar) {
	  int ans=0;
	  int r,c;
	  for(r=0;r<ar.length;r++) {
		 for(c=0;c<ar[r].length;c++) {
		 ans+=ar[r][c]*((r+1)*(c+1)*(ar.length-r)*(ar[r].length-c));	 
		 }
	  }
	  return ans;
  }
	public static void main(String[] args) {
		 int ar[][]={ 
				 {1, 1},
				 {1,1}    
		         };
     System.out.println(solve(ar));
	}

}
