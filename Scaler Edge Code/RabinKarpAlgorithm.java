
public class RabinKarpAlgorithm {
  public static void solve(String s,String text){
   int MOD=1000000007;
   int k=26;
   long hashS=0,hashT=0;
   int n=s.length(),m=text.length();
   long power[]=new long[n];
   int i;
   long pow=1;
   for(i=0;i<n;i++){
	  power[i]=pow;
	  pow*=k;
	  pow%=MOD;
   }
   for(i=0;i<n;i++){
	 hashS=(hashS+s.charAt(i)*power[n-i-1])%MOD;
	 hashT=(hashT+text.charAt(i)*power[n-i-1])%MOD;
   }
   int count=0;
   if(hashS==hashT && text.substring(0,n).equals(s)) count+=1;
   
   for(i=1;i<=m-n;i++){
	 hashT=(hashT-text.charAt(i-1)*power[n-1]+MOD)%MOD;
	 hashT=(hashT*k)%MOD;
	 hashT=(hashT+text.charAt(i+n-1))%MOD;
	 if(hashS==hashT && text.substring(i,n+i).equals(s)) count+=1;
   }
   
   System.out.println(count);
  }
  public static void main(String[] args) {
	solve("abc","abcabcabccc");

 }

}
