
public class NumberOfBits {
	public static int numSetBits(long a) {
	 int cnt=0;
	 while(a!=0){
		 if((a&1)==1) cnt+=1;
		 a>>=1;
		 
	 }
		
	System.out.println(cnt);	
	
	 return 0;	
	}
	public static void main(String[] args) {
		numSetBits(5);

	}

}
