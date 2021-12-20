import java.util.Arrays;
import java.util.Comparator;
class myComparator implements Comparator <int[]>{
	@Override
	public int compare(int[] a,int[]b) {
		if(a[1]!=b[1]) return a[1]-b[1];
		else return a[0]-b[0];	
	}
}
public class SortByBitII {
 public static int[] sortByBits(int[] arr) {
    int i,n=arr.length;
    int count[][]=new int[n][2];
    
    for(i=0;i<n;i++){
      count[i][0]=arr[i];
      count[i][1]=Integer.bitCount(arr[i]);
    }
    
    Arrays.sort(count,new myComparator());   //customized sorting 
	int ans[]=new int[n];

  for(i=0;i<n;i++){
	ans[i]=count[i][0];  
  }
  for(i=0;i<n;i++) System.out.print(ans[i]+" ");
  return ans;	        
 }  
public static void main(String[] args) {
	sortByBits(new int[]{2,3,5,7,11,13,17,19});	

	}

}
