
public class GoodIntegers {
	public static int solve(int A, int B) {
		int low = 1, high = A, ans = -1;
		int mid = 0;
		while (low <= high) {
			mid = (high - low) / 2 + low;
			if (check(mid, B)) {
				ans = mid;
				high = mid - 1;
			} else
				low = mid + 1;
		}
	// System.out.println(A-ans+1);
		return (ans == -1) ? 0 : A - ans + 1;
	}
	public static boolean check(int mid, int B) {
		int cnt = 0;
		int t = mid;
		while (t > 0) {
			cnt += t % 10;
			t /= 10;
		}
		if (mid - cnt >= B)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		solve(25, 20);
	}

}
