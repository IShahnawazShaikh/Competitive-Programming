package scaler;

import java.util.Arrays;

public class FloydWarshallAlgorithm {
	public static int[][] solve(int[][] A) {
        int n=A.length;
		int[][] B=new int[n][n];
		for(int[] arr: B) Arrays.fill(arr, Integer.MAX_VALUE);
		for(int i=0;i<n;i++) {
		   	for(int j=0;j<n;j++) {
		   	  if(A[i][j]==-1) continue;
		   	  else B[i][j]=A[i][j];
		   	}
		}
		
		for(int k=0;k<n;k++) {
			for(int u=0;u<n;u++) {
				for(int v=0;v<n;v++) {
					if(B[u][v]>(1l*B[u][k]+1l*B[k][v])) B[u][v]=B[u][k]+B[k][v];
				}
			}
		}
		for(int i=0;i<n;i++) {
		   	for(int j=0;j<n;j++) {
		   	  if(B[i][j]==Integer.MAX_VALUE)  B[i][j]=-1;
		   	}
		}
		
		
		for(int[] arr: B) System.out.println(Arrays.toString(arr));
		return B;
		
	}

	public static void main(String... x) {
		int[][] A = { { 0, 50, 39 }, { -1, 0, 1 }, { -1, 10, 0 } };
		
		solve(A);

	}

}
