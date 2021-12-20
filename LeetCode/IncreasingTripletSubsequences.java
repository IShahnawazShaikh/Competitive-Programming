import java.util.Arrays;

public class IncreasingTripletSubsequences {
	public static boolean increasingTriplet(int[] nums) {
	int  n=nums.length;
	if(n==0) return false;
	int[] len=new int[n];
	Arrays.fill(len,1);
	int i,j,maxLen=1;
	for(i=1;i<n;i++) {
	   for(j=0;j<i;j++) {
		   if(nums[j]<nums[i]) {
			   if(len[j]+1 >len[i]) len[i]=len[j]+1;  
		   }
		   if(len[i]==3) return true;
	   }
	}
	return false;	
	}
	public static void main(String[] args) {
		int ar[]= {1,2,1,1,89,88,100,101,102};
		System.out.println(increasingTriplet(ar));
		
	}

}
