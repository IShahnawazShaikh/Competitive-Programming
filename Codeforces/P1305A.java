import java.util.Arrays;
import java.util.Scanner;

public class P1305A {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int test=sc.nextInt();
		   while(test>0) {
			int i,n;
			n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(i=0;i<n;i++) a[i]=sc.nextInt();	
			for(i=0;i<n;i++) b[i]=sc.nextInt();	
			Arrays.sort(a);
			Arrays.sort(b);
			for(i=0;i<n;i++) System.out.print(a[i]+" ");	
			System.out.println();
			for(i=0;i<n;i++) System.out.print(b[i]+" ");
			System.out.println();
			test-=1;   
		   }
		
		

	}

}
