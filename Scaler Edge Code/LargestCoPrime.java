import java.util.ArrayList;
import java.util.Collections;

public class LargestCoPrime {
	public static ArrayList<Integer> factorsList=new ArrayList<Integer>();
	public static int cpFact(int A, int B) {
	while(true) {
		int gc=gcd(A,B);
		if(gc==1) return A;
		A/=gc;
	}
		
		
   }
	private static int gcd(int a,int b) {
		if(a==0) return b;
		return gcd(b%a,a);
	}
	public static void main(String[] args) {
		System.out.println(cpFact(30,12));

	}

}
