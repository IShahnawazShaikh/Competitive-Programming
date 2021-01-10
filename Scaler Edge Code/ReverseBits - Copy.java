
public class ReverseBits {
	public static int numSetBits(long a) {
	 int cnt=0;
	 int pow=31;
	 long ans=0;
	 while(a!=0){
		 if((a&1)==1) ans=ans+(long)Math.pow(2,pow);
		 a>>=1;
		 pow-=1;
	 }
		
	System.out.println(ans);	
	
	 return 0;	
	}
	public static void main(String[] args) {
		numSetBits(3);

	}

}
