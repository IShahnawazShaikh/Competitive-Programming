public class MaximumUnsortedSubarray {
  private static int[] subUnsort(int ar[]) {
  int i,n=ar.length;
  int max=ar[0];
  int last=0;
  int mn=1000000;
  for(i=0;i<n-1;i++) {
	if(ar[i]>ar[i+1]) {
		last=i+1;
		mn=Math.min(mn,ar[i+1]);
	}
	if(max>ar[i]) last=i;
	max=Math.max(ar[i],max);  	  
  }
  if(max>ar[n-1]) last=n-1;
  if(last==0) return new int[] {-1};
  int first=0;
   for(i=0;i<n;i++) {
	  if(ar[i]>mn) {
		  first=i;
		  break;
	  }
  }
 System.out.println(first+" "+last);
  if(first==0 && last==0) return new int[] {-1};
  return new int[] {first,last};
  }
 public static void main(String[] args) {
	int ar[]= {4, 14, 10, 13, 18, 13, 10, 19, 18, 10, 20, 19, 19, 13, 13, 13, 10};	
	subUnsort(ar);	

 }

}
//3,3,4,5,5,9,11,13,14,15,15,16,15,20,16
