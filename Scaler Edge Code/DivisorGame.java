
public class DivisorGame {
	 public static int solve(int A, int B, int C) {
	 int ans=0;
	  int mx=Math.max(B, C);
	  int mn=Math.min(B, C);
	  
	  int i=1;
	  int num=mx;
	  while(num<=A) {
	   if(num%mn==0)  ans+=1;
	   num=mx*(++i);
	  }
	  System.out.println(i);
	  System.out.println(ans);
	 
	 
	 return ans;       
	 }
	public static void main(String[] args) {
	  solve(12,3,2);	
   
	}

}
