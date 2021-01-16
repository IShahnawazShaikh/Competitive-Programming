import java.util.Scanner;

public class P1473B {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("insert:");
    int t=sc.nextInt();
    while(t-->0){
     String s=sc.next();
     String p=sc.next();
     
     if(s.equals(p)) System.out.println(s);
     else{
     
     int l1=s.length();
     int l2=p.length();
     
      int gd=gcd(l1,l2);
      int lcm=(l1*l2)/gd;
      l1=lcm/l1;
      l2=lcm/l2;
      String s2="",s1="";
      int i;
      for(i=0;i<l1;i++) s1=s1+s;  
      
      for(i=0;i<l2;i++) s2=s2+p;  
       
     
      if(s1.equals(s2)) System.out.println(s1);
      else System.out.println(-1);
     
     }
          
    }

	}
	
	  public static int gcd(int a,int b){
		   if(a==0) return b;
		   return gcd(b%a,a);
	   }	

}
