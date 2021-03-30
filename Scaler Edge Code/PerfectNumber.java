import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumber {
	public static String solve(int A) {
		Queue<String> queue = new LinkedList();
        
		if(A==1) return "11";
		if(A==2) return "22";
		
		queue.add("11");
		queue.add("12");
		queue.add("21");
		queue.add("22");
   
	
		int size = 2;
		String ans="";
		while (size < A) {
			//System.out.println(queue);
			String s = queue.peek();
			size+=1;
			if (size == A) {
				StringBuilder sb1 = new StringBuilder(s);
				 ans=s+sb1.reverse().toString();
				 break;
			}
			
			String s1 = s + "1";
			String s2 = s + "2";
			
			queue.add(s1);
			queue.add(s2);
			queue.poll();
			
		}
		return ans;

	}

	public static void main(String[] args) {
		System.out.println("ans: " + solve(9));

	}

}
