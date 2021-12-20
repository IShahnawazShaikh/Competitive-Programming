#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int n,i;
cin>>n;
vector<int> v(2*n);
for(auto &x: v) cin>>x;
vector<int> ans;
vector<bool> check(n+1,true);
for(i=0;i<2*n;i++){
if(check[v[i]]){
	ans.push_back(v[i]);
	check[v[i]]=false;
}
}
for(auto i: ans) cout<<i<<" "; 	
cout<<endl;
}
return 0;	
}