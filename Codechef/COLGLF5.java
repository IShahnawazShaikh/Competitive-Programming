import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class COLGLF5{
	static CodechefClass in=new CodechefClass();
	public static void main (String[] args) throws java.lang.Exception{
      //System.out.println("insert");
	  int t=i();
      while(t-->0){
       int n=i();
       int m=i();
       int F[]=inputIntgerArray(n);
       int C[]=inputIntgerArray(m);
       int i;
//       for(i=0;i<n;i++) System.out.print(F[i]+" ");
//       System.out.println();
//       for(i=0;i<m;i++) System.out.print(C[i]+" ");
//       System.out.println();
//       System.out.println();
       int ans=0,p1=0,p2=0;
       boolean st=false;
       
       while(p1<n && p2<m){
    	//System.out.println(p1+" "+p2);   
    	if( C[p2]<F[p1]){
    	  //System.out.println("if: ");
          if(st==false) ans+=1;
         
          while(p2<m && C[p2]<F[p1]) p2+=1;
          st=true;                                        
    	}
    	else{
    	 //System.out.println("else: ");	
    	 if(st==true) ans+=1;	
    	 while(p1<n && F[p1]< C[p2]) p1+=1; 
    	 st=false;
    	}
          
       }
       if(p1<=n-1 && st==true) ans+=1;
       else if(p2<=m-1 && st==false) ans+=1;
       System.out.println(ans);
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
class COLGLF5Class{
	BufferedReader br;
	StringTokenizer st;
	public COLGLF5Class()
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