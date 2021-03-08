import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThreeSumZero {
	public static int[][] threeSum(int[] A) {
	 int n=A.length;
	 int p1=0,p2=0,p3=0;
	 Set<Integer> set=new HashSet<>();
	 ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
	 for(p1=0;p1<n;p1++){
	   for(p2=p1+1;p2<n;p2++){
		for(p3=p2+1;p3<p2+3 && p3 < n;p3++){
	      if(A[p1]+A[p2]+A[p3] == 0){
	    	//System.out.println(A[p1]+" "+A[p2]+" "+A[p3]);  
	          ArrayList<Integer> list=new ArrayList<Integer>();
	          if(!set.contains(A[p1]) || !set.contains(A[p2]) || !set.contains(A[p3])){ 
	          list.add(A[p1]);
	          list.add(A[p2]);
	          list.add(A[p3]);
	          Collections.sort(list);
	          ans.add(list);
	          set.add(A[p1]);
	          set.add(A[p2]);
	          set.add(A[p3]);
	        }
	      }
	     
		}
	   }
	 }
	 	
  System.out.println(ans);   		
   return new int[][]{};	
  }
	public static void main(String[] args) {
		threeSum(new int[]{-1,0,1,2,-1,4});
	}

}
