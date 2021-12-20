
public class PartitionHoore {
	public static int hoorPartition(int ar[], int low, int high) {
		int p1 = low - 1;
		int p2 = high + 1;
		int pivot = ar[low];
		while (true) {

			do {
				p1 += 1;
			} while (ar[p1] < pivot);
			do {
				p2 -= 1;
			} while (ar[p2] > pivot);

			if (p1 >= p2)
				return p2;
			ar[p1] = (ar[p2] + ar[p1]) - (ar[p2] = ar[1]);
		}
	}
	public static void main(String[] args) {
		int ar[]={10, 80, 30, 90, 40, 50, 70 };
		hoorPartition(ar, 0, 6);
		for(int i=0;i<ar.length;i++) System.out.print(ar[i]+" ");

	}

}
