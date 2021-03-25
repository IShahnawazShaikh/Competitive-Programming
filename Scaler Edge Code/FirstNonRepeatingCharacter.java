import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public static String solve(String A) {
        int i,n=A.length();
        Queue<Character> queue=new LinkedList<Character>();
        StringBuilder ans=new StringBuilder();
        int freq[]=new int[26];
        for(i=0;i<n;i++){
         freq[A.charAt(i)-'a']=freq[A.charAt(i)-'a']+1;
         if(freq[A.charAt(i)-'a']==1){
           queue.add(A.charAt(i));
           ans.append(queue.peek());
         }
         else{
           while(!queue.isEmpty() && freq[queue.peek()-'a']>1){
               queue.poll();
           }
           if(queue.isEmpty()) ans.append('#');
           else ans.append(queue.peek());
             
         }
         
       }
        System.out.println(ans);
       return ans.toString();
      }
	public static void main(String[] args) {
	 solve("abcabc");

	}

}
