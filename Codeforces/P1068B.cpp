#include<iostream>
#include<algorithm>
using namespace std;
#define ll long long


int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
ll num;
cin>>num;
ll ans=0;
for(ll i=1;i*i<=num;i++){
   if(num%i==0){
    ans+=1;
    if(i!=num/i) ans+=1;
  }
}
cout<<ans;
return 0;	
}