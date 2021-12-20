public class OddEvenSubsequence{
private static int solve(int [] ar){
int i;
boolean odd=false,even=false;
if(ar[0]%2==0) odd=true;	
else even=true;
int ans=1;

for(i=1;i<ar.length;i++){
 if(ar[i]%2!=0 && odd){
    ans+=1;
    even=true;
    odd=false;
 }
 else if(ar[i]%2==0 && even){
   odd=true;
   even=false;
   ans+=1;
 }
 else continue;
}  
return ans;
}
public static void main(String...x){
    int ar[]={2, 2, 2, 2, 2};
    System.out.println(solve(ar));
  }	
}