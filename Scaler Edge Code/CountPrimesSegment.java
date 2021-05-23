import java.util.ArrayList;
import java.util.Arrays;

public class CountPrimesSegment {
	public static int[] segment = null;
	public static boolean[] isPrime = null;

	public int[] solve(int[] A, String[] B, int[] C, int[] D) {
		seive();
		int i, n = A.length, m = B.length;
		segment = new int[4 * n];
		buildSegmentTree(A, 0, 0, n - 1);

		 for(i=0;i<5;i++) System.out.print(segment[i]+" ");
		 System.out.println();

		ArrayList<Integer> list = new ArrayList<>();

		for (i = 0; i < m; i++) {
			if (B[i].equals("A")) {
				list.add(search(0, 0, n - 1, C[i] - 1, D[i] - 1));
			} else {
				int t=0;
				if(isPrime[D[i]]) t=1;
				update(0, 0, n - 1, C[i] - 1,t);
			}
		}
		System.out.println(list);
		n = list.size();
		int ans[] = new int[n];
		for (i = 0; i < n; i++)
			ans[i] = list.get(i);
		return ans;
	}

	public static void buildSegmentTree(int[] A, int index, int left, int right) {
		if (left == right) {

			if (isPrime[A[left]])
				segment[index] = 1;
			else
				segment[index] = 0;
			return;
		}
		int mid = (left + right) / 2;
		buildSegmentTree(A, 2 * index + 1, left, mid);
		buildSegmentTree(A, 2 * index + 2, mid + 1, right);
		segment[index] = segment[2 * index + 1] + segment[2 * index + 2];
	}

	public static int search(int index, int left, int right, int L, int R) {
		if (L > right || R < left)
			return 0;

		if (left >= L && right <= R) {
			return segment[index];
		}
		int mid = (left + right) / 2;
		int a1 = search(2 * index + 1, left, mid, L, R);
		int a2 = search(2 * index + 2, mid + 1, right, L, R);
		return a1 + a2;
	}

	public static void update(int index, int left, int right, int uIndex, int val) {
		if (left == right) {
			segment[index]=val;
			return;
		}
		int mid = (left + right) / 2;
		if (uIndex <= mid) {
			update(2 * index + 1, left, mid, uIndex, val);
		} else {
			update(2 * index + 2, mid + 1, right, uIndex, val);
		}
		segment[index] = segment[2 * index + 1] + segment[2 * index + 2];
	}

	public void seive() {
		int N = 1000000+10;
		isPrime = new boolean[N + 1];
		int i, j, k = (int) Math.sqrt(N);
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (i = 2; i <= k; i++) {
			if (isPrime[i]) {
				for (j = i * i; j <= N; j += i)
					isPrime[j] = false;
			}
		}
	}

	public static void main(String[] args) {
		CountPrimesSegment obj = new CountPrimesSegment();
		obj.solve(new int[] {1, 3, 121, 20, 17, 26, 29}, new String[] {"A", "C", "A" }, new int[] {1,3,1},
				new int[] {7,19,7});

	}

}
