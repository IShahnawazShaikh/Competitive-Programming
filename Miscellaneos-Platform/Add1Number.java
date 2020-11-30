import java.util.ArrayList;
import java.util.Collections;

public class Add1Number {

	public static void main(String[] args) {
	
		int ar[]= {9,9,9,0};
		
		int ar2[]=solve(ar);
	for(int i=0;i<ar2.length;i++) System.out.print(ar2[i]+" ");

	}

	
	private static int[] solve(int ar[]) {
	int i;
	int n=ar.length;
	ArrayList<Integer> al=new ArrayList<Integer>();
	Boolean b=true;
	int leadingZeroes=0;
	for(i=0;i<n;i++) {
		if(ar[i]==0) leadingZeroes+=1;
		else break;
	}
	for(i=n-1;i>=0+leadingZeroes;i--) {
     if(ar[i]==9 && b) {
    	 al.add(0);
     }
     else if(b){
    	 al.add(ar[i]+1);
    	 b=false;
     }
     else al.add(ar[i]);
     
 	}
	if(b) al.add(1);
	int ans[]=new int[al.size()];
	n=0;
	for(i=al.size()-1;i>=0;i--) {
		ans[n]=(int)al.get(i);
		n+=1;
	}
	return ans;
 }

}
