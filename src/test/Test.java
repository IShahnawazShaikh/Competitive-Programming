package test;

import java.util.Arrays;
import java.util.Comparator;

class Test {
	public int solve(int[][] intervals) {
		Arrays.sort(intervals,new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return a[0]-b[0];
			}
		});
		int n=intervals.length;
		int[] prefix=new int[n];
		prefix[n-1]=intervals[n-1][1]-intervals[n-1][0]+1;
		
		for(int i=n-2;i>=0;i--)  prefix[i]=Math.min(prefix[i+1], intervals[i][1]-intervals[i][0]+1);	
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
		
		  int idx=getCielInterval(intervals,intervals[i][1]);
		  
		  if(idx==-1) continue;
		  int curr=intervals[i][1]-intervals[i][0]+1;
		  ans=Math.min(ans, curr+prefix[idx]);
			
		}
		System.out.println(ans);
		return ans==Integer.MAX_VALUE ? 0: ans;
		
		
	}


	private int getCielInterval(int[][] intervals, int end) {
		
		int low=0,high=intervals.length-1;
		int ans=-1;
		while(low<=high) {
		  int mid=(high-low)+low;	
		  if(intervals[mid][0]>end) {
			ans=mid;  
			high=mid-1;  
		  }
		  else low=mid+1;
		}
		return ans;
	}



	public static void main(String... x) {

		int[][] intervals = { { 1, 2 },{1,3},{3,3}};
		new Test().solve(intervals);

	}

}