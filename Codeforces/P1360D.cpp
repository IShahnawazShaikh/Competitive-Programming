#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
vector<ll> factors(ll num){
  int i;
  vector<ll> fact;
  for(i=1;i*i<=num;i++){
     if(num%i==0){
      fact.push_back(i);
      if(i!=num/i) fact.push_back(num/i);	
     }	
  }
  sort(fact.begin(),fact.end());
  return fact;	
}
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
ll n,k;
ll ans=0;
cin>>n>>k;
if(n==k) cout<<1<<endl;
else if(n==1) cout<<1<<endl;
else{
vector<ll> fact=factors(n);
for(auto i: fact){
  if(n/i<=k) {
  	ans=i;
  	break;
  }	
 }  
if(ans) cout<<ans<<endl;
else cout<<n<<endl;
}

}


return 0;	
}