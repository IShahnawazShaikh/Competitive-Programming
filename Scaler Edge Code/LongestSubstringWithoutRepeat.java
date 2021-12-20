import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
  public static int lengthOfLongestSubstring(String A) {
   int ans=1;
   int p1=0,p2=1,n=A.length();
   Set<Character> set=new HashSet<Character>();
   set.add(A.charAt(p1));
   while(p2<n){
	if(set.contains(A.charAt(p2))){
      set.remove(A.charAt(p1));
      p1++;
	}
	else{	
	 set.add(A.charAt(p2));
	 ans=Math.max(ans,p2-p1+1);	
	 p2++;
	}
   }
   System.out.println(ans);
   
   return ans;
  }
  public static void main(String[] args) {
	  lengthOfLongestSubstring("AaaA");
  }

}
