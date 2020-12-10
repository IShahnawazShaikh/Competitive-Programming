import java.util.Arrays;

public class RangeSortedSubarraySum {
	public static int rangeSum(int[] nums, int n, int left, int right) {
	int prefix[]=new int[(n*(n+1))/2];
	int i,j;
	int sum2=0;
	int p=0;
	for(i=0;i<n;i++) {
	  sum2=0;
	 for(j=i;j<n;j++) {
		sum2+=nums[j]; 
		prefix[p++]=sum2%1000000007;
	 }
	}
	Arrays.sort(prefix);

	for(i=1;i<n*(n+1)/2;i++) prefix[i]=(prefix[i]+prefix[i-1])%1000000007;			
	
	if(left-2<0) return prefix[right-1];
	return prefix[right-1]-prefix[left-2];
	}
	public static void main(String[] args) {
	 int ar[]= {1,2,3,4};
	 System.out.println(rangeSum(ar,4,1,10));
		
		
	}

}
