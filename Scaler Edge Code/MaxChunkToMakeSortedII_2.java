import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MaxChunkToMakeSortedII {
	public static void maxChunksToSorted(int[] arr) {
	 int temp[]=arr.clone();
	 int i,n=arr.length;
	 //for(i=0;i<n;i++) System.out.print(temp[i]+" ");
	 Arrays.sort(temp);
	 Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	 Set<Integer> set=new TreeSet<Integer>();
	 int ans=0;
	 for(i=0;i<n;i++){
	  if(mp.containsKey(arr[i])){
		mp.put(arr[i],mp.get(arr[i])+1);  
	  }
	  else{
		mp.put(arr[i],1);  
	  }
	 if(mp.containsKey(temp[i])){
	   mp.put(temp[i],mp.get(temp[i])-1);	 
	 }
	 else{
		 mp.put(temp[i],-1); 
	 }
	 set.add(arr[i]);
	 set.add(temp[i]);
	 if(mp.get(arr[i])==0) set.remove(arr[i]);
	 if(mp.get(temp[i])==0)	 set.remove(temp[i]);
	 
	 if(set.size()==0) ans+=1;
		
	 }
	 System.out.println(ans);
	}

	public static void main(String[] args) {
	 int arr[]={1,0,2,3,4};
	 maxChunksToSorted(arr);

	}

}
