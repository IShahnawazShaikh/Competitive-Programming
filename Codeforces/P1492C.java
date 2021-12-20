import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1492C {
	static FastReaderP1492C in = new FastReaderP1492C();

	public static void main(String... x) {
	//System.out.println("TEST");
	  
	 int n=i();
	 int m=i();
	 String s=string();
	 String t=string();
	 int i;
	 int p1[]=new int[m];
	 int p2[]=new int[m];
	 
	 int idx=0;
	 for(i=0;i<n;i++){
	   if(s.charAt(i)==t.charAt(idx)){
		  p1[idx]=i;
		  idx+=1; 
	   }
	   if(idx==m) break;
	 }
	 

	 idx=m-1;
	 for(i=n-1;i>=0;i--){
	   if(s.charAt(i)==t.charAt(idx)){
		  p2[idx]=i;
		  idx-=1; 
	   }
	   if(idx==-1) break;
	 }
	 int ans=0;
	 for(i=0;i<m-1;i++){
		ans=Math.max(p2[i+1]-p1[i],ans);
	 }
	
	 System.out.println(ans);
	 
			
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

class FastReaderP1492C {
	BufferedReader br;
	StringTokenizer st;

	public FastReaderP1492C() {
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
