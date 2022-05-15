
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class P1632C {
	static PrintWriter out = new PrintWriter(System.out);
	static MyFastReaderP1632C in = new MyFastReaderP1632C();
	static long mod = (long) (1e9 + 7);

	//not done
	public static void main(String[] args) throws Exception {
		System.out.println("Test");
		// Scanner sc=new Scanner(System.in);
		int test = i();
		while (test-- > 0) {

			int a = i();
			int b = i();
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			int cnt = 0;
			while (a<=1000000) {

				// System.out.println(max+" "+min);
				if(a==b) break;
				if (((a | b) == a) || ((a | b) == b)) {
					cnt += 1;
					break;
				}
				if(((a | (b+1)) == a) || ((a | (b+1)) == b+1)) {
					cnt+=2;
					break;
				}

				cnt += 1;
				a += 1;
			}
			int cnt2=0;

			while (b<=1000000) {

				// System.out.println(max+" "+min);
				if(a==b) break;
				if (((a | b) == a) || ((a | b) == b)) {
					cnt2 += 1;
					break;
				}
				if(((b | (a+1)) == a) || ((b | (a+1)) == a+1)) {
					cnt2+=2;
					break;
				}

				cnt2 += 1;
				b += 1;
			}
			out.print(cnt+" "+cnt2);

			out.print("\n");
			out.flush();
		}
		out.close();
	}

	

	static class pair {
		long x, y;

		pair(long ar, long ar2) {
			x = ar;
			y = ar2;
		}
	}

	static void sort(long[] a) // check for long
	{
		ArrayList<Long> l = new ArrayList<>();
		for (long i : a)
			l.add(i);
		Collections.sort(l);
		for (int i = 0; i < a.length; i++)
			a[i] = l.get(i);
	}

	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i : a)
			l.add(i);
		Collections.sort(l);
		for (int i = 0; i < a.length; i++)
			a[i] = l.get(i);
	}

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static class DescendingComparator implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			return b - a;
		}
	}

	static class AscendingComparator implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			return a - b;
		}
	}

	static boolean isPalindrome(char X[]) {
		int l = 0, r = X.length - 1;
		while (l <= r) {
			if (X[l] != X[r])
				return false;
			l++;
			r--;
		}
		return true;
	}

	static long fact(long N) {
		long num = 1L;
		while (N >= 1) {
			num = ((num % mod) * (N % mod)) % mod;
			N--;
		}
		return num;
	}

	static long pow(long a, long b) {
		long mod = 1000000007;
		long pow = 1;
		long x = a;
		while (b != 0) {
			if ((b & 1) != 0)
				pow = (pow * x) % mod;
			x = (x * x) % mod;
			b /= 2;
		}
		return pow;
	}

	static long toggleBits(long x)// one's complement || Toggle bits
	{
		int n = (int) (Math.floor(Math.log(x) / Math.log(2))) + 1;

		return ((1 << n) - 1) ^ x;
	}

	static int countBits(long a) {
		return (int) (Math.log(a) / Math.log(2) + 1);
	}

	static boolean isPrime(long N) {
		if (N <= 1)
			return false;
		if (N <= 3)
			return true;
		if (N % 2 == 0 || N % 3 == 0)
			return false;
		for (int i = 5; i * i <= N; i = i + 6)
			if (N % i == 0 || N % (i + 2) == 0)
				return false;
		return true;
	}

	static long GCD(long a, long b) {
		if (b == 0) {
			return a;
		} else
			return GCD(b, a % b);
	}

	// Debugging Functions Starts

	static void print(char A[]) {
		for (char c : A)
			System.out.print(c + " ");
		System.out.println();
	}

	static void print(boolean A[]) {
		for (boolean c : A)
			System.out.print(c + " ");
		System.out.println();
	}

	static void print(int A[]) {
		for (int a : A)
			System.out.print(a + " ");
		System.out.println();
	}

	static void print(long A[]) {
		for (long i : A)
			System.out.print(i + " ");
		System.out.println();

	}

	static void print(ArrayList<Integer> A) {
		for (int a : A)
			System.out.print(a + " ");
		System.out.println();
	}

	// Debugging Functions END
	// ----------------------
	// IO FUNCTIONS STARTS
	static HashMap<Integer, Integer> getHashMap(int A[]) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int a : A) {
			int f = mp.getOrDefault(a, 0) + 1;
			mp.put(a, f);
		}
		return mp;
	}

	public static Map<Character, Integer> mapSortByValue(Map<Character, Integer> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
		});

		// put data from sorted list to hashmap
		Map<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
		for (Map.Entry<Character, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	static String string() {
		return in.nextLine();
	}

	static int i() {
		return in.nextInt();
	}

	static long l() {
		return in.nextLong();
	}

	static int[] arrI(int N) {
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		return A;
	}

	static long[] arrL(int N) {
		long A[] = new long[N];
		for (int i = 0; i < A.length; i++)
			A[i] = in.nextLong();
		return A;
	}

}

class MyFastReaderP1632C {
	BufferedReader br;
	StringTokenizer st;

	public MyFastReaderP1632C() {
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
