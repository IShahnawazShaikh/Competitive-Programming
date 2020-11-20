#include<iostream>
#include<vector>
#include<set>
#include<algorithm>
#include<cmath>
#define ll long long
using namespace std;

/*------Check prime upto 1e6-----------*/

vector<ll> primes;
vector<bool> isPrime;
void seive(){
  isPrime.assign(1e6+1,true);
  ll int i,j;
  for(i=2;i*i<=1e6;i++){
     if(isPrime[i]){
        for(j=i*i;j<=1e6;j+=i){
           isPrime[j]=false;
    }
   }
   }
for(i=2;i<=1e6;i++){
   if(isPrime[i])
      primes.push_back(i);
   }
}

/*--------Prime factors------------*/
set<ll> primeFactors(ll n){
ll p_index=0;
ll pf=primes[p_index];
set<ll> factors;
while(pf*pf<=n){
 while(n%pf==0){
    factors.insert(pf);
    n/=pf;
  }
  pf=primes[++p_index];
}
if(n!=1)
  factors.insert(n);
return factors;
}

int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);  
// calculate prime
seive();
int t;
cin>>t;
while(t--){
ll n;
cin>>n;
set<ll> st=primeFactors(n);
// for(auto i: st)
//     cout<<i<<" ";
bool status=true;
if(st.size()==1){
  ll p=*st.begin();
  ll sz=n/p;
  for(ll i=p+1;i<=sz;i++){
     if(sz%i==0){
        if(sz/i!=p && sz/i!=i && sz/i!=1){
          cout<<"YES"<<endl;
          cout<<p<<" "<<i<<" "<<sz/i<<endl;
          status=false;  
          break;
        }
     }
  }
  if(status) cout<<"NO"<<endl;
}
else{
auto it = st.begin();
advance(it, 0);
int x = *it;
advance(it, 1);
int x2 = *it;
if(n%(x*x2)==0 && n/(x*x2)!=x && n/(x*x2)!=x2 && n/(x*x2)!=1) {
  cout<<"YES"<<endl;
  cout<<x<<" "<<x2<<" "<<n/(x*x2)<<endl;
}
else{
  cout<<"NO"<<endl;
}


}


} 
return 0;
}
