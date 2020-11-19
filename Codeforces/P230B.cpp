#include<iostream>
#include<vector>
#include<algorithm>
#include<cmath>
using namespace std;
#define ll long long
vector<bool> isPrime(1e6+3,true);
bool seive(){
 isPrime[1]=false;	
 int i,j;
 for(i=2;i*i<=1e6+2;i++){
    if(isPrime[i]){
    	for(j=i*i;j<1e6+2;j+=i) isPrime[j]=false;
    }
 }
}
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);
seive();
ll i,n;
cin>>n;
for(i=0;i<n;i++){
 ll x;	
 cin>>x;
 ll y=sqrt(x);
 if(y*y==x && isPrime[y]) cout<<"YES"<<endl;
 else cout<<"NO"<<endl;
  
}


return 0;	
}