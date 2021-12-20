import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class P1490C {
	static FastReaderP1490C in=new FastReaderP1490C();
	public static void main(String...p){
	  //System.out.println("test");	
	  int test=i();
	  while(test-->0){
	   long x=l();
	   long low=1,high=10000;
	   boolean st=false;
	   while(low<=high){
		long a=low*low*low;
		long b=high*high*high;
		if(a+b==x){
		 st=true;	
		 break;
		}
		else if(a+b<x) low++;
		else high--;
		   
	   }
	   if(st) System.out.println("YES");
	   else System.out.println("NO");
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
class FastReaderP1490C{
	BufferedReader br;
	StringTokenizer st;
	public FastReaderP1490C()
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
