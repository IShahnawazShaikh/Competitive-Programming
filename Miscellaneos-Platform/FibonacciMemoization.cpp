#include<bits/stdc++.h>
using namespace std;
#define int int64_t
vector<int> dp(1e6,0);
int fib(int n){
	if(n==1 || n==0) return 1;
     //trace(n-1,n-2);
	if(dp[n]>1) return dp[n];
	int ans=fib(n-1)+fib(n-2);
	return ans;
}
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
cout<<fib(5);
return 0;	
}
