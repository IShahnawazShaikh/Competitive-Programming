
public class SingleNumberSorted {
	 public static int solve(int[] A) {
	      int n=A.length;
	      if(n-1==1) return A[0];
	      if(A[0]!=A[1]) return A[0];
	      if(A[n-1]!=A[n-2]) return A[n-1];
	      int lower=0,upper=A.length-1;
	       int mid=0;
	      while(lower<=upper){
	       mid=(lower+upper)/2;
	        if((mid^1)==mid-1){
	          if(A[mid]!=A[mid-1] && A[mid]!=A[mid+1]) return A[mid];
	          else if(A[mid]!=A[mid-1]) upper=mid-1;
	          else lower=mid+1;
	        }   
	        else{
	         if(A[mid]!=A[mid-1] && A[mid]!=A[mid+1]) return A[mid];
	          else if(A[mid]==A[mid+1]) lower=mid+1;
	          else upper=mid-1;    
	        }
	      }
	     return A[mid];
	    }
	public static void main(String[] args) {
	 solve(new int[]{1,3,3});

	}

}
