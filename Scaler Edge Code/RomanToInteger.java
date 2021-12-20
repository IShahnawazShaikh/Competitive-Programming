import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String A) {
     int ans=0;
     Map<Character,Integer> values=new HashMap<>();
     Map<Character,Integer> order=new HashMap<>();
     initialiazeMap(values,order);
     int i,n=A.length();
     char ch=A.charAt(n-1);
     ans=values.get(ch);
     for(i=n-2;i>=0;i--){
       if(order.get(ch)<=order.get(A.charAt(i))){
    	 ans+=values.get(A.charAt(i));  
       }
       else{
    	   ans-=values.get(A.charAt(i));   
       }
      ch=A.charAt(i);	 
    	 
     }
     System.out.println(ans);
    	
     return ans;	
    }
	private static void initialiazeMap(Map<Character, Integer> values, Map<Character, Integer> order) {
	 values.put('I',1);
	 values.put('V',5);
	 values.put('X',10);
	 values.put('L',50);
	 values.put('C',100);
	 values.put('D',500);
	 values.put('M',1000);
	 
	 order.put('I',1);
	 order.put('V',2);
	 order.put('X',3);
	 order.put('L',4);
	 order.put('C',5);
	 order.put('D',6);
	 order.put('M',7);
		
	}
	public static void main(String[] args) {
		romanToInt("MCMXCIV");

	}

}
