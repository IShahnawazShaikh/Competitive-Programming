
public class KthSmallestElement {
	 public static int kthsmallest(final int[] A, int B) {
	  int i,j,n=A.length;
	  int idx=-1;
	  for(i=0;i<B;i++){
		  int mn=Integer.MAX_VALUE;
		 for(j=i;j<n;j++){
			 if(mn>A[j]) {
				idx=j;
				mn=A[j];
			 }
		 }
		A[i]=(A[i]+A[idx])-(A[idx]=A[i]); 
	  }
	  //for(i=0;i<n;i++) System.out.print(A[i]+" ");	 
		 
	  return A[B-1];       
	 }
	public static void main(String[] args) {
	kthsmallest(new int[]{2, 1, 4, 3, 2},3);

	}

}
