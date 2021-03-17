import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParanthesis {
    public static int solve(String A) {
     Stack<Character> stack=new Stack<Character>();	
     Map<Character,Character> mp=new HashMap<>();
     
     mp.put(')','(');
     mp.put('}','{');
     mp.put(']','[');
     
     int i,n=A.length();
     for(i=0;i<n;i++){
       if(stack.empty()) stack.push(A.charAt(i));
       
       else {
    	 if(mp.get(A.charAt(i))==stack.peek()){
    		stack.pop(); 
    	 }
    	 else stack.push(A.charAt(i));
       }
     }
     System.out.println(stack);
     
     if(stack.empty()) return 1;
     return 0;	
    }
	public static void main(String[] args) {
	 solve("()[]");

	}

}
