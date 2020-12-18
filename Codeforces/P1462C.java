import java.util.Scanner;

public class P1462C {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("insert1");
		int t=sc.nextInt();
		while(t>0) {
		 int n=sc.nextInt();
		 int x=n;
		 int i;
		 String s="";
		 if(x<10) {System.out.println(x); continue;}
		 int ans=0;
		 for(i=9;i>=1;i--) {
			x=x-i; 
			s=i+s;
			ans+=i;
			if(x<i) {
				s=x+s;
				ans+=x;
				break;
			}
		 }
		 if(ans==n)
		 System.out.println(s);
		 else System.out.println(-1);
		 
		 t--;	
		}

	}

}
