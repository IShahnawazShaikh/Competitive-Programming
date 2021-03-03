import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1472B {
	static FastReaderP1472B in=new FastReaderP1472B();
	
	public static void main(String...x){
	// System.out.println("TESt");
	  int test=i();
	  while(test-->0){
	   int n=i(); 
	   int ar[]=inputIntgerArray(n);
	   int i,one=0,two=0;
	   for(i=0;i<n;i++){
		 if(ar[i]==1) one+=1;
		 else two+=1;
	   }
	   
	   if(one%2==0){
		 if(two%2==0) System.out.println("YES");
		 else{
		  if(one>0) System.out.println("YES");
		  else System.out.println("NO");
		 } 
	   }
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
class FastReaderP1472B{
	BufferedReader br;
	StringTokenizer st;
	public FastReaderP1472B()
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

