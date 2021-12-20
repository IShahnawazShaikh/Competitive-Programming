package test;

import java.util.ArrayList;

public class Test2 {
	public long reverse(long a) {
		// if(a==1) return Integer.MIN_VALUE;
		int cnt = 0;
		int pow = 31;
		long ans = 0;
		int sign = 1;
		if ((a & 1) == 1)
			sign = -1;

		while (a != 0) {
			if ((a & 1) == 1)
				ans = ans + (long) Math.pow(2, pow);
			a >>= 1;
			pow -= 1;
		}
		return sign * ans;
	}

	public static void main(String[] x) {
	 
	 ArrayList<Integer> list=new ArrayList<>();
	 list.add(1);
	 int a=0;
	 System.out.println(a+list.toString());
	   
	}

}
