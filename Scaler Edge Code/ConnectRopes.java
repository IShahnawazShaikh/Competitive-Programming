import java.util.ArrayList;

public class ConnectRopes {
	public int solve(int[] ar) {
		
		int i, n = ar.length;
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(i=0;i<n;i++) list.add(ar[i]);
		
		int ans = 0;
		constructMinHeap(list);
		while (list.size() > 1) {
		
			System.out.println(list);
			int min1 = extractMin(list);
			int min2 = extractMin(list);
			
			System.out.println(min1+" "+min2);
			
			ans += min1 + min2;
			insert(list, min1 + min2);
		}
		System.out.println("ans: "+ans);
		return ans;
	}
	public void constructMinHeap(ArrayList<Integer> list){
	 int i,start=list.size()/2-1;
	 for(i=start;i>=0;i--){		  
		minHeapify(list,i);
	 }		
	}
	public int extractMin(ArrayList<Integer> list) {
		int min = 0;
		int n = list.size();
		if(list.size()==0) return -1;
		if (list.size() == 1) {
			min = list.get(0);
			list.remove(0);
		}

		else {
			min = list.get(0);
			swap(list,0,n-1);
			list.remove(n - 1);
			minHeapify(list, 0);
		}
		return min;
	}

	public void minHeapify(ArrayList<Integer> list, int index) {
		int min = index;
		int n = list.size();
		if (2 * index + 1 < n && list.get(2 * index + 1) < list.get(min)) {
			min = 2 * index + 1;
		}
		if (2 * index + 2 < n && list.get(2 * index + 2) < list.get(min)) {
			min = 2 * index + 2;
		}

		if (min != index) {
			swap(list,min,index);
			minHeapify(list, min);
		}
	}

	public void insert(ArrayList<Integer> list, int x) {
		list.add(x);
		int i = list.size() - 1;
		while (i > 0 && list.get((i - 1) / 2) > list.get(i)) {
		    swap(list,(i-1)/2,i);
			i = (i - 1) / 2;
		}
	}
  public void swap(ArrayList<Integer> list,int i,int j){
	int temp = list.get(i);
	list.set(i, list.get(j));
	list.set(j, temp);	  
  }
  public static void main(String...x){
	 ConnectRopes obj=new ConnectRopes(); 
 	 obj.solve(new int[]{6, 19, 9, 14, 17, 16, 7, 2, 14, 4, 3});
  }
}
