
public class DecodeXoredArray {
  public static int[] decode(int[] encoded, int first) {
	 int i,n=encoded.length;
	 int ans[]=new int[n+1];
	 ans[0]=first;
	 for(i=0;i<n;i++){
		ans[i+1]=encoded[i]^first;
		first=ans[i+1];
	 }
	  
	 for(i=0;i<n+1;i++) System.out.print(ans[i]+" "); 
	  
	  
	
	return new int[]{1,2,3};
  }
  public static void main(String...x){
	  decode(new int[]{1,2,3},1);
  }
}
