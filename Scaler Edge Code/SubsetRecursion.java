import java.util.ArrayList;

public class SubsetRecursion {
	public static ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>(); 
	public static ArrayList<ArrayList<Integer>> subsets(int[] A) {
     subsetFunction(A,0,new ArrayList<Integer>());
	 //System.out.println(ans);			
	 return ans;
	}
	private static void subsetFunction(int[] ar, int i, ArrayList<Integer> list) {
	  ArrayList<Integer> al2=new ArrayList<Integer>(list);  //for passing as value
	  if(i==ar.length){
	 // System.out.println(al2);
	  ans.add(al2);
	  return;
	}
	subsetFunction(ar,i+1,al2);
	al2.add(ar[i]);
	subsetFunction(ar,i+1,al2);	
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> ans=subsets(new int[]{1,2,3,4});
		for(ArrayList<Integer> l: ans){
			  System.out.println(l);	
			} 
	}
}

