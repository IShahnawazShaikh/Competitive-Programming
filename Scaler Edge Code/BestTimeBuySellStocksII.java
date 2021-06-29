public class BestTimeBuySellStocksII {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
     int i=1,n=A.length;
     if(n==0) return 0;
	   int min=A[0],ans=0;
	   while(i<n){
	  
	    while(i<n && A[i]>A[i-1]) i++;
	   
	    ans+=A[i-1]-min;
	    if(i<n) min=A[i];
	    i+=1;
		 
	 }
	 return ans;        
  }
}
