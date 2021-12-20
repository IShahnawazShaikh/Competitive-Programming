//link: https://codeforces.com/contest/1478/problem/A 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1478A {
	static FastReader1478A in=new FastReader1478A();
	public static void main(String...x){
	  int test=i();
	  while(test-->0){
	   int n=i(); 
	   int ar[]=inputIntgerArray(n);
	   int i,ans=1,cnt=1;
	   for(i=0;i<n-1;i++){
		  if(ar[i]==ar[i+1]) cnt+=1;
		  else {
			  ans=Math.max(ans,cnt);
			  cnt=1;
		  }
	   }
	  System.out.println(Math.max(ans,cnt)); 
	  }
    }  //main
	
   static int i(){return in.nextInt();}
 
	static long l(){return in.nextLong();}
 
	static int[] inputIntgerArray(int N){
		int A[]=new int[N];
		for(int i=0; i<N; i++)A[i]=in.nextInt();
		return A;
	}
	static long[] inputLongArray(int N)     {
		long A[]=new long[N];
		for(int i=0; i<A.length; i++)A[i]=in.nextLong();
		return A;
	}	
}
class FastReader1478A{
	BufferedReader br;
	StringTokenizer st;
	public FastReader1478A()
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
