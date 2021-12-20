
public class CheckPallindromeRecursion {
    
    public static int solve(String A) {
     
     System.out.println(check(A,0));	
    	
     return 0;
    }
  private static boolean check(String s, int i) {
   if(s.length()/2==i) return true;
   if(s.charAt(i)==s.charAt(s.length()-(i+1))){
	   return check(s,++i);
   }
   else return false;
 }
public static void main(String[] args) {
	  
	  solve("namn");
         
   }

}
