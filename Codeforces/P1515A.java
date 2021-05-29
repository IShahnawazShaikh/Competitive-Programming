import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1515A {
	static FastReaderP1515A in = new FastReaderP1515A();

	public static void main(String... arg) {
		System.out.println("TESt");
		int test = i();
		while (test-- > 0) {
			int n = i();
			int x = i();
			int ar[] = inputIntegerArray(n);
			int i, w = 0, m = n;
			ArrayList<Integer> list = new ArrayList<>();
			i = 0;
			boolean st=false,st2=false;
			while (m != 0) {
				if(i==n){
				 	
				 if(st){
					 st2=true;
				   break;
				 }
				 st=true;
				}
				i = i % n;
				if (ar[i] == -1) {
					i++;
					continue;
				}
				if (w + ar[i] != x) {
					list.add(ar[i]);
					w+=ar[i];
					ar[i] = -1;
					m -= 1;
					
				}
				i++;
			}
			if(st2) System.out.println("NO");
			else {
				System.out.println("YES");
				for(int p: list)
				    System.out.print(p+" ");
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

class FastReaderP1515A {
	BufferedReader br;
	StringTokenizer st;

	public FastReaderP1515A() {
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
