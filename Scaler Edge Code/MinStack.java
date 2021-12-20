import java.util.Stack;

public class MinStack {
    private Stack<Integer> orgStack;
    private Stack<Integer> minStack;
    public MinStack(){
     orgStack=new Stack<Integer>();
     minStack=new Stack<Integer>();
    }
    public void push(int x) {
      orgStack.push(x);    
      if(minStack.empty()){
        minStack.push(x);
      }else{
         
        if(x<=minStack.peek()){
          minStack.push(x);      
        } 
      }
    }
    public void pop() {
      if(!orgStack.empty()){
        int p=orgStack.pop();
        if(!minStack.empty() && minStack.peek()==p) minStack.pop();
       } 
      else return;
    }
    public int top() {
      if(orgStack.empty()) return -1;
      return orgStack.peek();
    }

    public int getMin() {
      if(minStack.empty()) return -1;    
      return minStack.peek();  
    }
	public static void main(String[] args) {
		MinStack mnStackObj=new MinStack();
		mnStackObj.push(10);
		//mnStackObj.display();
		
		mnStackObj.push(9);
		System.out.println(mnStackObj.getMin());
		mnStackObj.push(8);
		System.out.println(mnStackObj.getMin());
		mnStackObj.push(7);
		System.out.println(mnStackObj.getMin());
		mnStackObj.push(6);
		
		System.out.println(mnStackObj.getMin());
		mnStackObj.pop();
		
		System.out.println(mnStackObj.getMin());
		mnStackObj.pop();
		
		System.out.println(mnStackObj.getMin());
		mnStackObj.pop();
		System.out.println(mnStackObj.getMin());
		mnStackObj.pop();
		System.out.println(mnStackObj.getMin());
		
		//mnStackObj.display();
		
		mnStackObj.pop();
		System.out.println(mnStackObj.getMin());
	}

}
