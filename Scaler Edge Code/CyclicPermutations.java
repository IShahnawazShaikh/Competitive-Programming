public class CyclicPermutations {
  public static int solve(String A, String B) {
  int i,n=B.length();
  long power[]=new long[n];
  int MOD=1000000007;
  long pow=1;
  for(i=0;i<n;i++){
	  power[i]=pow;
	  pow*=2;
	  pow%=MOD;
   }
  //for(i=0;i<n;i++) System.out.print(power[i]+" ");
  long hashA=0,hashB=0;
  for(i=0;i<B.length();i++){
   hashA=(hashA+((A.charAt(i)-'0')*power[n-i-1]))%MOD;
   hashB=(hashB+((B.charAt(i)-'0')*power[n-i-1]))%MOD;
  }
  int cnt=0;
  System.out.println(hashA+" "+hashB);
  if(hashA==hashB) cnt+=1;
  for(i=1;i<n;i++){
	hashB=((hashB-((B.charAt(i-1)-'0')*power[n-1])+MOD))%MOD;
	hashB=(hashB*2)%MOD;
	hashB=hashB+(B.charAt(i-1)-'0');
	
	if(hashB<0) hashB=(hashB+MOD)%MOD;
	if(hashB==hashA){
	  //System.out.println("if: "+hashB);	
	  cnt+=1;
	}
  System.out.println(hashB);	
  }
  System.out.println(cnt);
  return 0;
  }
  public static void main(String[] args) {
	 solve("1001","0011");

  }

}
