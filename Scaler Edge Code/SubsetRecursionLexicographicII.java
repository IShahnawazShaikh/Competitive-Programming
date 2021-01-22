import java.util.ArrayList;
import java.util.Arrays;

public class SubsetRecursionLexicographicII {
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
	  if(i>index && ar[i-1]==ar[i]) continue;
	  list.add(ar[i]);
	  ans.add(new ArrayList<Integer>(list));		
	  subsetFunction(ar,i+1,list);	
	  list.remove(list.size()-1);  
	 }
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> ans=subsets(new int[]{1,2,2});
		for(ArrayList<Integer> l: ans){
		  System.out.println(l);	
		} 
	}
}