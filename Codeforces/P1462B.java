import java.util.Scanner;

public class P1462B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("insert1");
		int t=sc.nextInt();
		while(t>0) {
		 int n=sc.nextInt();
		 String s=sc.next();
		 String ans="";
		 if(s.charAt(n-1)=='0' && s.charAt(n-2)=='2') {
			 if(s.charAt(n-3)=='0' && s.charAt(n-4)=='2') ans="YES";
			 else {
				 if(s.charAt(n-3)=='0') {
					 if(s.charAt(0)=='2') ans="YES";
					 else 	ans="NO"; 
				 }
				 else {
					if(s.charAt(0)=='2' && s.charAt(1)=='0') ans="YES";
					else ans="NO";
				 } 
			 } 
		 }
		 else if(s.charAt(n-1)=='0') {
			 if(s.charAt(0)=='2' && s.charAt(1)=='0' && s.charAt(2)=='2') ans="YES";
			 else  ans="NO";
		 }
		else {
		 if(s.charAt(0)=='2' && s.charAt(1)=='0' && s.charAt(2)=='2' && s.charAt(3)=='0')  ans="YES";	 
		 else  ans="NO";	 
		 }
		System.out.println(ans);
		 
		 t--;	
		}
	}
}
