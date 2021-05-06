import java.util.ArrayList;

public class HeapOperations {
	public void constructMinHeap(ArrayList<Integer> list) {
		int i, start = list.size() / 2 - 1;
		
		for (i = start; i >= 0; i--) {
			minHeapify(list, i);
		}
	}

	public int extractMin(ArrayList<Integer> list) {
		int min = 0;
		int n = list.size();
		if (list.size() == 0)
			return -1;
		if (list.size() == 1) {
			min = list.get(0);
			list.remove(0);
		} else {
			min = list.get(0);
			swap(list, 0, n - 1);
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
			swap(list, min, index);
			minHeapify(list, min);
		}
	}

	public void insert(ArrayList<Integer> list, int x) {
		list.add(x);
		int i = list.size() - 1;
		while (i > 0 && list.get((i - 1) / 2) > list.get(i)) {
			swap(list, (i - 1) / 2, i);
			i = (i - 1) / 2;
		}
	}
    public void deacreaseKey(ArrayList<Integer> list,int index,int val){
        int n=list.size();
        if(index>=n) return;
        list.set(index,val);
        while(index>0 && list.get((index-1)/2)>list.get(index)){
        	
          swap(list,(index-1)/2,index);
          index=(index-1)/2;
        }
        
    }
    public void delete(ArrayList<Integer> list,int index){
    	deacreaseKey(list,index,Integer.MIN_VALUE);	
    	extractMin(list);
    }
	public void swap(ArrayList<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public static void main(String[] args) {
	  HeapOperations obj=new HeapOperations();	
	  ArrayList<Integer> list =new ArrayList<>();
	  obj.insert(list,5);
	  obj.insert(list,7);
	  obj.insert(list,6);
	  obj.insert(list,9);
	  System.out.println("heap elements: "+list);
	  obj.deacreaseKey(list,2,0);
	  System.out.println("after decreasing: "+list);
	  obj.delete(list,1);
	  System.out.println("After deleting: "+list);
	}

}
