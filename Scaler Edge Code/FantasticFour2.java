public class FantasticFour2 {
   public static int solve(int[] ar) {
      int cnt[]=new int[4];  
      int ans=0;
      int i,n=ar.length;
      for(i=0;i<n;i++)  cnt[ar[i]%4]=cnt[ar[i]%4]+1;
       int mn=Math.min(cnt[1],cnt[3]);
       cnt[1]-=mn;
       cnt[3]-=mn;
       ans+=mn;
       
       while(cnt[3]>=2){
    	  ans+=1; 
    	  cnt[2]+=1;
    	  cnt[3]-=2;
       }
       while(cnt[1]>=2){
    	  ans+=1; 
     	  cnt[2]+=1;
     	  cnt[1]-=2;
       }
       if(cnt[2]%2==0){
    	   ans+=cnt[2]/2;
    	   cnt[2]=0;
       }
      if(cnt[1]!=0 || cnt[1]!=0 || cnt[2]!=0) return -1;
      else return ans;         
    }
   public static void main(String...x){
    System.out.println(solve(new int[]{3,3,3,3,2,2}));
   
   }
}

