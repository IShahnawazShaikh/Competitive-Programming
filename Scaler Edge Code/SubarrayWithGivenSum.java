
public class SubarrayWithGivenSum {
  public static int[] solve(int[] A, int B) {
   int i,p1=0,p2=1,n=A.length;
   if(n==1) if(A[0]==B) return new int[]{B};
   int sum=0;
   boolean st=false;
   sum=A[p1]+A[p2];
   while(p2 < n){   
	if(sum == B) {
     int ans[]=new int[p2-p1+1];
	 for(i=0;i<p2-p1+1;i++) ans[i]=A[p1+i];
	 return ans; 	
	}
	else if(sum < B){
	   p2++;	
      if(p2<n) sum+=A[p2]; 		
	}
	else{
	  sum-=A[p1];
	  p1++;
	}
   }
  for(i=0;i<n;i++) if(A[i]==B) return new int[]{A[i]};
   
  return new int[]{-1};  
  }
  public static void main(String[] args) {
	solve(new int[]{1,5},6);

  }
}
