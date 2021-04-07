import java.util.ArrayList;
import java.util.Stack;

public class BasicCalculatorII {
	public static int i=0;
	public static int calculate(String s) {
	 s='('+s+')';
	 int n = s.length();
	   
	 String postfix = postfixList(s,i);

	 System.out.println("ans: "+postfix);

    return 0;
	}
	private static String postfixList(String s,int index) {
		int n = s.length();
		ArrayList<String> postfix = new ArrayList<>();
		Stack<Character> stack = new Stack<Character>();
		String temp="";
	    stack.push('(');
	    index+=1;
	
		for (i =index; i < n; i++) {
			char ch = s.charAt(i);
			if (ch ==32)
				continue;
			else if (ch == '('){
			 postfix.add(postfixList(s,i));
			
			 }
			else if (ch == ')') {
					while (stack.peek()!= '(') {
						postfix.add("" + stack.pop());
					}
					stack.pop();
					//System.out.println("postfix: "+postfix);
					temp=evaluate(postfix);
					//System.out.println("evaluate: "+temp);
					return temp;
				} 
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){

						while(!stack.isEmpty() &&  gerPriority(ch)<=gerPriority(stack.peek())){
						 postfix.add("" + stack.pop()); 	
						}
						stack.push(ch);
				}
			else {
				StringBuilder num = new StringBuilder("");
				while (i<n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					num.append(s.charAt(i));
					i++;
				}
				i--;
			 postfix.add(""+num);
			 //System.out.println(postfix);
			}
		}
	 return temp;	
	}

	private static String evaluate(ArrayList<String> postfix) {
		int i, n = postfix.size();
		Stack<String> stack = new Stack<String>();
		//System.out.println("postfix: "+postfix);
		for (i = 0; i < n; i++) {
		  
			String s = postfix.get(i);
			if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
             
				if(stack.size()>=2){
					int operand2 = Integer.parseInt(stack.pop());
					int operand1 = Integer.parseInt(stack.pop());

					if (s.equals("+"))
						stack.push("" + (operand1 + operand2));
					else if (s.equals("*"))
						stack.push("" + (operand1*operand2));
					else if (s.equals("/"))
						stack.push("" + (operand1/operand2));
					else
						stack.push("" + (operand1 - operand2));	
				}
				else{
					int operand1 = Integer.parseInt(stack.pop());
					if (s.equals("+"))
						stack.push("" + (operand1*1));
					else if (s.equals("*"))
						stack.push("" + (operand1*1));
					else
						stack.push("" + operand1*(-1));
				}
				
			} else
				stack.push(s);
		}
		return stack.pop();
	}
	public static int gerPriority(char ch){
	 switch(ch){
	   case '+' : return 1;
	   case '-' : return 1;
	   case '*' : return 2; 
	   case '/' : return 2; 
	 }
	 return 0;
	}
	public static void main(String[] args) {
		calculate("3+5 / 2");
	}

}
