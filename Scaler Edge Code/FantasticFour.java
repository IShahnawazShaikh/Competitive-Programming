public class FantasticFour {
   public static int solve(int[] ar) {
      int cnt[]=new int[4];  
      int ans=0;
      int i,n=ar.length;
      for(i=0;i<n;i++)  cnt[ar[i]%4]=cnt[ar[i]%4]+1;
      
     // for(i=1;i<4;i++)  System.out.print(cnt[i]+" ");;
      
      if(cnt[1]!=0 && cnt[3]!=0){
    	int mn=Math.min(cnt[1],cnt[3]);
    	ans+=mn;
    	cnt[1]-=mn;
    	cnt[3]-=mn;
    	
    	if(cnt[3]!=0){
    	  int rem=cnt[3]%4;
    	  int t=cnt[3]/4;
    	  cnt[3]-=t*4;
    	  ans+=(t*3);
    	  
    	  if(rem==2){
    		 
    		 if(cnt[2]>0){
    		 ans+=2;
    		 cnt[2]=(cnt[2]-1);
    		  cnt[3]=0; 
    		 }
    		 else return -1;
    		  
    	  }
    	  else return -1;
    		
    	}
    	
       if(cnt[1]!=0){
    	  int rem=cnt[1]%4;
     	  int t=cnt[1]/4;
     	  cnt[1]-=t*4;
     	  ans+=(t*3);
     	 if(rem!=0){
   		  if(rem==2){
        		 
            if(cnt[2]>0){
        	 ans+=2;
        	 cnt[2]=(cnt[2]-1);
             cnt[3]=0; 
           }
          else return -1;		  
         }
        else return -1; 
   	   }  
    	   
      }
    }
    else{
     if(cnt[3]!=0){
     int rem=cnt[3]%4;
     int t=cnt[3]/4;
     cnt[3]-=t*4;
     ans+=(t*3);
  	if(rem!=0){
  	if(rem==2){
	if(cnt[2]>0){
	ans+=2;
	cnt[2]=(cnt[2]-1);
	cnt[3]=0; 
	}
	else return -1;
  	}
  	else return -1; 
  	}    	
  	}
        	
   if(cnt[1]!=0){
   int rem=cnt[1]%4;
    int t=cnt[1]/4;
    cnt[1]-=t*4;
    ans+=(t*3);   	  
    if(rem!=0){
    	 if(rem==2){
    	      if(cnt[2]>0){
    	    	ans+=2;
    	    	cnt[2]=(cnt[2]-1);
    	    	cnt[1]=0; 
    	      }
    	      else return -1;        		  
    	     }     	
    }        	   
    }
   }
      
      if(cnt[2]!=0 && cnt[2]%2==0){
    	  ans+=cnt[2]/2;
    	  cnt[2]=0;
      }

      for(i=1;i<4;i++)    if(cnt[i]!=0) return -1; 
        
     return ans;         
    }
   public static void main(String...x){
    System.out.println(solve(new int[]{3,3,3,3,2,2}));
   
   }
}

