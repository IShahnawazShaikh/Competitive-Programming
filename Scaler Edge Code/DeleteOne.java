
public class DeleteOne {
   private static int solve(int[] ar) {
	 int n=ar.length;
	 if(n==1) return Math.max(ar[0],ar[1]);
	 int[] prefixGCD=new int[n];  
	 int[] suffixGCD=new int[n];  
	 
	 prefixGCD[0]=ar[0];
	 suffixGCD[n-1]=ar[n-1];
	 int i;
	 for(i=1;i<n;i++) prefixGCD[i]=gcd(ar[i],prefixGCD[i-1]);
	 
	 for(i=n-2;i>=0;i--) suffixGCD[i]=gcd(ar[i],suffixGCD[i+1]);
	 int ans=gcd(prefixGCD[0],suffixGCD[2]);
	 for(i=2;i<n-1;i++)  ans=Math.max(ans,gcd(prefixGCD[i-1],suffixGCD[i+1]));
		 
	 
	   
	 System.out.println(ans);
	 return 0;  
   }
   public static int gcd(int a,int b) {
	  if(a==0) return b;
	  return gcd(b%a,a);
   }
	public static void main(String[] args) {
		
      solve(new int[] {5, 15, 30});
		
		
	}

}
