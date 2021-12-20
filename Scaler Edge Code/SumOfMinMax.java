import java.util.Deque;
import java.util.LinkedList;
public class SumOfMinMax {
    public static int slidingMaximum(final int[] A, int B) {
        int i,n=A.length;
        Deque<Integer> Maxdeque = new LinkedList<Integer>();
        Deque<Integer> Mindeque = new LinkedList<Integer>();
        long res=0;
        int MOD=1000000007;
        for(i=0;i<B;i++){
          while(!Maxdeque.isEmpty() && A[i]>A[Maxdeque.getLast()]){
        	  Maxdeque.removeLast();    
          }
          Maxdeque.addLast(i);
        }
        for(i=0;i<B;i++){
            while(!Mindeque.isEmpty() && A[i]<A[Mindeque.getLast()]){
            	Mindeque.removeLast();    
            }
            Mindeque.addLast(i);
          }
       res=A[Maxdeque.getFirst()]+A[Mindeque.getFirst()];
       res%=MOD;
       for(i=B;i<n;i++){
    	   //removing element which is no more in window from Mindeque
          while(!Mindeque.isEmpty() && Mindeque.getFirst()<i-B+1){
        	  Mindeque.removeFirst();
          }
      	  //removing element which is no more in window from Maxddeque 
          while(!Maxdeque.isEmpty() && Maxdeque.getFirst()<i-B+1){
        	  Maxdeque.removeFirst();
          }
          
          
          //removing element whenever greater element come
          while(!Maxdeque.isEmpty() && A[i] > A[Maxdeque.getLast()]){
        	  Maxdeque.removeLast();  
          }
          //removing element whenever smaller element come
          while(!Mindeque.isEmpty() && A[i] < A[Mindeque.getLast()]){
        	  Mindeque.removeLast();  
          }
          
          Maxdeque.addLast(i);
          Mindeque.addLast(i);
          res+=A[Maxdeque.getFirst()]+A[Mindeque.getFirst()];
          res%=MOD;
       }
       //for(i=0;i<ans.length;i++) System.out.print(ans[i]+" ");
       System.out.println(res);
       return (int) (res%MOD);
      }
	public static void main(String[] args) {
		slidingMaximum(new int[]{2, 5, -1, 7, -3, -1, -2},4);

	}

}

