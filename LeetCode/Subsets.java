
import java.util.ArrayList;
import java.util.List;

public class Subsets {
  public static List<List<Integer>> subsets(int[] nums) {
	int p=(int)Math.pow(2,nums.length);
	int i,j;
	List<List<Integer>> list=new ArrayList<List<Integer>>();
	for(i=0;i<p;i++){
	  int t=i;
	  List<Integer> al=new ArrayList<Integer>();
	  j=0;
	  while(t>0){
		 if((t&1)==1){
		   al.add(nums[j]);	 
		 }
		 j+=1;
		 t>>=1;
	  }
	 list.add(al); 
	}
	System.out.println(list);
	return list;
	  
  }
  public static void main(String[] args) {
		subsets(new int[]{1,2,3});
		
	}

}
