import java.util.Deque;
import java.util.LinkedList;
public class FirstNegativeIntegerWindowSizeB {
  public static int[] slidingMaximum(final int[] A, int B) {
      int i,n=A.length;
      Deque<Integer> deque = new LinkedList<Integer>();
      int ans[]=new int[n-B+1];
      int index=0;
      for(i=0;i<B;i++){
       if(A[i]<0) deque.addLast(i);
      }
     if(deque.isEmpty()) ans[index++]=0;
     else ans[index++]=A[deque.getFirst()];
     for(i=B;i<n;i++){
        
        while(!deque.isEmpty() && deque.getFirst()<i-B+1){
          deque.removeFirst();    
        }
        if(A[i]<0)deque.addLast(i);
        if(deque.isEmpty()) ans[index++]=0;
        else ans[index++]=A[deque.getFirst()];
     }
     for(i=0;i<ans.length;i++) System.out.print(ans[i]+" ");
     return ans;
    }
	public static void main(String[] args) {
		slidingMaximum(new int[]{-8, 2, 3, -6, 10},2);

	}

}

