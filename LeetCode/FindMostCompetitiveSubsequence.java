import java.util.ArrayDeque;
import java.util.Deque;

public class FindMostCompetitiveSubsequence {
  public static int[] mostCompetitive(int[] nums, int k) {
    
	Deque<Integer> deque=new ArrayDeque<>();
	
	int i,n=nums.length;
	int mn=Integer.MAX_VALUE;
	int index=0;
	for(i=0;i<=n-k;i++){
	  if(nums[i]<mn){
		 index=i; 
		 mn=nums[i]; 
	  }
	}
	deque.addLast(nums[index]);
	for(i=index+1;i<n;i++){
	  while((!deque.isEmpty() && nums[i]<deque.getLast()) && ( deque.size()+n-i>k)){
		  deque.removeLast();	  
	  }
	  deque.addLast(nums[i]);
	}
	while(!deque.isEmpty() && deque.size()>k){
	  deque.removeLast();	
	}
	index=0;
	int ans[]=new int[k];
	while(!deque.isEmpty()){
	  ans[index++]=deque.removeFirst();	
	}
    for(i=0;i<k;i++) System.out.print(ans[i]+" ");
	return ans;  
  }
  public static void main(String[] args) {
	 mostCompetitive(new int[]{84,10,71,23,66,61,62,64,34,41,
			 80,25,91,43,4,75,65,13,37,41,46,90,55,8,85,61,95,71},24);
  }

}
