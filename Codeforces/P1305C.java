import java.util.Scanner;

public class P1305C {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
	 int ar[]=new int[n];
	 int j,i;
	 long ans=1;
	 for(i=0;i<n;i++) ar[i]=sc.nextInt(); 
	 
	  if(n>m) ans=0;
	  else {
	 for(i=0;i<n;i++) {
	   for(j=i+1;j<n;j++) {
		ans=(ans*Math.abs(ar[i]-ar[j]))%m;
	   }
	  }
     }
	 System.out.println(ans%m); 
	}	  
}
