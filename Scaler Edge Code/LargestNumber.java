import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class myComparator implements Comparator{

	@Override
	public int compare(Object a, Object b) {
	  String first=a.toString();
	  String second=b.toString();
	  return (a+""+b).compareTo(b+""+a);
	}
}
public class LargestNumber {
	 public static String largestNumber(ArrayList<Integer> A) {
		 int i,n=A.size();
		 List<String> sList=new ArrayList<String>();
		 for(i=0;i<n;i++) sList.add(A.get(i)+"");
		 
		 Collections.sort(sList,(a,b)->(a+""+b).compareTo(b+""+a));
		 
		 String ans="";
		 
		 for(i=n-1;i>=0;i--) ans+=sList.get(i);
		 
	     return  ans.charAt(0)=='0' ? "0" : ans;  
	}
	public static void main(String[] args) {
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 al.add(3);
		 al.add(30);
		 al.add(34);
		 al.add(5);
		 al.add(9);
		 
		System.out.println(largestNumber(al));
	}

}
