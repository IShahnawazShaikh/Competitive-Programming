
public class FloorNumberInArray {
    public static int solve(int[] ar,int B){
     int lower=0,upper=ar.length-1;
     int ans=Integer.MIN_VALUE;
     int mid=0;
     while(lower<=upper){
      mid=(lower+upper)/2;
      if(ar[mid]<=B){
    	 ans=ar[mid]; 
    	 lower=mid+1;
      }
      else upper=mid-1;
     }
     if(ans!=Integer.MIN_VALUE) System.out.println("Index at which element<=X: "+mid+" element: "+ans);
     else System.out.println("no element<=X: "+ans);
     
     if(lower==ar.length) System.out.println("Index at which element>X: "+lower);
     else System.out.println("Index at which element>X: "+lower+" element: "+ar[lower]);
     
     return 0;	
    }
	public static void main(String[] args) {
		solve(new int[]{1,2,5,8,10,11,15,16,17},20);

	}

}
