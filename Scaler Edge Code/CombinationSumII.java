import java.util.ArrayList;
import java.util.Collections;
//not done
public class CombinationSumII {
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		Collections.sort(A);
		getCombinations(A, 0,B,new ArrayList<Integer>(),result);
		
		System.out.println(result);
		return result;
	}

	private int getCombinations(ArrayList<Integer> list, int idx, int target,ArrayList<Integer> curr,
			ArrayList<ArrayList<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(curr));
			return 1;
		}
		if(idx>=list.size()) return 0;
		int cnt=0;
		if(target-list.get(idx)>=0){
		 curr.add(list.get(idx));	
		 cnt+=getCombinations(list,idx+1,target-list.get(idx),curr,result);
		 curr.remove(curr.size() - 1);			
		}
		idx++;
		while(idx<list.size() && list.get(idx)==list.get(idx-1)) idx++;
		cnt+=getCombinations(list,idx,target,curr,result); 
		return cnt; 
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		list.add(8);
//		list.add(10);
//		list.add(6);
//		list.add(11);
//		list.add(1);
//		list.add(16);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
	
		new CombinationSumII().combinationSum(list,1);
	}

}
