package codestudio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbers {
	public static ArrayList<Integer> jumpingNumbers(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);

		for (int i = 1; i <= 9 && i <= n; i++)
			bfs(list, i, n);
		Collections.sort(list);
		return list;

	}

	public static void bfs(ArrayList<Integer> list, int i, int N) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(i);
		while (!queue.isEmpty()) {
			int num = queue.poll();
			if (num <= N) {
				list.add(num);
				int lastDigit = num % 10;
				if (lastDigit == 0)
					queue.add((num * 10) + lastDigit + 1);
				else if (lastDigit == 9)
					queue.add((num * 10) + lastDigit - 1);
				else {
					queue.add((num * 10) + lastDigit + 1);
					queue.add((num * 10) + lastDigit - 1);
				}
			}
		}
	}

}
