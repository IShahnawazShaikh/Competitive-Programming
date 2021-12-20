import java.util.Scanner;

public class P188A {
	
	public static void main(String...m){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("insert");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=Math.max(x, y);
		int b=Math.min(x, y);
		if((b+3) > a) System.out.println("Yes");
		else System.out.println("No");
		
		
	}
	
}
