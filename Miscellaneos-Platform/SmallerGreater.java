import java.util.Arrays;
public class SmallerGreater{
private static int solve(int [] ar){
int i;
 int cnt=0;

Arrays.sort(ar);
int n=ar.length;
if(ar.length==1 || ar.length==2 || ar[0]==ar[n-1]) return 0;	
for(i=1;i<n;i++){
	if(ar[0]==ar[i]) cnt+=1;
} 
for(i=n-2;i>=0;i--){
  if(ar[n-1]==ar[i]) cnt+=1;
}
return ar.length-cnt-2;
}
public static void main(String...x){
    int ar[]={1,1,1,3,4,4};
    System.out.println(solve(ar));
  }	
}