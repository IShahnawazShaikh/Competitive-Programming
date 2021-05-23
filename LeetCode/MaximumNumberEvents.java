import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
class MaximumNumberEvents {
    public static int maxEvents(int[][] events) {
        
      Arrays.sort(events,new Comparator<int[]>(){
		@Override
		public int compare(int[] a, int[] b) {
			 if(a[1]==b[1]) return a[0]-b[0];
	         return a[1]-b[1]; 
		} 
      });
      int i,ans=0,n=events.length;
      TreeSet<Integer> set=new TreeSet<>();
      for(i=1;i<=1000000+5;i++) set.add(i);
      
      for(i=0;i<n;i++){
    	int upper_bound=set.ceiling(events[i][0]);
    	
    	System.out.println(events[i][0]+" "+events[i][1]+" "+upper_bound);
    	
    	if(events[i][1]>=upper_bound){
    	  ans+=1;
    	  set.remove(upper_bound);
    	}
      }
      
      
      
      System.out.println(ans);
      return ans;
    }	
   static class Pair implements Comparable<Pair>{
	int start,end;   
    Pair(int s,int e){start=s; end=e;}
	@Override
	public int compareTo(Pair p2) {
	  if(this.end==p2.end) return this.start-p2.start;
       return this.end-p2.end;
	}
	   
   }
   public static void main(String[] arg){
	maxEvents(new int[][]{{52,79},{7,34}});   
	//maxEvents(new int[][]{{1,4},{4,4},{2,2},{3,4},{1,1}});   
   }
}