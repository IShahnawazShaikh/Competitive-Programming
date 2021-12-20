import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class myComparator2 implements Comparator{
	@Override
	public int compare(Object a, Object b) {
		MergeOverlappingIntervals o1=(MergeOverlappingIntervals) a;
		MergeOverlappingIntervals o2=(MergeOverlappingIntervals) b;
	   return o1.start - o2.start;
	}
}
public class MergeOverlappingIntervals {
	int start;
    int end;
    MergeOverlappingIntervals() { start = 0; end = 0; }
    MergeOverlappingIntervals(int s, int e) { start = s; end = e; }
    
    
    public static ArrayList<MergeOverlappingIntervals> merge(ArrayList<MergeOverlappingIntervals> list) {
    	
    	Collections.sort(list,new myComparator2());
    	
    	for(MergeOverlappingIntervals p: list)
        	System.out.println(p.start+" "+p.end);
    	
    	MergeOverlappingIntervals temp=list.get(0);
    	ArrayList<MergeOverlappingIntervals> ans=new ArrayList<>();
    	int i;
    	for(i=1;i<list.size();i++){
    	 if(list.get(i).start<=temp.end){
    		temp.end=Math.max((int)temp.end,(int)list.get(i).end); 
    	 }
    	 else{
    		ans.add(temp);
    		temp=list.get(i);
    	 }
    		
    	}
    	ans.add(temp);
    	for(MergeOverlappingIntervals p: ans)
    	  System.out.println(p.start+" : "+p.end);
      return ans;	
    }
    public static void main(String[] args) {
	 MergeOverlappingIntervals o1=new MergeOverlappingIntervals(1,10);
	 MergeOverlappingIntervals o2=new MergeOverlappingIntervals(2,9);
	 MergeOverlappingIntervals o3=new MergeOverlappingIntervals(3,8);
	 MergeOverlappingIntervals o4=new MergeOverlappingIntervals(4,7);
	 MergeOverlappingIntervals o5=new MergeOverlappingIntervals(5,6);
	 MergeOverlappingIntervals o6=new MergeOverlappingIntervals(6,6);
     
	 ArrayList<MergeOverlappingIntervals> list=new ArrayList<>();
	 list.add(o1);
	 list.add(o2);
	 list.add(o3);
	 list.add(o4);
	 list.add(o5);
	 list.add(o6);
	 merge(list);
	 
	}

}
