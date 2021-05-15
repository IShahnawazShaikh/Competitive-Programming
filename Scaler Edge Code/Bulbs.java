
public class Bulbs {
	public static int bulbs(int[] A) {
		int i, n = A.length;
		boolean status = true;
		int count = 0;
		for (i = 0; i < n; i++) {
			if (A[i] == 1 && status)
				continue;
			else if (A[i] == 0 && status == false)
				continue;
			else {
				count++;
				status = !status;
			}
		}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
	 bulbs(new int[]{1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1});
	}

}
