/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
vector<int> primes;
vector<bool> isPrime;
void seive(int num){
  isPrime.assign(num,true);	
  int i,j;
  for(i=2;i*i<=num;i++){
     if(isPrime[i]){
        for(j=i*i;j<=num;j+=i){
           isPrime[j]=false;
		}
	 }
   }
for(i=2;i<=num;i++){
   if(isPrime[i])
	    primes.push_back(i);
   }
}

int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n;
cin>>n;
seive(n);
int i,cnt=0,ans=0;
for(i=6;i<=n;i++){
	 if(!isPrime[6]){
     cnt=0;
     for(auto val: primes){
     	 if(i%val==0)
     	 	cnt+=1;
       }
      if(cnt==2)
       	 ans+=1;
 }
}
cout<<ans;	 
return 0;	
}