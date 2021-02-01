import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1476B {
	static FastReader in=new FastReader();
	
	public static void main(String...x){
		//System.out.println("h");
	  int test=i();
	  while(test-->0){
	   int n=i(); 
	   int k=i();
	   int i;
	   int ar[]=inputIntgerArray(n);
	   long sum=ar[0];
	   long ans=0;
	   for(i=1;i<n;i++) {
		 ans=(long)Math.max(ans,(100.0*ar[i]-k*sum+k-1)/k);
		 sum+=ar[i];
	   }
	   System.out.println(ans);
	  }
	 }
	static int i()
	{
		return in.nextInt();
	}
 
	static long l()
	{
		return in.nextLong();
	}
 
	static int[] inputIntgerArray(int N){
		int A[]=new int[N];
		for(int i=0; i<N; i++)
		{
			A[i]=in.nextInt();
		}
		return A;
	}
 
	static long[] inputLongArray(int N)     {
		long A[]=new long[N];
		for(int i=0; i<A.length; i++)A[i]=in.nextLong();
		return A;
	}	
	

}
class FastReader{
	BufferedReader br;
	StringTokenizer st;
	public FastReader()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
	}
 
	String next()
	{
		while(st==null || !st.hasMoreElements())
		{
			try
			{
				st=new StringTokenizer(br.readLine());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}
 
	int nextInt()
	{
		return Integer.parseInt(next());
	}
 
	long nextLong()
	{
		return Long.parseLong(next());
	}
 
	double nextDouble()
	{
		return Double.parseDouble(next());
	}
 
	String nextLine()
	{
		String str="";
		try
		{
			str=br.readLine();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}
}
