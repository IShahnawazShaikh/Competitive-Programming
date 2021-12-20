
public class ClosestPalindrome {
  public static String solve(String A) {
   int n=A.length();
   int p1=0,p2=n-1;
   boolean st=true;
   while(p1<p2){
	if(A.charAt(p1)!=A.charAt(p2)){
	if(st) st=false;
	else return "NO";
	}
	p1++;
	p2--;
   }
   if(!st) return "YES";
   if(st && n%2==1) return "YES";  
   else  return "NO";       
  }
  public static void main(String[] args) {
	solve("abbba");
  }

}
