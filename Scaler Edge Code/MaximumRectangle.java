import java.util.Stack;

public class MaximumRectangle {
  public static int solve(int[][] A) {
     int i=0,j=0;
     int row=A.length,col=A[0].length;
     int columnArr[]=new int[col];
     int maxArea=0;
     for(i=0;i<col;i++){
       columnArr[i]=A[0][i];	 
     }
     
    for(i=0;i<col;i++) System.out.print(columnArr[i]+" ");
    System.out.println();
     int m=col;
     maxArea=Math.max(maxArea,getArea(columnArr));
     //System.out.println("area1: "+maxArea);
     for(i=1;i<row;i++){
    	for(j=0;j<col;j++){
    	 if(A[i-1][j]!=0 && A[i][j]!=0){
    	   columnArr[j]=columnArr[j]+A[i][j];	 
    	 }
    	 else columnArr[j]=A[i][j];
    	}
    	
    	for(int p=0;p<m;p++) System.out.print(columnArr[p]+" ");
    	System.out.println();
    	maxArea=Math.max(maxArea,getArea(columnArr));
     }
     //System.out.println();
     System.out.println(maxArea);
     
	  
	  
	 return maxArea; 
  }
  
 private static int getArea(int[] columnArr) {
	 int[] prevS=previousSmaller(columnArr);
     int[] nextS=nextSmaller(columnArr);
     
     int i,n=columnArr.length;
     int maxArea=0;
     for(i=0;i<n;i++){
       maxArea=Math.max(maxArea,columnArr[i]*(nextS[i]-prevS[i]-1));	 
     }
	return maxArea;
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
	int matrix[][]={{0,1,1},
			        {1,0,0},
			        {1,0,0},
			        {1,0,0},
			        {1,0,0},
			        {1,1,1},
			        {0,1,0}
	               };
	int matrix2[][]={{1,1},{0,0}};
	solve(matrix2);	
  }

}
