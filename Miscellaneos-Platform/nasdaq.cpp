#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int i,n;
cin>>n;
vector<int> v(n);
for(auto &i: v)cin>>i;
sort(v.begin(),v.end());
int ans=0;	
int p=v.size()-1-2;
for(i=0;i<n/4;i++){
  ans+=v[p];
  p-=3;
}	
cout<<ans;

return 0;	
}