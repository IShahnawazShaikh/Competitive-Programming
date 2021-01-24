import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortByBit {
 public static int[] sortByBits(int[] arr) {
    int cnt=0,k,i,n=arr.length;
    Map<Integer,ArrayList<Integer>> mp=new HashMap<Integer,ArrayList<Integer>>();
    Arrays.sort(arr);
    for(i=0;i<n;i++){
      k=arr[i];
      while(k>0){
    	cnt+=1;
    	k=k&(k-1);
      }
     if(mp.containsKey(cnt)){
    	ArrayList<Integer> ts=mp.get(cnt);
    	ts.add(arr[i]);
    	mp.put(cnt,ts);
     }
     else{
    	 ArrayList<Integer> ts=new ArrayList<Integer>();
    	 ts.add(arr[i]);
    	 mp.put(cnt,ts); 
     }
    cnt=0; 		
    }
	i=0;
	int ans[]=new int[n];
	for(ArrayList<Integer> list: mp.values()){
	//	Collections.sort(list);
	  for(Integer x:list){
		 ans[i++]=x; 
	  }
	}
  for(i=0;i<n;i++) System.out.print(ans[i]+" ");
  return ans;	        
 }  
public static void main(String[] args) {
	sortByBits(new int[]{2,3,5,7,11,13,17,19});	

	}

}
