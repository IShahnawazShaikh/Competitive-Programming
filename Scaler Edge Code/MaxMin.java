import java.util.Stack;

public class MaxMin {
   public static void solve(int ar[]){
	  int[] prevG=previousGreater(ar);
	  int[] nextG=nextGreater(ar);
	  
	  int[] prevS=previousSmaller(ar);
	  int[] nextS=nextSmaller(ar);
	  int i,n=ar.length;
	  long sum=0,sum1=0;
	  int MOD=1000000007;
	  for(i=0;i<n;i++){
		int l=prevG[i];
		int r=nextG[i];
		sum+=(1L*ar[i]*(i-l)*(r-i))%MOD;
		int p=prevS[i];
		int q=nextS[i];
		sum1+=(1L*ar[i]*(i-p)*(q-i))%MOD;
	  }
	  System.out.println(sum-sum1);
	  
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

private static int[] nextGreater(int[] A) {
  int i,n=A.length;
  int ans[]=new int[n];
  Stack<Integer> stack=new Stack<Integer>();
  for(i=0;i<n;i++){
	if(stack.empty()) stack.push(i);
	else{
	  while(!stack.empty() && A[i]>A[stack.peek()]){
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
private static int[] previousGreater(int[] A) {
  int i,n=A.length;
  int ans[]=new int[n];
  Stack<Integer> stack=new Stack<Integer>();
  for(i=n-1;i>=0;i--){
	 if(stack.empty()) stack.push(i);
	 else{
		while(!stack.empty() && A[i]>A[stack.peek()]){
		 ans[stack.pop()]=i;	
		}
		stack.push(i);
	 }
  }
  while(!stack.empty()){
	 ans[stack.pop()]=-1;  
  }
  //for(i=0;i<n;i++) System.out.print(prevG[i]+" ");
  return ans;	
}
public static void main(String[] args) {
	solve(new int[]{4,2,7,8});

  }
}
