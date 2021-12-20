
public class PeriodOfString {
    public static int solve(String A) {
     int i,n=A.length();
     int ans=n;
     int Z[]=new int[n];
     initializeZArray(A,Z);
     
     //for(i=0;i<n;i++) System.out.print(Z[i]+" ");
     for(i=0;i<n;i++) {
      if(Z[i]+i==n) {
    	  ans=i;
    	 break; 
      }
     }
     System.out.println(ans);
     return ans;	
    }
  private static void initializeZArray(String s, int[] z) {
   int i,n=s.length();
   int p=0,l=0,r=0;
   for(i=1;i<n;i++){
   if(i>r){
     l=i;
	 r=i;
	 p=0;
	 while(r<n && s.charAt(p)==s.charAt(r)){
	    p++; r++;	
	 }
	 r--;	
	z[i]=r-l+1;	
   }
   else{
	  int k=i-l;
	  if(z[k]<r-i+1) z[i]=z[k];
	  else{
		 l=i;
		 p=r-l;
		 while(r<n && s.charAt(p)==s.charAt(r)){
			p++; r++; 
		 }
		 r--;
		 z[i]=r-l+1;
	  }
   }
  }
 }
  public static void main(String[] args) {
	  solve("abababababb");

 }

}
