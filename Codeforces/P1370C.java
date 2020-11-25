import java.util.*;

public class P1370 {

	public static void main(String[] args) {
	
	 new Thread(()->{
		Scanner sc=new Scanner(System.in); 
		int t=sc.nextInt(); 
		while(t>0) {
		long n=sc.nextInt();
		if(n==1) {
			System.out.println("FastestFinger");
		}
		else if(n==2){
			System.out.println("Ashishgup");
		}
		else if(n%2!=0) System.out.println("Ashishgup");
		else {
         
       long fact=factor(n);
       if(fact==0)   System.out.println("FastestFinger");
       else if(n/fact!=2){
         System.out.println("Ashishgup");
       }
       else{
         System.out.println("FastestFinger");
       }

	    }	
		t--;	
	  }	
	 }).start();
	}


   private static long factor(long num){
   	
   	 long i;
   	 long ans=0;
   	 for(i=3;i*i<=num;i++){
   	 	if(num%i==0){
            
         if(i%2!=0){  if(ans<=i) ans=i;}
         if(i!=num/i){
         	if((num/i)%2!=0){
         		if(ans<=num/i) ans=num/i;
         	}
         } 
   	 	}
   	 }
   	 return ans;
   }
}
