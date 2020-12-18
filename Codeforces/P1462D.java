import java.util.Scanner;

public class P1462D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("insert1");
		int t=sc.nextInt();
		while(t>0) {
		  int i;	
		 int n=sc.nextInt();
		 int ar[]=new int[n];
		 for(i=0;i<n;i++) ar[i]=sc.nextInt();
		 
		 int cnt=0,ans=0,num=ar[0];
		 for(i=1;i<n;i++) {
			 if(ar[i]-num==0) cnt+=1;
			 num=ar[i];
			 ar[i]+=ar[i-1];
		  }
		// for(i=0;i<n;i++) System.out.print(ar[i]+" ");
		 if(cnt==n-1) {
			// System.out.println("if:o");
			 ans=0;  
		 }
		 
		 else {
			 cnt=0;
			 num=0;
			 for(i=0;i<n;i++) {
				if(ar[n-1]-ar[i]==ar[i] || ar[n-1]-ar[i]==ar[n-2]) {
					ans=n/2;
					num=1;
					break;
				}
				else cnt+=1;
			 }
			 if(num==1) ans=ans+cnt;
			 else ans=n-1;
		 }
	     System.out.println(ans);
		 t--;	
		}

	}

}
