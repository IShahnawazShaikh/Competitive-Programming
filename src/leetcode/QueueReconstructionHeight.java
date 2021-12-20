package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstructionHeight {
	public int[][] reconstructQueue(int[][] people) {

		Arrays.sort(people, new MyComparator());
		int i, j, n = people.length;
		Pair[] pArr = new Pair[n];
		for (i = 0; i < n; i++) {
			int val = people[i][0];
			int cnt = people[i][1];
			int idx = -1;
			for (j = 0; j < n; j++) {
				if (pArr[j] == null) {
					idx = j;
					break;
				}
				if (pArr[j].val < val)
					continue;
				if (cnt == 0 && pArr[j].val >= val) {

					if (pArr[j].val == val) {
						if (pArr[j].cnt > people[i][1]) {
							idx = j;
							break;
						}
					} else {

						idx = j;
						break;
					}

				} else if (pArr[j].val >= val) {
					cnt -= 1;
				}
			}

			Pair p = pArr[idx];
			pArr[idx] = new Pair(people[i][0], people[i][1]);
			idx += 1;
			while (idx < n && pArr[idx] != null) {

				Pair temp = pArr[idx];
				pArr[idx] = p;
				p = temp;
				idx += 1;
			}
			if (idx < n)
				pArr[idx] = p;

		}
		int[][] ans = new int[n][2];
		for (i = 0; i < n; i++) {

			ans[i] = new int[] { pArr[i].val, pArr[i].cnt };
		}
		return ans;
	}

	class Pair {
		int val, cnt;

		Pair(int v, int c) {
			val = v;
			cnt = c;
		}

	}

	class MyComparator implements Comparator<int[]> {

		@Override
		public int compare(int[] a, int[] b) {
			if (a[1] == b[1])
				return a[0] - b[0];
			return a[1] - b[1];
		}
	}

	public static void main(String[] args) {
		QueueReconstructionHeight obj = new QueueReconstructionHeight();
		int[][] people = { { 6, 0 }, { 5, 0 }, { 4, 0 }, { 3, 2 }, { 2, 2 }, { 1, 4 } };
		obj.reconstructQueue(people);

	}

}
