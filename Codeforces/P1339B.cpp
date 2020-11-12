/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){

 int n,i;
 cin>>n;
 vector<ll> v(n);
 for(auto &i:v) cin>>i;
 //for(auto i:v) cout<<i;

 sort(v.begin(),v.end());

 vector<ll> ans;
 for(i=0;i<n/2;i++){
 ans.push_back(v[n-(i+1)]);
 ans.push_back(v[i]);
 }	

 if(n&1) ans.push_back(v[n/2]);

 for(i=n-1;i>=0;i--) cout<<ans[i]<<" ";
cout<<endl;
}
return 0;	
}