import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AvoidFlood {

  public static int[] avoidFlood(int[] rains) {
	  
	  
   int n=rains.length;
   int i;
   TreeSet<Integer> zero=new TreeSet<Integer>();
   Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
   int res[]=new int[rains.length];
     
   for(i=0;i<n;i++) {
	   if(rains[i]==0) zero.add(i);
	   else if(mp.containsKey(rains[i])){
		 
		int index= mp.get(rains[i]);
		Integer p=zero.ceiling(index);
     	if(p==null) {
			return new int[] {};
		}
		else {
			res[p]=rains[i];
			zero.remove(p);
		}
		res[i]=-1;    
		mp.put(rains[i],i);
	   }
	   else {
		   mp.put(rains[i],i);
		   res[i]=-1;
	   }
   }
   for(i=0;i<n;i++) {
	 if(res[i]==0) res[i]=1;
   }
   return res;
 }
  public static void main(String[] args) {
		
	int ar[]= {2,3,0,0,3,1,0,1,0,2,2};
	int ar2[]=avoidFlood(ar);
	System.out.println("length: "+ar2.length);
	for(int i=0;i<ar2.length;i++) System.out.print(ar2[i]+" ");
 }

}
