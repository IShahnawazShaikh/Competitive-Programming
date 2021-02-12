import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class P1478B {
public static boolean solve(long n,long d){
    long p=0;
	do{
	 p=n%10;
	 if(p==d) return true;
	 n/=10;
	}while(n!=0);
	return false;
}
static FastReaderP1478B in = new FastReaderP1478B();
public static void main(String... x) {
 // System.out.println("ok:");
  int test = i();
  while (test-- > 0) {
    int q=i();
    int d=i();
    while(q-->0){
     int num=i();
     int qout=num/d;
     int rem=num%d;
     int i;
     boolean st=false;
     for(i=1;i<=qout;i++){
       	st=solve(rem+ (d*i),d);
       	if(st) break;
     }
     if(st) System.out.println("YES");
     else System.out.println("NO");
   }       
  }
  }// main

static int i() {
		return in.nextInt();
	}

	static long l() {
		return in.nextLong();
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

class FastReaderP1478B {
	BufferedReader br;
	StringTokenizer st;

	public FastReaderP1478B() {
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
