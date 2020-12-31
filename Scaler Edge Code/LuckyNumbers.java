import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LuckyNumbers {
  
  	public static boolean isPrime[];
	public static int spf[];
	public static void seive(int num) {
		isPrime=new boolean[num+1];
		spf=new int[num+1];
		
		Arrays.fill(isPrime,true);
		isPrime[0]=false;
		isPrime[1]=false;
		int i,j;
		for(i=2;i*i<=num;i++) {
			
			if(isPrime[i]) {
				spf[i]=i;
				for(j=i*i;j<=num;j+=i) {
					isPrime[j]=false;
					if(spf[j]==0) spf[j]=i;
				}	
			}
		}
	for(i=0;i<num;i++) if(isPrime[i] && spf[i]==0) spf[i]=i;
	
//	for(i=0;i<num;i++) {
//		System.out.print(i+" ");
//	}
//	System.out.println();
//	for(i=0;i<num;i++) {
//		System.out.print(spf[i]+" ");
//	}
//	System.out.println();
	
		
}
private static int solve(int num) {
   seive(num);
   if(num<6) return 0;
   int x,i;
   int ans=1;
  
   for(i=8;i<=num;i++) {
     if(isPrime[i]) continue;  
     Set<Integer> set=new HashSet<Integer>();
	 int p=spf[i];
	 x=i;
	 
	//System.out.println("Number "+i+" spf: "+p);
	 
	 while(p*p<=x) {
		
	   while(x%p==0) {
		   x/=p;
		   set.add(p);
	   }
	  if(x!=1) p=spf[x];
	 }
	 if(x!=1) set.add(x);
	 if(set.size()==2)  ans+=1;
	 
   }
//   System.out.println(ans);
  return ans;
}
public static void main(String[] args) {
	solve(40);

	}

}
