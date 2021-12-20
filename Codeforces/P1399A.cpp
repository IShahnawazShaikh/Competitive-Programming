/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________

     Question link: https://codeforces.com/contest/1399/problem/A
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int n,i;
cin>>n;
vector<int>v(n);
for(i=0;i<n;i++)cin>>v[i];

sort(v.begin(),v.end());

// for(auto i: v)
//   cout<<i<<" ";

bool st=false;
for(i=0;i<n-1;i++){
 if(abs(v[i]-v[i+1])>1){
 	st=true;
 	break;
 }
}
if(st)
  cout<<"NO"<<endl;
else
  cout<<"YES"<<endl;  		 
}
return 0;	
}