
public class LittlePonyExtraQuestion {
  private static int[] solve(int[] ar) {
	    int i;
		int mn=ar[0];
		int cnt=1;
		for(i=1;i<ar.length;i++) {
			if(ar[i]<mn) {
				mn=ar[i];
				cnt=1;
				System.out.println("replace: "+mn);
			}
			else {
			    if(ar[i]==mn) cnt+=1;
			}
		}
		int gd=gcd(cnt,ar.length);
	   return new int[] {cnt/gd,ar.length/gd};
  } 
 public static int gcd(int a, int b) {
	 if(a==0) return b;
	 return gcd(b%a,a);
 }
	public static void main(String[] args) {
		solve(new int[] {36, 75, 87, 60, 36, 91, 96});

	}

	

}
