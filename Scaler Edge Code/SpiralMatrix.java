
public class SpiralMatrix {
   private static int[][] solve(int n){
	int m;   
	if(n%2==0) m=n/2;
	else m=n/2+1;
	int i,j,p;
	int cnt=0;
	int ar[][]=new int[n][n];
	
for(p=0;p<m;p++) {
	
	for(j=p;j<n-p;j++) {
	  cnt+=1;
	  ar[p][j]=cnt;
	}
	for(i=p+1;i<n-p;i++) {
		cnt+=1;
		ar[i][j-1]=cnt;
	}
    for(j=j-2;j>=p;j--) {
		cnt+=1;
    	ar[i-1][j]=cnt;
	}
    for(i=i-2;i>p;i--) {
    	cnt+=1;
    	ar[i][j+1]=cnt;
	}
	}
   for(i=0;i<n;i++) {
	   for(j=0;j<n;j++) {
		  System.out.print(ar[i][j]+" "); 
	   }
	   System.out.println();
   }
	return ar;   
   }
	public static void main(String[] args) {
	 solve(7);
		
		
		
	}

}
