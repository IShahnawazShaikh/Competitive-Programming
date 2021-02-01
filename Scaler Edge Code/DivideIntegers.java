
public class DivideIntegers {
public static int divide(int A, int B) {
   int sign=((A<0 && B<0) || (A>=0 && B>=0)) ? 1 : -1;
   long i;
   long ans=0,t=0;
   long a=A;
   long b=B;
  
   a=Math.abs(a);
   b=Math.abs(b);
   long p=0;
   for(i=31;i>=0;i--){
	   p=t+(b<<i);
	  if(p<=a){
		 t+=(b<<i);
		 ans=ans|((long)1<<i);
	  }
	   
   }
    System.out.println(ans);
   return (int) ((sign*ans>Integer.MAX_VALUE || sign*ans<Integer.MIN_VALUE) ? Integer.MAX_VALUE : (int) sign*ans);
  }
public static void main(String[] args) {
	System.out.println(divide(-2147483648,-1));

	}

}
