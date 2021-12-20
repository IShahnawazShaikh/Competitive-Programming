import java.util.Scanner;

public class ReverseStringRecursion {
	  private static void func(String s, int i) {
	     
		  if(s.length()==i)  return;
		  func(s,++i);
		  System.out.print(s.charAt(i-1));
	  }
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);  
	 System.out.println("calling");
	 String s=sc.next();
	 
	 func(s,0);
	 
	 
	}


}
