class BestTimeBuySellStocksI {
    public int maxProfit(int[] prices) {
     int i,n=prices.length; 

     int ans=0,mn=prices[0];
    
     for(i=1;i<n;i++){
      ans=Math.max(prices[i]-mn,ans);     
      if(prices[i]<mn) mn=prices[i];    
     }
     return ans;        
    }
}
