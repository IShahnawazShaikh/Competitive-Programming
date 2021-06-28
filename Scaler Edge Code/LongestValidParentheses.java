class  LongestValidParentheses {
    public int longestValidParentheses(String A) {
     int i,n=A.length();
     int[] dp=new int[n];

     for(i=1;i<n;i++){
      if(A.charAt(i)=='('){
        dp[i]=0;  
      }
      else{
        if(i-dp[i-1]-1>=0 && A.charAt(i-dp[i-1]-1)=='('){
          if(i-dp[i-1]-2>=0){
              dp[i]=2+dp[i-1]+dp[i-dp[i-1]-2];
          }
          else dp[i]=2+dp[i-1];
        } 
      }
     }
     int mx=0; 
     for(i=0;i<n;i++){
        mx=Math.max(dp[i],mx); 
     }
     return mx;        
    }
}
