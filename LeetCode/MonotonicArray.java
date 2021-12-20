/*An array A is monotone increasing if for all i <= j, A[i] <= A[j]. 
 *  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].*/

public class MonotonicArray {
  public static boolean isMonotonic(int[] ar) {
  int i;
  int n=ar.length;
  boolean increase=false,decrease=false;
  
  for(i=0;i<n-1;i++) {
	  if(ar[i]>ar[i+1]) {
		  decrease=true;
		  break;
	  }
	  else if(ar[i]<ar[i+1]) {
		  increase=true;
		  break;
	  }
	  else continue;
  }
  for(i=i;i<n-1;i++) {
	if(increase) {
		if(ar[i]>ar[i+1]) return false;
	}
	else {
		if(ar[i]<ar[i+1]) return false;
	}
  }
         
  return true;
 } 
 	
  public static void main(String[] args) {
	
	int ar[]= {2,1,2};
	System.out.println(isMonotonic(ar));
	
		

 }

}
