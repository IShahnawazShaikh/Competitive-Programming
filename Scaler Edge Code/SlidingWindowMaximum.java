import java.util.Deque;
import java.util.LinkedList;
public class SlidingWindowMaximum {
    public static int[] slidingMaximum(final int[] A, int B) {
        int i,n=A.length;
        Deque<Integer> deque = new LinkedList<Integer>();
        int ans[]=new int[n-B+1];
        int index=0;
        for(i=0;i<B;i++){
          while(!deque.isEmpty() && A[i]>A[deque.getLast()]){
            deque.removeLast();    
          }
          deque.addLast(i);
        }
        ans[index++]=A[deque.getFirst()];
       for(i=B;i<n;i++){
          
          while(!deque.isEmpty() && deque.getFirst()<i-B+1){
            deque.removeFirst();    
          }
          while(!deque.isEmpty() && A[i] > A[deque.getLast()]){
        	deque.removeLast();  
          }
          deque.addLast(i);
          ans[index++]=A[deque.getFirst()];
       }
       for(i=0;i<ans.length;i++) System.out.print(ans[i]+" ");
       //System.out.println(list);
       return ans;
      }
	public static void main(String[] args) {
		slidingMaximum(new int[]{648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 
				876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 
				882, 760, 354, 523, 935,
				277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 
				207, 368},9);

	}

}
