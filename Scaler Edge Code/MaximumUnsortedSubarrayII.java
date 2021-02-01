public class MaximumUnsortedSubarrayII {
  private static int[] subUnsort(int ar[]) {
  int i,n=ar.length;
  int r=0,l=0;
  if(n==1) return new int[]{-1};
  int max=ar[0];
  int min=Integer.MAX_VALUE;
  for(i=1;i<n;i++){
	 if(max> ar[i]) {
		 r=i;
		 min=Math.min(min,ar[i]);
	   }
     else max=Math.max(max, ar[i]);
	  
  }
  if(min==Integer.MAX_VALUE) return new int[]{-1};
  for(i=0;i<n;i++){
    if(ar[i]>min) {l=i; break;}
  }
   System.out.println(l+" "+r);
   return new int[]{l,r};
  }
 public static void main(String[] args) {
	int ar[]= {3,3,4,5,5,9,11,13,14,15,15,16,15,20,16};	
	subUnsort(ar);	

 }

}
//3,3,4,5,5,9,11,13,14,15,15,16,15,20,16
