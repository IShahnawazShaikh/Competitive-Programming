class PairSumDivByM{

public static int solve(int ar[],int B){
 int i,MOD=1000000007;
 int cnt[]=new int[B];
for(i=0;i<ar.length;i++) cnt[ar[i]%B]=cnt[ar[i]%B]+1;


long ans=(1L*cnt[0]*(cnt[0]-1))/2;
for(i=1;i<=B/2;i++){
   if(B-i==i)   ans=ans+(1L*cnt[i]*(cnt[i]-1))/2;
   else   ans=ans+(1L*cnt[i]*cnt[B-i]);
   ans=ans%MOD; 
 }
return (int)ans;
}
public static void main(String...x){

 solve(new int[]{ 5, 17, 100, 11},28);

}


}