
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class NOBEL{
	static CodechefClass in=new CodechefClass();
	public static void main (String[] args) throws java.lang.Exception{
      System.out.println("insert");
	  int t=i();
      while(t-->0){
       int n=i();
       int m=i();
       int ar[]=inputIntgerArray(n);
       
       int i;
       String ans="No";
       Set<Integer> set=new HashSet();
       for(i=0;i<n;i++) set.add(ar[i]);
       if(set.size()<m) System.out.println("Yes");
       else System.out.println("No");
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
class NOBELClass{
	BufferedReader br;
	StringTokenizer st;
	public NOBELClass()
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