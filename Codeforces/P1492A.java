import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1492A {
	static FastReaderP1492A in = new FastReaderP1492A();

	public static void main(String... x) {
		//System.out.println("TEST");
		int test = i();
		while (test-- > 0) {
			long p = l();
			long a = l();
			long b = l();
			long c = l();

			if (p == a || p == b || p == c)
				System.out.println(0);
			else {
				long t=0;
			    if(p%a==0) t = (p / a);
			    else t = (p / a) + 1;
				long ans = t * a - p;
				if(p%b==0) t = (p / b);
				else t = p / b + 1;
				ans = Math.min(ans, (t * b) - p);
				if(p%c==0) t = (p / c);
				else t = p / c + 1;
				ans = Math.min(ans, (t * c) - p);
				System.out.println(ans);
			}
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

	static int[] inputIntgerArray(int N) {
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

class FastReaderP1492A {
	BufferedReader br;
	StringTokenizer st;

	public FastReaderP1492A() {
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
