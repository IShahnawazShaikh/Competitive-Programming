
public class AmazingSubarrays {
  public static int solve(String A) {
   int i,n=A.length();
   long ans=0;
   int MOD=10003;
   for(i=0;i<n;i++){
	char ch=A.charAt(i);
    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
     ans+=n-i;
     ans%=MOD;
     }	        
    }
   return (int) (ans%MOD);
  }
	public static void main(String[] args) {
	 solve("ABEC");

	}

}
