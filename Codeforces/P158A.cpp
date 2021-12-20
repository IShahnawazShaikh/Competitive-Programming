#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int i,n,k;
cin>>n>>k;
vector<int> v(n);
int zero=0;
int temp=k;
for(i=0;i<n;i++){
  int x;
  cin>>x;
  v[i]=x;
  if(temp){
    if(x<=0) zero+=1;
  	temp-=1;
  }
}

int ans=k;
for(i=k;i<v.size();i++){
	if(v[i]<=0) break;

	if(v[i]>=v[k-1]) ans+=1;
}

cout<<ans-zero;

return 0;	
}