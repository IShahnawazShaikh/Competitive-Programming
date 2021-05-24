import java.util.ArrayList;

public class PowerOfThreeSegment2 {
	int[] segment = null;

	public int[] solve(String A, int[][] Q) {
		int i, n = A.length(), q = Q.length;
		segment = new int[4 * n];
		builSegmentTree(A, 0, 0, n - 1);
		ArrayList<Integer> list = new ArrayList<>();
		
//		for (i = 0; i < 9; i++)
//			System.out.print(segment[i] + " ");
//		System.out.println();

		for (i = 0; i < q; i++) {
			int val = -1;
			if (Q[i][0] == 0) {
				int L = Q[i][1] - 1;
				int R = Q[i][2] - 1;
				val = search(0, 0, n - 1, L, R);
				val = (val * modInverse(power(2, n - 1 - R, 3), 3)) % 3;

			} else {
				update(0, 0, n - 1, Q[i][1] - 1,n);
			}
			list.add(val);
		}
		System.out.println(list);

		int ans[] = new int[list.size()];
		for (i = 0; i < list.size(); i++)
			ans[i] = list.get(i);
		return new int[] {};
	}
	public void builSegmentTree(String s, int index, int left, int right) {
		if (left == right) {
			segment[index] = ((s.charAt(left) - '0') * power(2, s.length()-1-left, 3)) % 3;
			return;
		}
		int mid = (left + right) / 2;
		builSegmentTree(s, 2 * index + 1, left, mid);

		builSegmentTree(s, 2 * index + 2, mid + 1, right);

		segment[index] = (segment[2 * index + 1] + segment[2 * index + 2]) % 3;
	}

	private void update(int index, int left, int right, int uIndex,int n) {
		if (left == right) {
			segment[index] = (1 * power(2, n-1-left, 3)) % 3;
			return;
		}
		int mid = (left + right) / 2;
		if (uIndex <= mid)
			update(2 * index + 1, left, mid, uIndex,n);
		else
			update(2 * index + 2, mid + 1, right, uIndex,n);

		segment[index] = (segment[2 * index + 1] + segment[2 * index + 2]) % 3;
	}

	private int search(int index, int left, int right, int L, int R) {
		if (L > right || R < left)
			return 0;
		else if (left >= L && right <= R)
			return segment[index];
		int mid = (left + right) / 2;
		int leftval = search(2 * index + 1, left, mid, L, R);
		int rightval = search(2 * index + 2, mid + 1, right, L, R);

		return (leftval + rightval) % 3;
	}

	public int power(int x, int y, int MOD) {
		if (y == 0)
			return 1;
		if (y == 1)
			return x;

		int temp = power(x, y / 2, MOD) % MOD;
		temp = (temp * temp) % MOD;
		if (y % 2 == 1) {
			temp = (temp * x) % MOD;
		}
		return temp;
	}

	private int modInverse(int power, int MOD) {
		return power(power, MOD - 2, MOD);
	}
	public static void main(String[] args) {
		PowerOfThreeSegment2 obj = new PowerOfThreeSegment2();
		int[][] Q = {{0, 1, 2},{1, 6, -1},{0, 5, 6},{1, 2, -1},{0, 7, 9}};
		obj.solve("0100111001", Q);

	}

}
