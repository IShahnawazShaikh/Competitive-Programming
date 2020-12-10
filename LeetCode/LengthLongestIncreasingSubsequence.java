import java.util.Arrays;

public class LengthLongestIncreasingSubsequence {
	public static int findNumberOfLIS(int[] nums) {
	int  n=nums.length;
	if(n==0) return 0;
	int[] len=new int[n];
	Arrays.fill(len,1);
	int i,j,maxLen=1;
	for(i=1;i<n;i++) {
	   for(j=0;j<i;j++) {
		   if(nums[j]<nums[i]) {
			   if(len[j]+1 >len[i]) len[i]=len[j]+1;  
		   }
	   }
	 maxLen=Math.max(maxLen,len[i]);
	}
	return maxLen;	
	}
	public static void main(String[] args) {
		int ar[]= {10,9,2,5,3,7,101,18};
		System.out.println(findNumberOfLIS(ar));
		
	}

}
