
public class StackingCubes {
	public static int solve(int A) {
		int i = 1;
		int p = A - 1;
		int cnt = 0;
		while (i != p) {
			if (A % (i + p) == 0){
				System.out.println("if: "+i+" "+p);	
			 cnt += 1;
			}
			else System.out.println("else: "+i+" "+p);
			p -= 1;
		}
		
		System.out.println(cnt);
		return cnt;
	}

	public static void main(String[] args) {
		solve(4);
	}

}
