import java.util.Arrays;

public class EqualByReversingSubarrays {
  public static boolean canBeEqual(int[] target, int[] arr) {
	Arrays.sort(arr);
	Arrays.sort(target);
	int i;
	for(i=0;i<arr.length;i++) {
	 if(arr[i]!=target[i]) return false;	
	}
	return true;
	        
   }
	public static void main(String[] args) {
         int ar[]= {3,7,9};
         int target[]= {3,7,11};
		System.out.println(canBeEqual(target,ar));	

	}

}
