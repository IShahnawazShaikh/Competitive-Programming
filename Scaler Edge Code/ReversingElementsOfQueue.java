import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingElementsOfQueue {
    public static int[] solve(int[] A, int B) {
        Queue<Integer> queue=new LinkedList<Integer>();
        
        int i,n=A.length;
        for(i=0;i<n;i++) queue.add(A[i]);
        
        Stack<Integer> stack=new Stack<Integer>();
        
        for(i=0;i<B;i++) stack.push(queue.poll());
        
        int index=0;
        while(!stack.empty()) A[index++]=stack.pop();
        
        while(!queue.isEmpty()) A[index++]=queue.poll();
        
       // for(i=0;i<n;i++) System.out.print(A[i]+" ");
        return A;
       }
	public static void main(String[] args) {
	 solve(new int[]{1,2,3,4,5},3);
	}

}
