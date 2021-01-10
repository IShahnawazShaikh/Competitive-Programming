import java.util.Scanner;

public class P188B {
	
	public static void main(String...m){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("insert");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int i;
		for(i=0;i<n;i++) a[i]=sc.nextInt();
		for(i=0;i<n;i++) b[i]=sc.nextInt();
		long ans=0;
		for(i=0;i<n;i++){
		  ans+=(a[i]*b[i]);	
		}
		
		if(ans==0) System.out.println("Yes");
		else System.out.println("No");
	}
	
}
