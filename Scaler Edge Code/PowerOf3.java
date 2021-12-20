import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PowerOf3 {
	public static int[] solve(int num) {
	 int cnt;
	 for(cnt=1;cnt<=num;cnt*=3) {}
		// System.out.println(cnt);
		 
	 cnt=cnt/3;
	 
	 System.out.println(cnt);
	
	 ArrayList<Integer> list=new ArrayList<Integer>();
	 while(num!=1) {
	   if(num%cnt==0) {
		   for(int i=1;i<=num/cnt;i++) list.add(cnt);
		   break;
	   }
	   else {
		   for(int i=1;i<=num/cnt;i++) list.add(cnt); 
	   }
	 num%=cnt;	 
	 cnt/=3;	 
	 }
	if(num==1) list.add(1);
	cnt=0;
	int ans[]=new int[list.size()];
	for(int i=list.size()-1;i>=0;i--)ans[cnt++]=list.get(i);
	
	
	for(int i=0;i<list.size();i++) System.out.print(ans[i]+" ");
	return ans;
		
   }

  public static void main(String[] args) {
		solve(20);

  }

}
