import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {
	public static int[] solve(int[] A) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new MyComparator());
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int i, n = A.length;
		int ans[] = new int[n];
		maxHeap.add(A[0]);
		ans[0] = maxHeap.peek();
		for (i = 1; i < n; i++) {
			if (A[i] < maxHeap.peek()) {
				if (maxHeap.size() - minHeap.size() != 0)
					minHeap.add(maxHeap.poll());
				maxHeap.add(A[i]);
			} else {
				if (maxHeap.size() - minHeap.size() == 0){
				 if(A[i]<minHeap.peek()) maxHeap.add(A[i]);	
				 else{
				  maxHeap.add(minHeap.poll());	 
				  minHeap.add(A[i]);	 
				 }
				}
				else minHeap.add(A[i]);	
				
			}
		  System.out.println(maxHeap);
		  System.out.println(minHeap);
		   ans[i] = maxHeap.peek();
		   //System.out.println(ans[i]);
		}
	    for(i=0;i<n;i++) System.out.print(ans[i]+" ");	
		return ans;
	}
   static class MyComparator implements Comparator<Integer>{
	  public int compare(Integer a,Integer b) {
		return b-a;  
	  }
   }
	public static void main(String[] args) {
	 solve(new int[]{1, 2, 5, 4, 3,1});
	}


}
