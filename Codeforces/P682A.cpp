#include<iostream>
#include<map>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int i,n,m;
cin>>n>>m;
map<int,int> mp;

for(i=1;i<=n;i++) mp[i%5]++; 

int ans=0;

for(i=1;i<=m;i++) ans+=mp[(5-(i%5))%5];

cout<<ans;




return 0;	
}