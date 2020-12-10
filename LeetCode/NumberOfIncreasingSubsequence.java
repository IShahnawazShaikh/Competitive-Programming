import java.util.Arrays;

public class NumberOfIncreasingSubsequence {
	public static int findNumberOfLIS(int[] nums) {
	int  n=nums.length;
	if(n==0) return 0;
	int[] len=new int[n], count=new int[n];
	Arrays.fill(len,1);
	Arrays.fill(count,1);
	int i,j,maxLen=1;
	for(i=1;i<n;i++) {
	   for(j=0;j<i;j++) {
		   if(nums[j]<nums[i]) {
			   if(len[j]+1 >len[i]) {
				   len[i]=len[j]+1;
				   count[i]=count[j]; 
			   }
			   else if(len[j]+1==len[i]) {
				   count[i]+=count[j];   
			   }   
		   }
	   }
	 maxLen=Math.max(maxLen,len[i]);
	}
//	for(i=0;i<n;i++) System.out.print(len[i]+" ");
//	System.out.println();
//	for(i=0;i<n;i++) System.out.print(count[i]+" ");
	int ans=0;
	for(i=0;i<n;i++) {
	  if(len[i]==maxLen) ans+=count[i];	
	}
		
	return ans;	
	}
	public static void main(String[] args) {
		int ar[]= {100,90,80,70,60,50,60,70,80,90,100};
		System.out.println(findNumberOfLIS(ar));
		
	}

}
