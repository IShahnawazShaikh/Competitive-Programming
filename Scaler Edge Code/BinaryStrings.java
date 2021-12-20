
public class BinaryStrings {
	public static int solve(String A, int B) {
		int j, i, n = A.length();
		char[] charArray = A.toCharArray();
		int flip[] = new int[n];
		int s = 0, cnt = 0;

		for (i = 0; i <= n-B; i++) {
			s = s ^ flip[i];
			int bit = charArray[i] - '0';
			if ((s ^ bit) == 0) {
				cnt += 1;
				flip[i] = 1;
				if (i + B < n)
					flip[i + B] = 1;
				s = s ^ 1;
			}
		}
		while(i<n){
		 s = s ^ flip[i];
		 int bit = charArray[i] - '0';
		 if ((s ^ bit) == 0)  return -1; 
		 i++;
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		System.out.println(solve("011", 3));

	}

}
