import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class P1490B {
	static FastReaderP1490B in=new FastReaderP1490B();
	
	public static void main(String...x){
	  //System.out.println("test");	
	  int test=i();
	  while(test-->0){
	   int n=i(); 
	   int ar[]=inputIntgerArray(n);
	   int i;
	   int cnt=0;
	   int freq[]=new int[3];
	   for(i=0;i<n;i++) freq[ar[i]%3]++;
	   int a=freq[0];
	   int b=freq[1];
	   int c=freq[2];
	   
	   //System.out.println(freq[0]+" "+freq[1]+" "+freq[2]);
	   
	   while(true){
		if(a==b && b==c) break;   
	    int mx=Integer.MIN_VALUE;
	    int mxidx=-1;
	    if(freq[0]>mx){
	      mx=freq[0];
	      mxidx=0;
	    }
	    if(freq[1]>mx){
		   mx=freq[1];
		   mxidx=1;
		 } 
	    if(freq[2]>mx){
	      mx=freq[2];
	      mxidx=2;
	    }
	    //System.out.println(mxidx+" "+(mxidx+1)%3);
	    freq[(mxidx+1)%3]++;
	    freq[mxidx]--;
		cnt+=1;
		a=freq[0];
		b=freq[1];
		c=freq[2];   
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
class FastReaderP1490B{
	BufferedReader br;
	StringTokenizer st;
	public FastReaderP1490B()
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
