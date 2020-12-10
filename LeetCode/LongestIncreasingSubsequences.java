public class LongestIncreasingSubsequences {
  
  public static int findLengthOfLCIS(int[] nums) {
  if(nums.length==0) return 0;	  
  int ans=1;
  int i;
  int l=1;
  for(i=1;i<nums.length;i++) {
	if(nums[i]>nums[i-1]) l+=1; 
	else {
		ans=Math.max(ans,l);
		l=1;
	}
  }
  ans=Math.max(ans,l);
  return ans;
  }
  public static void main(String[] args) {
   int ar[]= {-5,-4,-3,0};	
  System.out.println(findLengthOfLCIS(ar)); 
		
  }

}
