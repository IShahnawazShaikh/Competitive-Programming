
public class CountingBits {
	 public static int[] countBits(int num) {
	      int ans[]=new int[num+1];
	      ans[0]=0;
	      int i,cnt=0;
	      for(i=1;i<=num;i++){
	          int t=i;
	          cnt=0;
	         while(t>0){
	            cnt+=1;
	            t=t&(t-1); 
	         }
	         ans[i]=cnt; 
	      }  
	     for(i=0;i<=num;i++) System.out.print(ans[i]+" ");  
	     return ans; 
	    } 
   public static void main(String...x){
	 countBits(6);  
  }
}
