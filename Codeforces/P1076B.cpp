/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
#include<cmath>
#define ll long long
using namespace std;

/*------Check prime upto 1e6-----------*/

vector<ll int> primes;
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

/*------Check prime > 1e6-----------*/
bool checkPrime(ll int n){
  if(n<=1e6)
    return isPrime[n];
  for(auto i: primes){
     if(i > sqrt(n))
      return true;
     if(n%i==0)
      return false;
  }
  return true;

}
/*--------Prime factors------------*/
ll int primeFactors(ll int n){
ll int p_index=0;
ll int pf=primes[p_index];
vector<ll int> factors;
while(pf*pf<=n){
 if(n%pf==0)
    return pf;
  pf=primes[++p_index];
 }
if(n!=1)
 return n;
}



int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);  

ll int n;
cin>>n;
if(n&1^1){
  cout<<n/2;
  return 0;
}
seive();
cout<<1+(n-primeFactors(n))/2;
return 0;
}
