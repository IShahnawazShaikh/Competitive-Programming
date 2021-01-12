//https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
public class CountTriplet {
   public static int countTriplets(int[] arr) {
       int j,i,n=arr.length;
	   int xor1=0,cnt=0;
	   for(i=0;i<n;i++){
		  xor1=arr[i];
		  for(j=i+1;j<n;j++){
		     xor1^=arr[j];
		     if(xor1==0) cnt+=(j-i);
		  }
	   }
	   System.out.println(cnt);
	   return cnt;
    }
 	
   public static void main(String...x){
	   countTriplets(new int[]{1,1,1,1,1});
   }
}
