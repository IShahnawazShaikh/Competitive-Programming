import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaximumFrequencyStack {
    public static int[] solve(int[][] A) {
        int i,n=A.length;
        int maxFreq=0;
        Map<Integer,Integer> freqMap=new HashMap<Integer,Integer>();
        Map<Integer,Stack<Integer>> stackMap=new HashMap<Integer,Stack<Integer>>();
        int ans[]=new int[n];
       
        for(i=0;i<n;i++){
        	
           if(A[i][0]==1){
               ans[i]=-1;
               if(freqMap.containsKey(A[i][1])){
                  freqMap.put(A[i][1],freqMap.get(A[i][1])+1);
                  maxFreq=Math.max(maxFreq,freqMap.get(A[i][1]));
               }
               else{
                 freqMap.put(A[i][1],1);
                 maxFreq=Math.max(maxFreq,freqMap.get(A[i][1]));
               }
              // System.out.println("x: "+stackMap);
               if(stackMap.containsKey(freqMap.get(A[i][1]))){
            	  // System.out.println("contains "+maxFreq);
                   Stack<Integer> temp= stackMap.get(freqMap.get(A[i][1]));
                   
                   //System.out.println("temp stack :"+temp);
                   temp.push(A[i][1]);
                   stackMap.put(freqMap.get(A[i][1]),temp);
                }
                else{
                    Stack<Integer> stk=new Stack<>();
                    stk.push(A[i][1]);
                    stackMap.put(freqMap.get(A[i][1]),stk);   
                }    
           }
           else{
             Stack<Integer> temp=stackMap.get(maxFreq);
             int val=temp.pop();  
            // System.out.println("poped: "+currentMx);
             ans[i]=val;
             freqMap.put(val,freqMap.get(val)-1);   //decreasing frequency of poped element
             
             ///System.out.println("freqMap: "+freqMap);
             //System.out.println("stackMap: "+freqMap);
             
             if(temp.isEmpty()) {
              //freqMap.remove(currentMx);	 
              maxFreq-=1;
             }
           }
//        System.out.println("i: "+i);
//       	System.out.println("maxFrequency: "+maxFreq);
//       	System.out.println("freqMap: "+freqMap);
//       	System.out.println("stackMap: "+freqMap);
//       	System.out.println();
        }
        
        //System.out.println();
        for(i=0;i<n;i++) System.out.print(ans[i]+" ");
        return ans;
       }
  public static void main(String[] args) {
	int A[][]={{1,2}, {1,3}, {2,0}, {2,0}, {1,5}, {1,5}, {1,1}, {2,0},{1,6}
			
	          }; 
	solve(A);	
  }
}
