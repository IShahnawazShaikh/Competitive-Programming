import java.util.Arrays;
import java.util.Scanner;

public class P1473A {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("insert:");
    int t=sc.nextInt();
    while(t-->0){
     int n=sc.nextInt();
     int d=sc.nextInt();
     int ar[]=new int[n];
     int i,cnt=0;
     for(i=0;i<n;i++){
    	 ar[i]=sc.nextInt();
    	 if(ar[i]>d) cnt+=1;
     }
     System.out.println("cnt :"+cnt);
     if(cnt==0) System.out.println("YES");
     else{
    	Arrays.sort(ar);
    	for(i=0;i<n;i++) System.out.print(ar[i]+" ");
    	System.out.println(ar[0]+ar[1]);
    	if(ar[0]+ar[1]<=d) System.out.println("YES");
    	else System.out.println("NO");
     }
     
      
      
    }

	}

}
