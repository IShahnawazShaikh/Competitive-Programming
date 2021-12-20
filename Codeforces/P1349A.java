import java.util.*;
public class P1349A{
  private static long gcd(long a,long b){
    if(b==0) return a;
    return gcd(b,a%b);
}
// private static int lcm(int a,int b){

//   return a*b/gcd(a,b);
// }
public static void main(String...x){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long ar[]=new long[n];
    int i,j;
    for(i=0;i<n;i++){
      ar[i]=sc.nextInt();
    }
    long pre[]=new long[n];
    pre[n-1]=ar[n-1];
    for(i=n-2;i>=0;i--) pre[i]=gcd(pre[i+1],ar[i]);
    long ans=(ar[0]*pre[1])/pre[0];

    for(i=1;i<n-1;i++) ans=gcd(ans,(ar[i]*pre[i+1])/pre[i]);
    System.out.println(ans);
  }	
}