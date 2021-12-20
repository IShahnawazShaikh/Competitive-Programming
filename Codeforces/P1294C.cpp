#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
vector<ll> factors(ll num){
  int i;
  vector<ll> fact;
  for(i=2;i*i<=num;i++){
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
int i,t;
cin>>t;
while(t--){
ll n;
cin>>n;

vector<ll> fact=factors(n);
 
bool st=true;
if(fact.size()>=3){
for(i=1;i<fact.size();i++){

  if(n%(fact[0]*fact[i])==0){

   ll p=n/(fact[0]*fact[i]);
  if(binary_search(fact.begin(),fact.end(),p) && p!=fact[0] && p!=fact[i]){
   cout<<"YES"<<endl;
   cout<<fact[0]<<" "<<fact[i]<<" "<<p<<endl;
   st=false;
   break;
  }   
 }
}
if(st) cout<<"NO"<<endl;
}
else cout<<"NO"<<endl;

}
return 0;	
}