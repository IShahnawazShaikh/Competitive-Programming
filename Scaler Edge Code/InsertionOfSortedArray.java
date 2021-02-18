import java.util.ArrayList;
import java.util.List;

public class InsertionOfSortedArray {
    public static  ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        int p1=0;
       int p2=0;
       int n=A.size(),m=B.size();
       ArrayList<Integer> ans=new ArrayList<Integer>();
       while(p1<n && p2 <m){
         if((int)A.get(p1)==(int)B.get(p2)){	 
           ans.add(A.get(p1));
           p1+=1;
           p2+=1;
         }
         else if(A.get(p1) < B.get(p2)) p1+=1;
         else {
        	 p2+=1; 
         }
       }
       System.out.println(ans);
       return ans;
              
      }
	public static void main(String[] args) {
	List<Integer> list1=new ArrayList<Integer>();
	List<Integer> list2=new ArrayList<Integer>();
	list1.add(10000);
	list2.add(10000);
	intersect(list1,list2);

	}

}
