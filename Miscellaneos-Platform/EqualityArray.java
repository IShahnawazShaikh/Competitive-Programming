import java.util.Arrays;
public class EqualityArray{
private static int solve(int [] ar){
int i;
int max=Arrays.stream(ar).max().getAsInt(); 
int ans=0;
for(i=0;i<ar.length;i++) ans+=Math.abs(ar[i]-max); 
return ans;
}
public static void main(String...x){
    int ar[]={2, 4, 1, 3, 2};
    System.out.println(solve(ar));
  }	
}