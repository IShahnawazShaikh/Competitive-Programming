
public class SingleNumber {
	 public static int singleNumber(final int[] A) {
	   
		 int i;
		 int ans=0;
		 for(i=0;i<A.length;i++){
			 ans^=A[i];
		 }
		 System.out.println(ans);
		 
		return 0; 
	 }
	public static void main(String[] args) {
		singleNumber(new int[]{1, 2, 3, 1, 2, 4});

	}

}
