
public class KthSymbol {
  public static int solve(int A, int B) {
   int i,j;
   String s="0";
   String t="";
    for(i=1;i<A;i++){
     if(B<=s.length()) break; 	
     for(j=0;j<s.length();j++){
    	if(s.charAt(j)=='0') t=t+"01";	
    	else  t=t+"10";	 
     }
     s=t;
     t="";
    }
   return s.charAt(B-1)-'0';       
  }
 public static void main(String[] args) {
	   System.out.println(solve(3,4));	
	}

}
