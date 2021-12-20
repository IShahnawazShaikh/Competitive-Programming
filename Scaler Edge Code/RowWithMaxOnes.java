
public class RowWithMaxOnes {
  private static int solve(int[][] ar) {
	  int r,c;
	  int cnt=1,ans=0;
	  int row=0;
	  int p=ar[0].length-1;
	  for(r=0;r<ar.length;r++) {
		    cnt=0;
		  for(c=ar[r].length-1;c>=0;c--) {
		   if(ar[r][c]==1) {
			   cnt+=1;
		   }
		   else {
			 if(cnt>ans) {
				ans=cnt;
				row=r;
				break;
			 }
		   }		 
		 }
		if(cnt > ans) {
		  row=r;
		  ans=cnt;  
		}
	}
	return cnt> ans ? r-1: row;
  }
	public static void main(String[] args) {
		 int ar[][]={ 
				 {0,1,1},
				 {0,1,1},
				 {1,1,1}
		         };
    System.out.println(solve(ar));
	}

}
