import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1492B {
	static FastReaderP1492B in = new FastReaderP1492B();

	public static void main(String... x) {
		int test = i();
		while (test-- > 0) {
			int n = i();
			int ar[] = inputIntgerArray(n);
			int i, j;
			int temp[] = new int[n];
			temp[0]=ar[0];
			for (i = 1; i < n; i++) temp[i]=Math.max(ar[i],temp[i-1]); 	
			
			List<List<Integer>> ans=new ArrayList<List<Integer>>();
			
			List<Integer> list=new ArrayList<>();
	
			for(i=n-1;i>=0;i--){
			 if(ar[i]!=temp[i]){
				 list.add(ar[i]);
			 }
			 else {
				list.add(ar[i]); 
				ans.add(list);
			    list=new ArrayList<>();
			 }	
			}
			for(List<Integer> al: ans){
			 for(i=al.size()-1;i>=0;i--){
				System.out.print(al.get(i)+" "); 
			 }				
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

class FastReaderP1492B {
	BufferedReader br;
	StringTokenizer st;

	public FastReaderP1492B() {
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
