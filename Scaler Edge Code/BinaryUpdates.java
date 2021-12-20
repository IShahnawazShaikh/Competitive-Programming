import java.util.ArrayList;

public class BinaryUpdates {
	int segment[] = null;

	public int[] solve(int A, int[][] B) {
		segment = new int[4 * A - 1];
		buildST(0, 0, A - 1);
		int i, n = B.length;
		ArrayList<Integer> list = new ArrayList<>();
		for (i = 0; i < n; i++) {
			if (B[i][0] == 1) {
				if (B[i][1] > segment[0])
					list.add(-1);
				else
					list.add(search(0, 0, A - 1, B[i][1]));
			} else {
               updateQuery(0,0,A-1,B[i][1]-1);
			}
		}
        System.out.println(list);
        int ans[]=new int[list.size()];
        for(i=0;i<list.size();i++) ans[i]=list.get(i);
		return ans;
	}

	private void updateQuery(int index, int left, int right, int uIndex) {
	 if(left==right){
	   segment[index]=0;	
	  return;
	 }
	 int mid=(left+right)/2;
	 if(uIndex<=mid)
		 updateQuery(2*index+1,left,mid,uIndex);
	 else
		updateQuery(2*index+2,mid+1,right,uIndex);
	segment[index]=segment[2*index+1]+segment[2*index+2];	
	}

	private int search(int index, int left, int right, int k) {
		if (left == right)
			return left + 1;
		int mid = (left + right) / 2;
		if (segment[2 * index + 1] >= k)
			return search(2 * index + 1, left, mid, k);
		return search(2 * index + 2, mid + 1, right, k - segment[2 * index + 1]);
	}

	public void buildST(int index, int left, int right) {
		if (left == right) {
			segment[index] = 1;
			return;
		}
		int mid = (left + right) / 2;
		buildST(2 * index + 1, left, mid);
		buildST(2 * index + 2, mid + 1, right);
		segment[index] = segment[2 * index + 1] + segment[2 * index + 2];
	}

	public static void main(String[] args) {
		BinaryUpdates obj = new BinaryUpdates();
		obj.solve(5, new int[][] {{0,3},{1,4},{0, 3},{1,5}});

	}

}
