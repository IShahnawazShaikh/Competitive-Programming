import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class P1490A {
	static FastReaderP1490A in=new FastReaderP1490A();
	
	public static void main(String...x){
	  int test=i();
	  while(test-->0){
	   int n=i(); 
	   int ar[]=inputIntgerArray(n);
	   int i;
	   int cnt=0;
	   for(i=0;i<n-1;i++){
		 int mx=Math.max(ar[i],ar[i+1]);
		 int mn=Math.min(ar[i],ar[i+1]);
		 float condition=(1F*mx)/mn;
		 if(condition>2){		 
		   while(condition>2){
			 cnt+=1;
			 if(mx%2==0) mx=mx/2;
			 else mx=mx/2+1;	 
			  condition=(1F*mx)/mn;
			 }
		 }
	   }
	   System.out.println(cnt);	
	  }
	  
	 }
	
	static int i(){return in.nextInt();}
 
	static long l(){return in.nextLong();}
	
	static String string(){return in.nextLine();}
	
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
class FastReaderP1490A{
	BufferedReader br;
	StringTokenizer st;
	public FastReaderP1490A()
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
