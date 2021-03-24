import java.util.Stack;

public class LargestRectangleHistogram {
    public static int largestRectangleArea(int[] A) {
      int[] prevS=previousSmaller(A);
      int[] nextS=nextSmaller(A);	
      int i,n=A.length,mxArea=0;
      
      for(i=0;i<n;i++){
    	int l=prevS[i];
    	int r=nextS[i];
    	
    	mxArea=Math.max(mxArea,A[i]*(r-l-1));
      }
      
     System.out.println(mxArea);	
     return mxArea;	
    }
    
    private static int[] nextSmaller(int[] A) {
  	  int i,n=A.length;
  	  int ans[]=new int[n];
  	  Stack<Integer> stack=new Stack<Integer>();
  	  for(i=0;i<n;i++){
  		if(stack.empty()) stack.push(i);
  		else{
  		  while(!stack.empty() && A[i] < A[stack.peek()]){
  			 ans[stack.pop()]=i;	
  			}
  		   stack.push(i);
  		  }
  		 }
  	  while(!stack.empty()){
  		ans[stack.pop()]=n;  
  	  }
  	 //for(i=0;i<n;i++) System.out.print(ans[i]+" ");
  	   return ans;	
  }

  private static int[] previousSmaller(int[] A) {
     int i, n = A.length;
     int ans[] = new int[n];
     Stack<Integer> stack = new Stack<Integer>();
     for (i = n - 1; i >= 0; i--) {
  	 if (stack.empty())
  		stack.push(i);
  	 else {
  		while (!stack.empty() && A[i] < A[stack.peek()]) {
  		  ans[stack.pop()] = i;
  		 }
  	  stack.push(i);
  	 }
  	}
    while (!stack.empty()) {
      ans[stack.pop()] = -1;
     }
    //for(i=0;i<n;i++) System.out.print(ans[i]+" ");
    return ans;
  }   
	public static void main(String[] args) {
		largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});

	}

}
