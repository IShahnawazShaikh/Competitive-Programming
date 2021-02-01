import java.util.Scanner;

public class P1476A {
   public static void main(String...c){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("ok");
	  int test=sc.nextInt();
	  while(test-->0){
		  int n=sc.nextInt();
		  int k=sc.nextInt();
		  
		  if(n%k==0) System.out.println(1);
		  else if(n>k){
			  System.out.println(2);
		  }
		  else{
			 if(k%n==0) System.out.println(k/n); 
			 else  System.out.println(k/n+1);
		  }
	  }
   }
}
