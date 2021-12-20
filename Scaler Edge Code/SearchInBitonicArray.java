public class SearchInBitonicArray {
 public static int solve(int[] A, int B) {
  int k=getBitonicPoint(A,0,A.length-1);
  //System.out.println("k: "+k +" "+A[k]);	 
  int ans=BS(A,0,k,B);
  //System.out.println("index1: "+ans);
  if(ans==-1) {
    ans=BS2(A,k+1,A.length-1,B);	  
  }

  return ans;
  
 }
 public static int BS(int[] A,int low,int high,int B){
    int mid=0;
	while(low<=high){
     mid=(high-low)/2+low;
     
     if(A[mid] < B){
       low=mid+1;	 
     }
     else if(A[mid] > B){
        high=mid-1;	 
     }
     else return mid;
    }
	return -1;	 
 }
 public static int BS2(int[] A,int low,int high,int B){
	    int mid=0;
		while(low<=high){
	     mid=(high-low)/2+low;
	     
	     if(A[mid] < B){
	       high=mid-1;	 
	     }
	     else if(A[mid] > B){
	        low=mid+1; 
	     }
	     else return mid;
	    }
		return -1;	 
	 }
 
 public static int getBitonicPoint(int[] A,int low,int high){
    int mx=A[0];
    int mid=0,k=-1;
    while(low<=high){
      mid=(high-low)/2 + low;
      if(A[mid]>mx){
    	low=mid+1;
    	mx=Math.max(A[low],A[mid]);
    	
    	if(A[mid] > A[low]) {k=mid; mx=A[mid];}
    	else {k=low; mx=A[low];}
      }
      else high=mid-1;
    }
   return k;	 
 }
 public static void main(String[] args) {
   solve(new int[]{5, 6, 7, 8, 9, 10, 3, 2, 1},30);	
 }

}
