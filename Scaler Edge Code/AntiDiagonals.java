
public class AntiDiagonals {
private static int[][] solve(int ar[][]) {
		
		int i,j;
		int n=ar.length;
		int ans[][]=new int[(2*n)-1][];
		int i2=0,p=0;
		for(i=0;i<n;i++) {
		 ans[i]=new int[i+1];
		 j=i;
		 p=0;
		 i2=0; 
		 while(j>=0) {
			 ans[i][p]=ar[i2][j];
			  p+=1;
			  i2+=1;
			  j-=1;
		 }	
		}
		i2=i-1;
		int x1=0,x2=0;
		int p1=0,p2=0;
		//System.out.println(i2);
		for(i=1;i<n;i++) {
			i2+=1;
			j=n-i;
			
	    // System.out.println(i2+" "+j);
			
			x1=i;
			x2=n-1;
			
		    //p1+=1;
			p2=0;
			
		 ans[i2]=new int[j];
		// System.out.println("for: "+i);
		 //System.out.println();
		 while(j>=1) {
			  
			 //System.out.println("values: "+x1+" "+x2);
			// System.out.println(i2+" "+p2);
			 ans[i2][p2]=ar[x1][x2];
			 p2+=1;
			 x1+=1;
			 x2-=1;
			j-=1;
			  
		 }
		}
		
		
//		for(i=0;i<ans.length;i++) {
//			for(j=0;j<ans[i].length;j++) {
//				System.out.print(ans[i][j]+" ");
//			}
//			System.out.println();
//		}
	return ans;	

	}
 public static void main(String[] args) {
	 	
	
   int ar[][]= {
    		 {1,2,3},
    		 {4,5,6},
    		 {7,8,9}
    		 };
	 solve(ar);	
	}

}
