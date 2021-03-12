
public class SmallestPrefixStringInOrderA {
  public static String smallestPrefix(String A, String B) {
   int p1=0,p2=0,n=A.length();
   String ans=""+A.charAt(p1);
   p1++;
   while(p1 <n && A.charAt(p1)<B.charAt(p2)){
	 ans=ans+A.charAt(p1);
	 p1++;
	}
   if(p1==0) ans=ans+A.charAt(p1);
   ans=ans+B.charAt(p2);
   System.out.println(ans);
   return ans;
  }
  public static void main(String[] args) {
	  smallestPrefix("abba","cdd");

	}

}
