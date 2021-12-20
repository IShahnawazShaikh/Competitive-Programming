#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
vector<ll> findAnswer(vector<ll> &a,vector<ll> &b){
 vector<ll> ans;
 int index;
 for(auto i: b){
  index=lower_bound(a.begin(),a.end(),i)-a.begin();
  if(binary_search(a.begin(),a.end(),i))
  	 ans.push_back(index+1);
   else
     ans.push_back(index);	
  }
  return ans;
}
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int presum=0,i;
int n,m;
cin>>n>>m;
vector<ll> a(n); 
vector<ll> b(m);
for(i=0;i<n;i++){
	int t;
	cin>>t;
	presum+=t;
	a[i]=presum; 
}
for(auto &i : b)cin>>i;
vector<ll> ans=findAnswer(a,b);
cout<<endl;
for(auto i: ans)
	 cout<<i<<" ";
cout<<endl;
}

return 0;	
}
