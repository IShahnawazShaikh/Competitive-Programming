//Not done
import java.util.Arrays;
public class ThreeSum {
	   public static int threeSumClosest(int[] A, int B) {
		     int ans=0,i,n=A.length;
		     Arrays.sort(A);
		     int p1=0,p2=n-1;
		     int diff=Math.abs(A[0]+A[1]+A[p2]-B);
		     for(i=0;i<n-2;i++) {
		        p1=i+1;
		        p2=n-1;
		        while(p1< p2){
		           if(Math.abs(A[i]+A[p1]+A[p2]-B) <= diff){
		               diff=Math.abs(A[i]+A[p1]+A[p2]-B);
		               ans=A[i]+A[p1]+A[p2];
		              // System.out.println(A[i]+" "+A[p1]+" "+A[p2]);
		            }
		            if((A[i]+A[p1]+A[p2]-B)<0){
		              p1++;     
		             
		            }   
		            else  p2--;    
		            
		            
		        }
		        
		     }
		     System.out.println(ans);
		     return ans;
		    }
	public static void main(String[] args) {
     threeSumClosest(new int[]{5, -2, -1, -10, 10},5);

	}

}
