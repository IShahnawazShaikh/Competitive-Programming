
public class ConsecutiveNumbersSum {
   public static int solve(int A) {
        int k,cnt=0;
	   for(k=1;k<Math.sqrt(2*A);k++) {
		    
		   int t=A-(k*(k-1))/2;
		   if(t%k==0) cnt+=1;
	   }
	   
     System.out.println(cnt);   
     return cnt;
   }
  public static void main(String[] args) {
	
	  solve(15);  
  }

}
