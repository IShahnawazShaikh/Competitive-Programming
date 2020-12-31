import java.util.ArrayList;

public class PowerOf3Appr2 {
	
	private static void solve(int num) {
	  
		ArrayList<Integer> ans = new ArrayList<Integer>();
	     
	     int pow = 1;
	     while(num>0){
	         int times = num%3;
	         while(times > 0){
	             ans.add(pow);
	             times--;
	         }
	         pow *= 3;
	         num /= 3;
	     }
	     System.out.println(ans);
	}
	
  public static void main(String...x) {
	solve(20);  
  }

}
