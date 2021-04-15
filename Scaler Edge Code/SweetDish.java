public class SweetDish {	
    public static int solve(int[] A, int B, int C) {
    int j,i,n=A.length;
    int p=(int)Math.pow(2, n);
    int ans=0;
    for(i=1;i<p;i++){
      j=0;
      int temp=i;
      boolean st=false;
      long sum=0;
      
      while(temp>0){
        if((temp&1)==1){
           sum+=A[j];
          if(!st && isPrime(A[j])) st=true; 
        }
        j+=1;
        temp>>=1;
      }
      if(st && sum>=B && sum<=C){
    	ans+=1;		
      }
    }
    System.out.println(ans);
    
    return ans;
   }
  public static boolean isPrime(int num){
	 
	 if(num==2 || num==3) return true;
	 if(num%2==0 || num%3==0) return false; 
	  
	 int i;
	 int n=(int) Math.sqrt(num);
	 for(i=5;i<=n;i++){
	  if(num%i==0) return false;	 
	 }
	  
	return true;  
  }

	public static void main(String[] args) {
	 solve(new int[]{1, 3, 7, 4},5,8); 
	}

}
