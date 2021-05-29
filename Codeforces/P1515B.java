import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1515B {
	static FastReaderP1515B in = new FastReaderP1515B();

	public static void main(String... arg) {
		System.out.println("TESt");
		int test = i();
		while (test-- > 0) {
			int n = i();
			int val1 = 2, val2 = 4;
			int k = 1;
			boolean st = false;
			while (val1 <= n) {
				k += 2;
				if (val1 == n) {
					st = true;
					break;
				}
				val1 = val1 + 2 * k;
			}

			if (st) {
				System.out.println("YES");
				continue;
			}
			k=1;
			while (val2 <= n) {
				k += 2;
				if (val2 == n) {
					st = true;
					break;
				}
				val2 = val2 + 4 * k;
			}
			if (st) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}

	}

	static int i() {
		return in.nextInt();
	}

	static long l() {
		return in.nextLong();
	}

	static String string() {
		return in.nextLine();
	}

	static int[] inputIntegerArray(int N) {
		int A[] = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = in.nextInt();
		return A;
	}

	static long[] inputLongArray(int N) {
		long A[] = new long[N];
		for (int i = 0; i < A.length; i++)
			A[i] = in.nextLong();
		return A;
	}

}

class FastReaderP1515B {
	BufferedReader br;
	StringTokenizer st;

	public FastReaderP1515B() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
