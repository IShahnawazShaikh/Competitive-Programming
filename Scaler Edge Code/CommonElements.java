import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {
	public static ArrayList<Integer> solve(int[] A, int[] B) {
	 ArrayList<Integer> ans=new ArrayList<Integer>();	
	 Map<Integer,Integer> mp=new HashMap<>();
	 int i;
	 for(i=0;i<A.length;i++){
	  if(mp.containsKey(A[i]))  mp.put(A[i],mp.get(A[i])+1); 
		  
	  else mp.put(A[i],1);
	 }
	 
	 for(i=0;i<B.length;i++){
	  if(mp.containsKey(B[i]) && mp.get(B[i])!=0){
		 ans.add(B[i]);
		 mp.put(B[i],mp.get(B[i])-1);
	  }
	 }
	  
	 System.out.println(ans); 
	 return ans; 
	}
	public static void main(String[] args) {
	  solve(new int[]{1,2, 2, 1},new int[]{2,2, 3, 1, 2});
	}

}
