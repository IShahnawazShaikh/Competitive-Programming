
public class PowerFunction {
	 public static int pow(int A, int B, int C) {
	     long ans=1,pow=A,c=C;
	     int i;
	     for(i=0;i<31;i++){
	    	 System.out.println("i: "+i);
	    	if((B&(1<<i))>0){
	    	  ans=ans*pow;
	    	  ans=(ans+c)%c;
	    	  System.out.println(ans+" "+(1<<i));
	    	}
	    	pow*=pow; 
	    	pow%=c;
	    	 
	     }
		 System.out.println((ans+c)%c);
	     return 0;   
	    }
	 public static void main(String...x){
		 pow(71045970,41535484,64735492);
	 }
}
