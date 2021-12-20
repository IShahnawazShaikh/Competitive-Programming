import java.util.ArrayList;
import java.util.Arrays;

public class SubsetRecursionLexicographic {
	public static ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
	public static ArrayList<ArrayList<Integer>> subsets(int[] A) {
       Arrays.sort(A);
	   ans.clear();
	   ans.add(new ArrayList<Integer>());
	   subsetFunction(A,0,new ArrayList<Integer>());
	 return ans;
	}
	private static void subsetFunction(int[] ar, int index, ArrayList<Integer> list) {
	for(int i=index;i<ar.length;i++){
	  list.add(ar[i]);
	  ans.add(new ArrayList<Integer>(list));		
	  subsetFunction(ar,i+1,list);	
	  list.remove(list.size()-1); 
	 }
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> ans=subsets(new int[]{1,2,3,4,5});
		for(ArrayList<Integer> l: ans){
		  System.out.println(l);	
		} 
	}
}