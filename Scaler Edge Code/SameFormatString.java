
public class SameFormatString {
  public static int solve(final String A, final String B) {
	int p1 = 0, p2 = 0;
	int n = A.length(), m = B.length();
	while (p1 < n && p2 < m) {
     if (A.charAt(p1) == B.charAt(p2)) {
       while (p2 < m && B.charAt(p2) == A.charAt(p1)) p2++;
	   p1++;
	  }
      else return 0;
	 }
     while (p1 < n) {
      if (A.charAt(p1) != A.charAt(p1 - 1))	return 0;
	  p1++;
     }
	 while (p2 < m) {
	   if (B.charAt(p2) != B.charAt(p2 - 1))return 0;
	   p2++;
      }
	 return 1;
	}

	public static void main(String... x) {
		solve("HIRED", "HHHIIIRRRRD");
	}
}
