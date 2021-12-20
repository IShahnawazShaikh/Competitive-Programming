import java.util.Arrays;

public class GameofBottles {
	public static int solve(int[] A) {
	 int i,j,n=A.length;
	 Arrays.sort(A);
	 for(i=0;i<n;i++) System.out.print(A[i]+" ");
	 boolean check[]=new boolean[n];
	 Arrays.fill(check,true);
	 int falsecnt=0,ans=0;
	 boolean st=false;
	 for(i=0;i+falsecnt <n ;i++){
	    int t=A[i];
	    st=false;
		for(j=i+1;j<n;j++){
		  if(t<A[j] && check[j]){
			 check[j]=false;
			 t=A[j];
			 st=true;
			 falsecnt+=1;
		  }
		}
		if(st) {
		    check[i]=false;	
			ans+=1; 
		}
	 }
	 System.out.println();
	 for(i=0;i<n;i++) {
		 if(check[i]) ans+=1;
		 System.out.println(check[i]+" ");; 		 
	 }
	 System.out.println();
	 if(ans==0) System.out.println(n);
	 else System.out.println(ans);
	 
	return 0;
	}
	
	public static void main(String[] args) {
	  solve(new int[]{8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 
			  12, 16, 3, 8, 17, 12, 5, 3, 14, 13, 3, 2, 17, 19, 16,
			  8, 7, 12, 19, 10, 13, 8, 20, 16, 15, 4, 12, 3 });
		
	}

}
