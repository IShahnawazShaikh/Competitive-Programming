import java.util.HashMap;
import java.util.Map;
public class NumberGoodWaysSplitString {
	public static int numSplits(String s) {
     int i,ans=0,n=s.length();
     Map<Character,Integer> mp=new HashMap<Character,Integer>();
     for(i=0;i<n;i++){
      if(mp.containsKey(s.charAt(i))) mp.put(s.charAt(i),mp.get(s.charAt(i))+1); 
      else mp.put(s.charAt(i),1);	 
     }
     int left=mp.size();
     int right=0;
     Map<Character,Integer> mp2=new HashMap<Character,Integer>();
     for(i=0;i<n-1;i++){ 
       mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
       if(mp.get(s.charAt(i))==0) left-=1;
       if(!(mp2.containsKey(s.charAt(i)))){
    	  mp2.put(s.charAt(i),1);
    	  right+=1;
       }
       if(left==right) ans+=1;
     }
     System.out.println(ans);
     return ans;
	}
	public static void main(String[] args) {
		numSplits("aacaba");
	}

}
