
public class ImplementStrStr {
	public static int strStr(String haystack, String needle) {
		int i, n = needle.length(), m = haystack.length();
		long power[] = new long[n];
		int MOD = 1000000007;
		long pow = 1;
		int k = 26;
		 if((m==0 && n!=0) || n>m) return -1;
		for (i = 0; i < n; i++) {
			//System.out.println(i);
			power[i] = pow;
			pow *= k;
			pow %= MOD;
		}
		//for(i=0;i<n;i++) System.out.print(power[i]+" ");
		//System.out.println();
		long haystackHash = 0, needleHash = 0;
		for (i = 0; i < n && i<m; i++) {
			haystackHash = (haystackHash + (haystack.charAt(i) * power[n - i - 1])) % MOD;
			needleHash = (needleHash + (needle.charAt(i) * power[n - i - 1])) % MOD;
		}
		System.out.println(haystackHash+" "+needleHash);
		if (haystackHash == needleHash)
			return 0;
		
		for (i = 1; i <=m-n; i++) {
			haystackHash = ((haystackHash - (haystack.charAt(i - 1) * power[n - 1]) + MOD)) % MOD;
			haystackHash = (haystackHash * k) % MOD;
			haystackHash = (haystackHash + haystack.charAt(i+n-1))%MOD;
			//System.out.println(haystackHash);	
			
			if (haystackHash < 0)
				haystackHash = (haystackHash + MOD) % MOD;
			if (haystackHash == needleHash) {
				return i;
			}
			
		// System.out.println(haystackHash);	
		}
		return -1;

	}

	public static void main(String[] args) {
		System.out.println(strStr("aaa","aaaa"));		
	}

}
