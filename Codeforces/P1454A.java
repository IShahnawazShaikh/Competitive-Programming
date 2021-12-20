import java.util.Scanner;
public class P1454A {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int test=sc.nextInt();
		   while(test>0) {
			int i,n;
			n=sc.nextInt();
			if(n%2==0){
            for(i=n;i>=1;i--)
            System.out.print(i+" ");  
             
			}
			else{
              int cnt=n; 
              for(i=1;i<=n;i++){
               if(i==(n/2)+1) System.out.print(cnt-1+" ");
               else if(i==(n/2)+2) System.out.print(cnt+1+" ");
               else System.out.print(cnt+" ");
               cnt-=1;
               
              }
			}
			
			System.out.println(); 
			test-=1; 
		   }

	}

}
