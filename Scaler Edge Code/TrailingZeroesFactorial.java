
public class TrailingZeroesFactorial {
	private static void solve(int num) {
		int five=5,cnt=0;
		while(num>=five){
		 System.out.println(num/five+" five: "+five);
		 cnt+=num/five;
		 five*=5;
		}
		
		System.out.println("ans: "+cnt);
		
	}
	
	public static void main(String[] args) {
		solve( 3125);

	}

	

}
