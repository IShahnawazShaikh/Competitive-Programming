import java.util.Stack;

public class POWERARRAYS {
	public static int solve(int[] A) {
		int i, n = A.length;
		
		int right[]=getRightArray(A);
		int  left[]=getLeftArray(A);
		
		for(i=0;i<n;i++) System.out.print(right[i]+" ");
		System.out.println();
		for(i=0;i<n;i++) System.out.print(left[i]+" ");
		
		long ans=0;
		for(i=0;i<n;i++){
		
		 ans+=(1L*right[i]-i-1)*(1L*i-left[i]-1);
		 ans+=(1L*right[i]-i-1);
		 ans+=(1L*i-left[i]-1);
		}
		System.out.println();
		System.out.println(ans);
		return 0;
	}

   public static int[] getRightArray(int[] A){
	int n=A.length;  
	int right[]=new int[n];  
	
	Stack<Integer> stack=new Stack<>();
	int i;
	stack.push(0);
	for(i=1;i<n;i++){
	 while(!stack.isEmpty() && A[stack.peek()]/2 < A[i]){
		right[stack.pop()]=i; 
	 }
	 stack.push(i);	
	}
	while(!stack.isEmpty()){
	  right[stack.pop()]=n;	
	}
	
	return right;  
   }
  
   public static int[] getLeftArray(int[] A){
	 int i,n=A.length;
	 int left[]=new int[n];
	 Stack<Integer> stack=new Stack<>();
	 stack.push(n-1);
	 
	 for(i=n-2;i>=0;i--){
	    while(!stack.isEmpty() && A[stack.peek()]/2 < A[i]){
	      left[stack.pop()]=i;	
	    }
	   	 
	   stack.push(i); 
	 }
	while(!stack.isEmpty()) {
	  left[stack.pop()]=-1;	
	}
	return left; 
   }
	
	
  public static void main(String[] args) {
		solve(new int[] {64, 32, 16, 8, 4});
   }
}
