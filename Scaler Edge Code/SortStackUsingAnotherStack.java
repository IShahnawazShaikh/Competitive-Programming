import java.util.Stack;
public class SortStackUsingAnotherStack {
    public static int[] solve(int[] A) {
        int i,n=A.length;
        Stack<Integer> Min=new Stack<Integer>();
        Stack<Integer> Max=new Stack<Integer>();
        for(i=0;i<n-1;i++){
           if(A[i]<=A[i+1]){
             if(Min.empty()) Min.push(A[i]);
             else{
               insertInStack(Min,A[i]);  
             }
           }
           else{
             if(Max.empty()) Max.push(A[i]); 
             else{
               insertInStack(Max,A[i]);  
             }
           }
        }
        int index=0;
        if(!Max.empty() && A[n-1]< Max.peek()){
                
          insertInStack(Min,A[n-1]);   
        }
        else{
           insertInStack(Max,A[n-1]);    
        }
        
        System.out.println(Min);
        System.out.println(Max);
        
        
        while(!Min.empty() && !Max.empty()){
           if(Min.peek()<=Max.peek()){
            A[index++]=Min.pop();    
           }
           else{
            A[index++]=Max.pop();    
           }
            
        }
        while(!Min.empty()){
            A[index++]=Min.pop();    
        }     
     while(!Max.empty()){
            A[index++]=Max.pop();    
        }      
        System.out.println(Min);
        System.out.println(Max);
        return A;
        
       }	
    public static void insertInStack(Stack<Integer> stack,int x){
        if(stack.empty()) {stack.push(x); return;}    
        if(stack.peek()>=x){
           stack.push(x);
           return;
        }    
        int top=stack.pop();
        insertInStack(stack,x);
        stack.push(top);
           
       }

	public static void main(String[] args) {
	 solve(new int[]{66, 96, 43, 28, 14, 1, 41, 76, 70, 81, 22, 11, 42, 78, 4, 88, 70, 43, 90, 6, 12});	

	} 
}
