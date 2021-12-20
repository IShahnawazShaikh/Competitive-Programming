
public class ReverseDigits {
	public static int reverse(int A) {
		    int sign=(A<0)? -1:1;
		     long ans=0,a=A;
		     a=Math.abs(A);
		      while(a>0){
		        long rem=a%10;
		        a/=10;
		        ans=(ans*10)+rem;
		     } 
		  System.out.println(sign*ans);
		return (sign*ans >Integer.MAX_VALUE || sign*ans < Integer.MIN_VALUE) ? 0: (int)(sign*ans); 
	}
	
	public static void main(String...x){
		reverse(001);
	}
	
}
